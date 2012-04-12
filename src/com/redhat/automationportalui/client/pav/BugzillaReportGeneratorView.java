package com.redhat.automationportalui.client.pav;

import java.net.URLEncoder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.redhat.automationportalui.client.AutomationPortalUIClientFactory;
import com.redhat.automationportalui.client.AutomationPortalUIConstants;
import com.redhat.automationportalui.client.data.AutomationPortalResponseData;
import com.redhat.automationportalui.client.resources.APUI_Errors;
import com.redhat.automationportalui.client.resources.BugzillaReportGeneratorUIStrings;
import com.redhat.automationportalui.client.resources.CommonUIStrings;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;

public class BugzillaReportGeneratorView
{
	private final static String REST_ENDPOINT = "rest/BugzillaReportGenerator/get/json";
	private final BugzillaReportGeneratorUIStrings uiStrings;
	private final CommonUIStrings commonUiStrings;
	private TextBox bugzillaUsername;
	private TextBox bugzillaPassword; 
	private TextBox message;
	private TextArea output;

	public BugzillaReportGeneratorView(final AutomationPortalUIClientFactory clientFactory, final CommonUIStrings commonUiStrings, final APUI_Errors apuiErrors)
	{
		/* Get the translates log messages */
		uiStrings = (BugzillaReportGeneratorUIStrings) GWT.create(BugzillaReportGeneratorUIStrings.class);
		this.commonUiStrings = commonUiStrings;
	}

	public void display(final AcceptsOneWidget panel)
	{
		final VerticalPanel topLevelPanel = new VerticalPanel();

		topLevelPanel.add(new Label(uiStrings.Description()));
		
		bugzillaUsername = new TextBox();
		topLevelPanel.add(bugzillaUsername);
		
		bugzillaPassword = new TextBox();
		topLevelPanel.add(bugzillaPassword);
		
		message = new TextBox();
		message.setReadOnly(true);
		topLevelPanel.add(message);
		
		output = new TextArea();
		output.setReadOnly(true);
		topLevelPanel.add(output);
		
		final PushButton go = new PushButton(commonUiStrings.Go());
		go.addClickHandler(new ClickHandler(){
			@Override
			public void onClick(final ClickEvent event)
			{
				run();
			}
		});
		topLevelPanel.add(go);
		
		panel.setWidget(topLevelPanel);
	}

	private void run()
	{
		final String username = bugzillaUsername.getText();
		final String password = bugzillaPassword.getText();
		
		final String restUrl = AutomationPortalUIConstants.REST_SERVER_URL + REST_ENDPOINT + "?bugzillaUsername=" + URL.encode(username) + "&bugzillaPassword=" + URL.encode(password); 
		
		// Send request to server and catch any errors.
		final RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, restUrl);

		try
		{
			builder.sendRequest(null, new RequestCallback()
			{
				public void onError(final Request request, final Throwable exception)
				{
					// displayError("Couldn't retrieve JSON");
				}

				public void onResponseReceived(final Request request, final Response response)
				{
					if (200 == response.getStatusCode())
					{
						final String jsonResponse = response.getText();
						final AutomationPortalResponseData responseData = asAutomationPortalResponseData(jsonResponse);
						message.setText(responseData.getMessage());
						output.setText(responseData.getOutput());
					}
					else
					{
						// displayError("Couldn't retrieve JSON (" +
						// response.getStatusText() + ")");
					}
				}
			});
		}
		catch (final RequestException ex)
		{
			// displayError("Couldn't retrieve JSON");
		}
	}

	private final native AutomationPortalResponseData asAutomationPortalResponseData(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}
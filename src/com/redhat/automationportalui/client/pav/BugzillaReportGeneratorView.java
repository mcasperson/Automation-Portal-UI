package com.redhat.automationportalui.client.pav;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.redhat.automationportalui.client.AutomationPortalUIClientFactory;
import com.redhat.automationportalui.client.AutomationPortalUIConstants;
import com.redhat.automationportalui.client.data.AutomationPortalResponseData;
import com.redhat.automationportalui.client.resources.APUI_Errors;
import com.redhat.automationportalui.client.resources.BugzillaReportGeneratorUIStrings;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;

public class BugzillaReportGeneratorView
{
	private final static String REST_ENDPOINT = "rest/BugzillaReportGenerator/get/json";
	private final BugzillaReportGeneratorUIStrings uiStrings;

	public BugzillaReportGeneratorView(final AutomationPortalUIClientFactory clientFactory, final APUI_Errors apuiErrors)
	{
		/* Get the translates log messages */
		uiStrings = (BugzillaReportGeneratorUIStrings) GWT.create(BugzillaReportGeneratorUIStrings.class);
	}

	public void display(final AcceptsOneWidget panel)
	{
		final VerticalPanel topLevelPanel = new VerticalPanel();

		topLevelPanel.add(new Label(uiStrings.Description()));

		panel.setWidget(topLevelPanel);
	}

	private void run()
	{
		// Send request to server and catch any errors.
		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, AutomationPortalUIConstants.REST_SERVER_URL + REST_ENDPOINT);

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
						final AutomationPortalResponseData responseData = asAutomationPortalResponseData(response.getText());
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
		return eval(json);
	}-*/;
}
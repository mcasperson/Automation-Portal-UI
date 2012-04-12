package com.redhat.automationportalui.client.pav;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.redhat.automationportalui.client.AutomationPortalUIClientFactory;
import com.redhat.automationportalui.client.resources.APUI_Errors;
import com.redhat.automationportalui.client.resources.BugzillaReportGeneratorUIStrings;

public class BugzillaReportGeneratorView
{
	final BugzillaReportGeneratorUIStrings uiStrings;
	
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
}
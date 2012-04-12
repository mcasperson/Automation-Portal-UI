package com.redhat.automationportalui.client.data;

public class AutomationPortalResponseDataFactory
{
	public static final native AutomationPortalResponseData asAutomationPortalResponseData(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JavaScriptObject;

public final class AutomationPortalResponseData extends JavaScriptObject
{
	public final native String getMessage()
	/*-{
		return message;
	}-*/;

	public final native String getOutput()
	/*-{
		return output;
	}-*/;

	protected AutomationPortalResponseData()
	{
		
	}
}

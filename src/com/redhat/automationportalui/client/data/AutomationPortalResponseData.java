package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JavaScriptObject;

public final class AutomationPortalResponseData extends JavaScriptObject
{
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;

	public final native String getOutput()
	/*-{
		return this.output;
	}-*/;

	protected AutomationPortalResponseData()
	{
		
	}
	
	public static final native AutomationPortalResponseData convert(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

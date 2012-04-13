package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *	An overlay for the respose data sent back by the REST server
 */
public final class AutomationPortalResponseData extends JavaScriptObject
{
	/**
	 * 
	 * @return Any system messages (like validation issues) sent back by the REST Server
	 */
	public final native String getMessage()
	/*-{
		return this.message;
	}-*/;

	/**
	 * 
	 * @return The StdOut respose of the script that was run
	 */
	public final native String getOutput()
	/*-{
		return this.output;
	}-*/;

	protected AutomationPortalResponseData()
	{
		
	}
	
	/**
	 * 
	 * @param json The JSON representation of a AutomationPortalResponseData object
	 * @return The AutomationPortalResponseData class populated by the JSON input
	 */
	public static final native AutomationPortalResponseData convert(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
/**
 *	An overlay for the String pair values sent back by the REST server
 */
public final class StringPair extends JavaScriptObject
{
	/**
	 * 
	 * @return The first string
	 */
	public final native String getFirstString()
	/*-{
		return this.firstString;
	}-*/;

	/**
	 * 
	 * @return The second string
	 */
	public final native String getSecondString()
	/*-{
		return this.secondString;
	}-*/;

	protected StringPair()
	{
		
	}
	
	/**
	 * 
	 * @param json The JSON representation of a StringPair object
	 * @return The StringPair class populated by the JSON input
	 */
	public static final native StringPair convert(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
	
	/**
	 * 
	 * @param json The JSON representation of an array of StringPair objects
	 * @return An array of StringPair objects populated by the JSON input
	 */
	public static final native JsArray<StringPair> convertList(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

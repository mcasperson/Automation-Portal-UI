package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JsArrayString;

/**
 * This class just provides a way to convert an array of strings into a Java object
 */
public class StringList
{
	/**
	 * @param json The JSON representation of an array of Strings
	 * @return An array of Strings populated from the JSON input
	 */
	public static final native JsArrayString convertList(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

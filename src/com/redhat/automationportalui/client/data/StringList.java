package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JsArrayString;

public class StringList
{
	public static final native JsArrayString convertList(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

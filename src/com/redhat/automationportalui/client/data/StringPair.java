package com.redhat.automationportalui.client.data;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public final class StringPair extends JavaScriptObject
{
	public final native String getFirstString()
	/*-{
		return this.firstString;
	}-*/;

	public final native String getSecondString()
	/*-{
		return this.secondString;
	}-*/;

	protected StringPair()
	{
		
	}
	
	public static final native StringPair convert(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
	
	public static final native JsArray<StringPair> convertList(final String json) 
	/*-{
		return eval('(' + json + ')');
	}-*/;
}

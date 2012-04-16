package com.redhat.automationportalui.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

public class ConfigXMLData extends JavaScriptObject
{
	public static native ConfigXMLData createConfigXMLData()
	/*-{
		return eval('({"fromDate":new Date(),"path":"","entry":""})');
	}-*/;
	
	protected ConfigXMLData()
	{

	}

	public native final JsDate getFromDate()
	/*-{
		return this.fromDate;
	}-*/;

	public native final void setFromDate(final JsDate fromDate)
	/*-{
		this.fromDate = fromDate;
	}-*/;

	public native final String getPath()
	/*-{
		return this.path;
	}-*/;

	public native final void setPath(final String path)
	/*-{
		this.path = path;
	}-*/;

	public native final String getEntry()
	/*-{
		return this.entry;
	}-*/;

	public native final void setEntry(final String entry)
	/*-{
		this.entry = entry;
	}-*/;
}
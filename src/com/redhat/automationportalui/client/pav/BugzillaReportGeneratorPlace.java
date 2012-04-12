package com.redhat.automationportalui.client.pav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class BugzillaReportGeneratorPlace extends Place
{
	public BugzillaReportGeneratorPlace()
	{
		
	}
	
	public static class Tokenizer implements PlaceTokenizer<BugzillaReportGeneratorPlace>
	{
		@Override
		public String getToken(final BugzillaReportGeneratorPlace place)
		{
			return "";
		}

		@Override
		public BugzillaReportGeneratorPlace getPlace(final String token)
		{
			/* return an initialized place */
			final BugzillaReportGeneratorPlace retValue = new BugzillaReportGeneratorPlace();
			return retValue;
		}
	}

}

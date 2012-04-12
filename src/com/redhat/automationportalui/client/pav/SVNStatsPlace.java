package com.redhat.automationportalui.client.pav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SVNStatsPlace extends Place
{
	public SVNStatsPlace()
	{
		
	}
	
	public static class Tokenizer implements PlaceTokenizer<SVNStatsPlace>
	{
		@Override
		public String getToken(final SVNStatsPlace place)
		{
			return "";
		}

		@Override
		public SVNStatsPlace getPlace(final String token)
		{
			/* return an initialized place */
			final SVNStatsPlace retValue = new SVNStatsPlace();
			return retValue;
		}
	}

}

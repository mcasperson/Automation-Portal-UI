package com.redhat.automationportalui.client.pav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * A GWT Place that represents the state of the Bugzilla Report Generator View
 */
public class FlagSearchPlace extends Place
{
	public FlagSearchPlace()
	{
		
	}
	
	public static class Tokenizer implements PlaceTokenizer<FlagSearchPlace>
	{
		@Override
		public String getToken(final FlagSearchPlace place)
		{
			return "";
		}

		@Override
		public FlagSearchPlace getPlace(final String token)
		{
			/* return an initialized place */
			final FlagSearchPlace retValue = new FlagSearchPlace();
			return retValue;
		}
	}

}

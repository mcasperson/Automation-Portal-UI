package com.redhat.automationportalui.client.pav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * A GWT Place that represents the state of the RegenSplash View
 */
public class RegenSplashPlace extends Place
{
	public RegenSplashPlace()
	{
		
	}
	
	public static class Tokenizer implements PlaceTokenizer<RegenSplashPlace>
	{
		@Override
		public String getToken(final RegenSplashPlace place)
		{
			return "";
		}

		@Override
		public RegenSplashPlace getPlace(final String token)
		{
			/* return an initialized place */
			final RegenSplashPlace retValue = new RegenSplashPlace();
			return retValue;
		}
	}

}

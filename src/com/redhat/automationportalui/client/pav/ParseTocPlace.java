package com.redhat.automationportalui.client.pav;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * A GWT Place that represents the state of the ParseTOC View
 */
public class ParseTocPlace extends Place
{
	public ParseTocPlace()
	{
		
	}
	
	public static class Tokenizer implements PlaceTokenizer<ParseTocPlace>
	{
		@Override
		public String getToken(final ParseTocPlace place)
		{
			return "";
		}

		@Override
		public ParseTocPlace getPlace(final String token)
		{
			/* return an initialized place */
			final ParseTocPlace retValue = new ParseTocPlace();
			return retValue;
		}
	}

}

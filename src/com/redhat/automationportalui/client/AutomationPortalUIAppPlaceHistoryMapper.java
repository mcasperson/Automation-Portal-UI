package com.redhat.automationportalui.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorPlace;
import com.redhat.automationportalui.client.pav.ParseTocPlace;
import com.redhat.automationportalui.client.pav.RegenSplashPlace;
import com.redhat.automationportalui.client.pav.SVNStatsPlace;

/**
 * TopikaAppPlaceHistoryMapper declares all the GWT Places available in Topika.
 * See https://developers.google.com/web-toolkit/doc/latest/
 * DevGuideMvpActivitiesAndPlaces#PlaceHistoryMapper
 * 
 * @author Matthew Casperson
 */
@WithTokenizers({ 
	BugzillaReportGeneratorPlace.Tokenizer.class,
	ParseTocPlace.Tokenizer.class,
	SVNStatsPlace.Tokenizer.class,
	RegenSplashPlace.Tokenizer.class
})
public interface AutomationPortalUIAppPlaceHistoryMapper extends PlaceHistoryMapper
{

}

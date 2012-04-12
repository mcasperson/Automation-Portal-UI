package com.redhat.automationportalui.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorView;
import com.redhat.automationportalui.client.resources.APUI_Errors;
import com.redhat.automationportalui.client.resources.CommonUIStrings;

/**
 * See https://developers.google.com/web-toolkit/doc/latest/
 * DevGuideMvpActivitiesAndPlaces#ClientFactory
 * 
 * @author Matthew Casperson
 */
public interface AutomationPortalUIClientFactory
{
	PlaceController getPlaceController();

	EventBus getEventBus();
	
	BugzillaReportGeneratorView getBugzillaReportGeneratorView();
	
	public void initialise(final CommonUIStrings commonUiStrings, final APUI_Errors apuiErrors);
}

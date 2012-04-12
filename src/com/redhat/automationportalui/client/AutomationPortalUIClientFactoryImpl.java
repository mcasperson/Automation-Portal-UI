package com.redhat.automationportalui.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorView;
import com.redhat.automationportalui.client.resources.APUI_Errors;

public class AutomationPortalUIClientFactoryImpl implements AutomationPortalUIClientFactory
{
	private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController placeController = new PlaceController(eventBus);
    
    private BugzillaReportGeneratorView bugzillaReportGeneratorView;
    
	@Override
	public PlaceController getPlaceController()
	{
		return placeController;
	}

	@Override
	public EventBus getEventBus()
	{
		return eventBus;
	}

	@Override
	public BugzillaReportGeneratorView getBugzillaReportGeneratorView()
	{
		return bugzillaReportGeneratorView;
	}

	@Override
	public void initialise(APUI_Errors apuiErrors)
	{
		bugzillaReportGeneratorView = new BugzillaReportGeneratorView(this, apuiErrors);
		
	}

}

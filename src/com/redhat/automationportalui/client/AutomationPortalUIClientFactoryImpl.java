package com.redhat.automationportalui.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorView;
import com.redhat.automationportalui.client.pav.FlagSearchView;
import com.redhat.automationportalui.client.pav.RegenSplashView;
import com.redhat.automationportalui.client.pav.SVNStatsView;
import com.redhat.automationportalui.client.resources.APUI_Errors;
import com.redhat.automationportalui.client.resources.CommonUIStrings;
import com.redhat.automationportalui.client.template.AutomationPortalUITemplate;

public class AutomationPortalUIClientFactoryImpl implements AutomationPortalUIClientFactory
{
	private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController placeController = new PlaceController(eventBus);
    
    private BugzillaReportGeneratorView bugzillaReportGeneratorView;
    private SVNStatsView svnStatsView;
    private RegenSplashView regenSplashView;
    private FlagSearchView flagSearchView;
    
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
	public void initialise(final AutomationPortalUITemplate template, final CommonUIStrings commonUiStrings, final APUI_Errors apuiErrors)
	{
		bugzillaReportGeneratorView = new BugzillaReportGeneratorView(this, template, commonUiStrings, apuiErrors);
		svnStatsView = new SVNStatsView(this, template, commonUiStrings, apuiErrors);
		regenSplashView = new RegenSplashView(this, template, commonUiStrings, apuiErrors);
		flagSearchView = new FlagSearchView(this, template, commonUiStrings, apuiErrors);
	}

	@Override
	public SVNStatsView getSVNStatsView()
	{
		return svnStatsView;
	}

	@Override
	public RegenSplashView getRegenSplashView()
	{
		return regenSplashView;
	}

	@Override
	public FlagSearchView getFlagSearchView()
	{
		return flagSearchView;
	}

}

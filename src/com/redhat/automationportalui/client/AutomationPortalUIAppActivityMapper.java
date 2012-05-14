package com.redhat.automationportalui.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorActivity;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorPlace;
import com.redhat.automationportalui.client.pav.FlagSearchActivity;
import com.redhat.automationportalui.client.pav.FlagSearchPlace;
import com.redhat.automationportalui.client.pav.RegenSplashActivity;
import com.redhat.automationportalui.client.pav.RegenSplashPlace;
import com.redhat.automationportalui.client.pav.SVNStatsActivity;
import com.redhat.automationportalui.client.pav.SVNStatsPlace;

/**
 * This class maps each Place to its corresponding Activity. See
 * https://developers
 * .google.com/web-toolkit/doc/latest/DevGuideMvpActivitiesAndPlaces
 * #ActivityMapper
 * 
 * @author Matthew Casperson
 * 
 */
public class AutomationPortalUIAppActivityMapper implements ActivityMapper
{
	final AutomationPortalUIClientFactory clientFactory;

	public AutomationPortalUIAppActivityMapper(final AutomationPortalUIClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(final Place place)
	{
		if (place instanceof BugzillaReportGeneratorPlace)
			return new BugzillaReportGeneratorActivity((BugzillaReportGeneratorPlace) place, clientFactory);
		
		if (place instanceof SVNStatsPlace)
			return new SVNStatsActivity((SVNStatsPlace) place, clientFactory);
		
		if (place instanceof RegenSplashPlace)
			return new RegenSplashActivity((RegenSplashPlace) place, clientFactory);
		
		if (place instanceof FlagSearchPlace)
			return new FlagSearchActivity((FlagSearchPlace) place, clientFactory);
		
		return null;
	}

}

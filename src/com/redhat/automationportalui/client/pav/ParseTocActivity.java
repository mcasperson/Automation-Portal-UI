package com.redhat.automationportalui.client.pav;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.redhat.automationportalui.client.AutomationPortalUIClientFactory;


public class ParseTocActivity extends AbstractActivity
{
	private final AutomationPortalUIClientFactory clientFactory;
	
	public ParseTocActivity(final ParseTocPlace place, final AutomationPortalUIClientFactory clientFactory)
	{
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus)
	{
		clientFactory.getParseTocView().display();
	}
}

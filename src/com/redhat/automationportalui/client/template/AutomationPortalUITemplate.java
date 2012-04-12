package com.redhat.automationportalui.client.template;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.redhat.automationportalui.client.AutomationPortalUIAppPlaceHistoryMapper;
import com.redhat.automationportalui.client.pav.BugzillaReportGeneratorPlace;
import com.redhat.automationportalui.client.pav.ParseTocPlace;
import com.redhat.automationportalui.client.pav.SVNStatsPlace;
import com.redhat.automationportalui.client.resources.CommonUIStrings;
import com.redhat.automationportalui.client.resources.ImageResources;

/**
 * This class builds the base UI into which the other GWT Views will add their
 * UI components.
 */
public class AutomationPortalUITemplate
{
	/** The planel that the views will add their content to */
	final private SimplePanel contentPanel;
	/** A reference to the common translated strings */
	final private CommonUIStrings commonUiStrings;
	/** The panel that will hold the links to the various views */
	final private VerticalPanel linksVerticalPanel;
	/** The subtitle applied to the page */
	private final Label subTitle;
	/** The panel that holds the subtitle and loading image */
	private final HorizontalPanel subtitlePanel;
	/** Images */
	private final ImageResources imageResources;
	/** An image to be displayed when the page is loading */
	private final Image loadingImage;
	
	public Label getSubTitle()
	{
		return subTitle;
	}

	public SimplePanel getContentPanel()
	{
		return contentPanel;
	}
	
	public AutomationPortalUITemplate(final CommonUIStrings commonUiStrings)
	{
		this.commonUiStrings = commonUiStrings;
		
		this.imageResources = GWT.create(ImageResources.class);
		loadingImage = new Image(this.imageResources.waitImage());
		
		final VerticalPanel verticalPanel = new VerticalPanel();
		
		final Label heading = new Label(commonUiStrings.AutomationPortal());
		heading.getElement().getStyle().setFontSize(4, Unit.EM);
		heading.getElement().getStyle().setMargin(0.5, Unit.EM);
		verticalPanel.add(heading);
		
		subtitlePanel = new HorizontalPanel();
		verticalPanel.add(subtitlePanel);
		
		subTitle = new Label();
		subTitle.getElement().getStyle().setFontSize(2, Unit.EM);
		subTitle.getElement().getStyle().setMarginLeft(1, Unit.EM);
		subTitle.getElement().getStyle().setMarginRight(1, Unit.EM);
		subTitle.getElement().getStyle().setMarginBottom(1, Unit.EM);
		subtitlePanel.add(subTitle);
		
		final HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel.add(horizontalPanel);
		
		linksVerticalPanel = new VerticalPanel();
		linksVerticalPanel.getElement().getStyle().setMarginLeft(2, Unit.EM);
		linksVerticalPanel.getElement().getStyle().setMarginRight(2, Unit.EM);
		horizontalPanel.add(linksVerticalPanel);
		
		contentPanel = new SimplePanel();
		horizontalPanel.add(contentPanel);
		
		buildLinks();
		
		/* Add the template to the page */
		final RootPanel rootPanel = RootPanel.get();
		rootPanel.add(verticalPanel);	
	}
	
	private void buildLinks()
	{
		final AutomationPortalUIAppPlaceHistoryMapper placeHistoryMapper = GWT.create(AutomationPortalUIAppPlaceHistoryMapper.class);
		
		linksVerticalPanel.add(new Hyperlink(commonUiStrings.BugzillaReportGenerator(), placeHistoryMapper.getToken(new BugzillaReportGeneratorPlace())));
		linksVerticalPanel.add(new Hyperlink(commonUiStrings.ParseTOC(), placeHistoryMapper.getToken(new ParseTocPlace())));
		linksVerticalPanel.add(new Hyperlink(commonUiStrings.SVNStats(), placeHistoryMapper.getToken(new SVNStatsPlace())));
	}
	
	public void showLoadingImage(final boolean show)
	{
		if (show)
			this.subtitlePanel.add(this.loadingImage);
		else
			this.subtitlePanel.remove(this.loadingImage);
	}
}

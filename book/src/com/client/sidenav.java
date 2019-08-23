package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialSideNavDrawer;

public class sidenav extends Composite  {

	private static sidenavUiBinder uiBinder = GWT.create(sidenavUiBinder.class);

	interface sidenavUiBinder extends UiBinder<Widget, sidenav> {
	}

	public sidenav() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	MaterialHeader header;
	@UiField
	MaterialSideNavDrawer sideNav;
	

}

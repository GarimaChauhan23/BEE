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

import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRadioButton;

public class meetup extends Composite  {

	private static meetupUiBinder uiBinder = GWT.create(meetupUiBinder.class);

	interface meetupUiBinder extends UiBinder<Widget, meetup> {
	}

	public meetup() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	

	


}

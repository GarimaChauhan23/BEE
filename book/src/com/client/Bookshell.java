package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

public class Bookshell extends Composite  {

	private static BookshellUiBinder uiBinder = GWT.create(BookshellUiBinder.class);

	interface BookshellUiBinder extends UiBinder<Widget, Bookshell> {
	}

	public Bookshell() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	MaterialButton b1;
	@UiField
	MaterialButton b2;
	@UiField
	MaterialButton b3;
	@UiField
	MaterialButton b4;
	@UiField
	MaterialButton b5;
	@UiField
	MaterialButton b6;
	@UiField
	MaterialButton b7;
	@UiField
	MaterialButton b8;

	@UiHandler("b1")
	void onClick(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b2")
	void onClick1(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b3")
	void onClick2(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b4")
	void onClick3(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b5")
	void onClick4(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b6")
	void onClick5(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b7")
	void onClick6(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
	@UiHandler("b8")
	void onClick7(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
	}
}

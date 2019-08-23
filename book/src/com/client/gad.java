package com.client;

import java.util.concurrent.atomic.AtomicInteger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
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

public class gad extends Composite {
	
	public static AtomicInteger c = new AtomicInteger(363454);
	public static int jobID;

	private static gadUiBinder uiBinder = GWT.create(gadUiBinder.class);

	interface gadUiBinder extends UiBinder<Widget, gad> {
	}

	public gad() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
	}

	@UiField
	MaterialButton b1;
	MaterialButton b2;
	MaterialButton b3;
	MaterialButton b4;
	MaterialButton b5;
	MaterialButton b6;
	MaterialButton b7;
	MaterialButton b8;

	@UiHandler("b1")
	void onClick(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
		
	}
	@UiHandler("b2")
	void onClick1(ClickEvent e) {
		//RootPanel.get("r2").clear();
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}
	@UiHandler("b3")
	void onClick2(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}
	@UiHandler("b4")
	void onClick3(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}
	@UiHandler("b5")
	void onClick4(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}
	@UiHandler("b6")
	void onClick5(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}
	@UiHandler("b7")
	void onClick6(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}
	@UiHandler("b8")
	void onClick7(ClickEvent e) {
		jobID = c.incrementAndGet(); 
		Window.alert("you verification id is gad"+jobID);
	}


}

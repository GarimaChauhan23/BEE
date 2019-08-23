package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Data;
import com.shared.Log;
import com.shared.outuser;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class login extends Composite  {

	private static loginUiBinder uiBinder = GWT.create(loginUiBinder.class);

	interface loginUiBinder extends UiBinder<Widget, login> {
	}

	public login() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	GreetingServiceAsync b1=GWT.create(GreetingService.class);

	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialButton button1;
	@UiField
	MaterialLink t3;
	@UiField
	MaterialCheckBox tt3;
	
	
	

	@UiHandler("button1")
	void onClick(ClickEvent e) {
		Log u = new Log();
		u.setUid(t1.getText());
		u.setPass(t2.getText());
		u.setCb(tt3.getValue());
		b1.l(u, new AsyncCallback<Log>() {
			
			@Override
			public void onSuccess(Log result) {
				// TODO Auto-generated method stub
				if(tt3.getValue().equals(false)) {
				RootPanel.get("r2").clear();
				RootPanel.get("r1").clear();
				RootPanel.get("r2").add(new udash());
				outuser output = new outuser(); 
				b1.getdata(output, new AsyncCallback<outuser>() {
					
					@Override
					public void onSuccess(outuser result) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}
				});
			}
				else {
					RootPanel.get("r2").clear();
					RootPanel.get("r1").clear();
					RootPanel.get("r2").add(new cafed());
				}
					
			}
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				 Window.alert("incorrect login id & password");
			}
		});
		
	}
	/*
	 * @UiHandler("t3") void onClick1(ClickEvent e) {
	 * if(tt3.getValue().equals(false)) { RootPanel.get("r2").clear();
	 * RootPanel.get("r2").add(new Creg()); } else { RootPanel.get("r2").clear();
	 * RootPanel.get("r2").add(new Nav()); } }
	 */

}

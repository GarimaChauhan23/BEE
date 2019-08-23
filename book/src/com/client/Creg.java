package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Data;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialTextBox;

public class Creg extends Composite {

	private static CregUiBinder uiBinder = GWT.create(CregUiBinder.class);

	interface CregUiBinder extends UiBinder<Widget, Creg> {
	}

	public Creg() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	GreetingServiceAsync a1=GWT.create(GreetingService.class);

	 @UiField
	    MaterialTextBox t1;
	    
	    @UiField
	    MaterialTextBox t2;
	    
	    @UiField
	    MaterialTextBox t3;
	    
	    @UiField
	    MaterialTextBox t4;
	    
	    @UiField
	    MaterialIntegerBox t5;
	    
	    @UiField
	    MaterialTextBox t6;
	    
	    @UiField
	    MaterialTextBox t7;
	    @UiField
	    MaterialButton b;

	    @UiHandler("b")
	    void onClick(ClickEvent e) {
			Window.alert("registered");

			
			  Data d= new Data(); d.setFname(t1.getText()); d.setLname(t2.getText());
			  d.setUid(t3.getText()); d.setAdd(t4.getText());
			  d.setPno(Integer.parseInt(t5.getText())); d.setPass(t6.getText());
			  d.setCpass(t7.getText());
			 
			/*
			 * Data d= new Data(); d.setFname("Garima"); d.setLname("Chauhan");
			 * d.setEadd("garima@"); d.setAdd("abc-csd-kjh"); d.setPno(999999999);
			 * d.setPass("abc"); d.setCpass("abc");
			 */
			
			a1.p(d, new AsyncCallback <Data>() {
				
				public void onSuccess(Data result) {
					// TODO Auto-generated method stub
					
					Window.alert( d.fname);
					t1.setText(result.fname);
					t2.setText(result.lname);
					t3.setText(result.uid);
					t4.setText(result.add);
					t5.setText(Integer.toString(result.pno));
					t6.setText(result.pass);
					t7.setText(result.cpass);	
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					Window.alert(caught.getMessage());
				}
			});
		}

}

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
import com.shared.Add;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialIntegerBox;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;

public class Nav extends Composite  {

	private static NavUiBinder uiBinder = GWT.create(NavUiBinder.class);

	interface NavUiBinder extends UiBinder<Widget, Nav> {
	}

	public Nav() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	GreetingServiceAsync z1=GWT.create(GreetingService.class);
	
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
	  MaterialButton button1;

@UiHandler("button1")

	void onClick(ClickEvent e) {
	Window.alert("registered");
		Add z2= new Add();
		z2.setCname(t1.getText());
		z2.setOname(t2.getText());
		z2.setAdd(t3.getText());
		z2.setEmail(t4.getText());
		z2.setPno(Integer.parseInt(t5.getText()));
		z2.setLogin(t6.getText());
		z2.setPass(t7.getText());
		
		z1.getsubmit(z2, new AsyncCallback<Add>() {
			
			@Override
			public void onSuccess(Add result) {
				// TODO Auto-generated method stub
				 Window.alert(result.cname);
				 t1.setText(result.cname);
				 t2.setText(result.oname);
				 t3.setText(result.add);
				 t4.setText(result.email);
				 t5.setText(Integer.toString(result.pno));
				 t6.setText(result.login);
				 t7.setText(result.pass);
				
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
		
	



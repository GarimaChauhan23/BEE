package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
import com.shared.upl;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class cafup extends Composite  {

	private static utUiBinder uiBinder = GWT.create(utUiBinder.class);
	
	interface utUiBinder extends UiBinder<Widget, cafup> {
	}

	
	public cafup() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	MaterialTextBox a1;
	@UiField
	MaterialTextBox a2;
	@UiField
	MaterialTextBox a3;
	@UiField
	MaterialButton b1;

	@UiHandler("b1")
	void onClick(ClickEvent e) {
		GreetingServiceAsync t1=GWT.create(GreetingService.class);
		String p1= a1.getText();
		String p2= a2.getText();
		String p3=a3.getText();
		MaterialToast.fireToast("SUCCESSS");
		upl u = new upl();
		u.setC(p1);
		u.setO(p2);
		u.setC1(p3);
		t1.insert(u, new AsyncCallback<upl>() {
			
			@Override
			public void onSuccess(upl result) {
				// TODO Auto-generated method stub
				
				
				
				/*try {
					a1.setText(result.c);
					a2.setText(result.o);
				
				Window.alert("SUCCESS");
				}
				catch(Exception e)
				{
					Window.alert(e.getMessage());
				}
				
			}
			*/  Window.alert("Details are inserted"+result.c);
			}
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
				Window.alert("FAILED");
				
				
				
			}
		});
	}
	
	
}

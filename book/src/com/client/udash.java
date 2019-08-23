package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
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
import com.shared.Data;
import com.shared.Log;
import com.shared.outuser;

import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;

public class udash extends Composite {

	private static udashUiBinder uiBinder = GWT.create(udashUiBinder.class);
	GreetingServiceAsync b1=GWT.create(GreetingService.class);
	interface udashUiBinder extends UiBinder<Widget, udash> {
	}
@UiField
MaterialLabel l1;

	public udash() {
		initWidget(uiBinder.createAndBindUi(this));
		GWT.runAsync(new RunAsyncCallback() {
			
			@Override
			public void onSuccess() {
				// TODO Auto-generated method stub
				tt2.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						RootPanel.get("r1").clear();
						 RootPanel.get("r2").clear();
						RootPanel.get("r1").add(new Nav1());
						
					}
				});
				
				
				
				
book.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						RootPanel.get("r2").clear();
						RootPanel.get("r2").add(new bok());
						RootPanel.get("r1").clear();
						RootPanel.get("r1").add(new udash());
					}
				});
ttt1.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new login());
		RootPanel.get("r1").clear();
		RootPanel.get("r1").add(new Nav1());
		
	}
});

tt1.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("r1").clear();
		 RootPanel.get("r2").clear();
		RootPanel.get("r1").add(new Nav1());
		outuser output = new outuser(); 
		b1.getdata(output, new AsyncCallback<outuser>() {
			
			@Override
			public void onSuccess(outuser result) {
				// TODO Auto-generated method stub
				l1.setText(result.getFname());
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}});
	}
});
gadget.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new gad());
		RootPanel.get("r1").clear();
		RootPanel.get("r1").add(new udash());
	}
});
				
meetup.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new meetup());
		RootPanel.get("r1").clear();
		RootPanel.get("r1").add(new udash());
	}
});			
u1.addClickHandler(new ClickHandler() {
	
	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new BUpl());
		RootPanel.get("r1").clear();
		RootPanel.get("r1").add(new udash());
	}
});
			}
			
			@Override
			public void onFailure(Throwable reason) {
				// TODO Auto-generated method stub
				
			}
		});
    
	}

	@UiField
	MaterialLink tt1;
	@UiField
	MaterialLink tt2;
	@UiField
	MaterialLink ttt1;
	@UiField
	MaterialLink book;
	@UiField
	MaterialLink gadget;
	@UiField
	MaterialLink meetup;
	@UiField
	MaterialLink u1;
//	@UiHandler("tt2")
//	void onClick(ClickEvent e) {
//		RootPanel.get("r1").clear();
//		 RootPanel.get("r2").clear();
//		RootPanel.get("r1").add(new Nav1());
//	}
//	@UiHandler("ttt1")
//void onClick1(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new login());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new Nav1());
//	}
//	@UiHandler("book")
//	void onClick2(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new bok());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new udash());
//	}
//	@UiHandler("gadget")
//	void onClick3(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new gad());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new udash());
//	}
//	@UiHandler("meetup")
//void onClick4(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new meetup());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new udash());
//	}
//	@UiHandler("u1")
//	void onClick5(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new BUpl());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new udash());
//		
//		
//		
//	}
}

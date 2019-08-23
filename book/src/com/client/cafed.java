package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;

public class cafed extends Composite {

	private static udashUiBinder uiBinder = GWT.create(udashUiBinder.class);

	interface udashUiBinder extends UiBinder<Widget, cafed> {
	}

	public cafed() {
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
				t1.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						RootPanel.get("r2").clear();
						RootPanel.get("r2").add(new cafup());
						RootPanel.get("r1").clear();
						RootPanel.get("r1").add(new cafed());
						
					}
				});
               b.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						// TODO Auto-generated method stub
						RootPanel.get("r2").clear();
						RootPanel.get("r2").add(new Bookshell());
						RootPanel.get("r1").clear();
						RootPanel.get("r1").add(new cafed());
					}
				});
               p1.addClickHandler(new ClickHandler() {
					
          					@Override
          					public void onClick(ClickEvent event) {
          						// TODO Auto-generated method stub
          						RootPanel.get("r2").clear();
          						RootPanel.get("r1").clear();
          						RootPanel.get("r2").add(new login());
          						RootPanel.get("r1").add(new Nav1());
          					}
          				});
               g.addClickHandler(new ClickHandler() {
					
 					@Override
 					public void onClick(ClickEvent event) {
 						// TODO Auto-generated method stub
 						RootPanel.get("r2").clear();
 						RootPanel.get("r2").add(new gadget());
 						RootPanel.get("r1").clear();
 						RootPanel.get("r1").add(new cafed());
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
	MaterialLink t1;
	@UiField
	MaterialLink b;
	@UiField
	MaterialLink g;
	@UiField
	MaterialLink p1;
	
//	@UiHandler("tt2")
//	void onClick(ClickEvent e) {
//		RootPanel.get("r1").clear();
//		 RootPanel.get("r2").clear();
//		RootPanel.get("r1").add(new Nav1());
//	}
//	@UiHandler("t1")
//	void onClick1(ClickEvent e)
//	{
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new cafup());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new cafed());
//	}
//	@UiHandler("p1")
//	void onClick2(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r1").clear();
//		RootPanel.get("r2").add(new login());
//		RootPanel.get("r1").add(new Nav1());
//	}
//	@UiHandler("b")
//	void onClick4(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new Bookshell());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new cafed());
//	}
//	@UiHandler("g")
//	void onClick5(ClickEvent e) {
//		RootPanel.get("r2").clear();
//		RootPanel.get("r2").add(new gadget());
//		RootPanel.get("r1").clear();
//		RootPanel.get("r1").add(new cafed());
//	}
//	
	}

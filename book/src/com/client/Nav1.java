package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.client.his;

import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

public class Nav1 extends Composite  {

	private static Nav1UiBinder uiBinder = GWT.create(Nav1UiBinder.class);

	interface Nav1UiBinder extends UiBinder<Widget, Nav1> {
	}

	public Nav1() {
		initWidget(uiBinder.createAndBindUi(this));
//		/*
//		 * GWT.runAsync(new RunAsyncCallback() {
//		 * 
//		 * @Override public void onSuccess() {
//		 */
//				// TODO Auto-generated method stub
//				t3.addClickHandler(new ClickHandler() {
//					
//					@Override
//					public void onClick(ClickEvent event) {
//						// TODO Auto-generated method stub
//						RootPanel.get("r2").clear();
//						RootPanel.get("r2").add(new card());
//					}
//				});
//                 t1.addClickHandler(new ClickHandler() {
//					
//					@Override
//					public void onClick(ClickEvent event) {
//						// TODO Auto-generated method stub
//						
//						his.getInstance().abc();
//						History.newItem("c");
//					}
//				});
//                 t2.addClickHandler(new ClickHandler() {
// 					
// 					@Override
// 					public void onClick(ClickEvent event) {
// 						// TODO Auto-generated method stub
// 						
// 						his.getInstance().abc();
// 						History.newItem("b");
// 					}
// 				});
//                 t4.addClickHandler(new ClickHandler() {
// 					
// 					@Override
// 					public void onClick(ClickEvent event) {
// 						// TODO Auto-generated method stub
// 						
// 						his.getInstance().abc();
// 						History.newItem("a");
// 					}
// 				});
//                 book.addClickHandler(new ClickHandler() {
// 					
// 					@Override
// 					public void onClick(ClickEvent event) {
// 						// TODO Auto-generated method stub
// 						RootPanel.get("r2").clear();
// 						RootPanel.get("r2").add(new Bookshell());
// 					}
// 				});
//                 gadget.addClickHandler(new ClickHandler() {
//  					
// 					@Override
// 					public void onClick(ClickEvent event) {
// 						// TODO Auto-generated method stub
// 						RootPanel.get("r2").clear();
// 						RootPanel.get("r2").add(new Bookshell());
// 					}
// 				});
// 				
// 				
//				
//		/*
//		 * }
//		 * 
//		 * @Override public void onFailure(Throwable reason) { // TODO Auto-generated
//		 * method stub
//		 * 
//		 * } });
//		 */
	}

	@UiField
	MaterialHeader header;
	@UiField
	MaterialButton t1 ; 
	MaterialButton t2 ;
	MaterialButton t4 ;
	MaterialButton t3 ;
	
	
	/*
	 * @UiField MaterialButton tt1;
	 */
	@UiField
	MaterialLink book;
	@UiField 
	MaterialLink gadget;

	@UiHandler("t3")
	void onClick2(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new card());
	}
	@UiHandler("t1")
	void onClick(ClickEvent e) {
		History.newItem("c");
		his.getInstance().abc();	}
	
	@UiHandler("t2")
	void onClick1(ClickEvent e) {
		History.newItem("b");
	his.getInstance().abc();
	}
	@UiHandler("t4")
	void onClick3(ClickEvent e) {
		History.newItem("a");
		his.getInstance().abc();
	}
	
	@UiHandler("book")
	void onClick5(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new Bookshell());
	}
	@UiHandler("gadget")
	void onClick6(ClickEvent e) {
		RootPanel.get("r2").clear();
		RootPanel.get("r2").add(new gadget());
	}
	
}

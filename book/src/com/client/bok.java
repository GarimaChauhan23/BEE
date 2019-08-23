package com.client;

import java.util.concurrent.atomic.AtomicInteger;

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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Books;

import gwt.material.design.addins.client.webp.MaterialWebpImage;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialCardContent;
import gwt.material.design.client.ui.MaterialCardImage;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;

public class bok extends Composite {

	public static final AtomicInteger c = new AtomicInteger(78787454);
	public static int jobID;
	public int a;

	private static bokUiBinder uiBinder = GWT.create(bokUiBinder.class);

	GreetingServiceAsync somil=GWT.create(GreetingService.class);
	
	interface bokUiBinder extends UiBinder<Widget, bok> {
	}

	public bok() {
		initWidget(uiBinder.createAndBindUi(this));
		jobID = c.incrementAndGet();

		somil.fun("Agra", new AsyncCallback<Books[]>() {
			
			@Override
			public void onSuccess(Books[] result) {
		// TODO Auto-generated method stub
		
				for (int i = 0; i < result.length; i++) {
					MaterialRow rr = new MaterialRow();
					RootPanel.get().add(rr);

					for (int j = 0; j < result.length; j++) {

			
						MaterialColumn cc = new MaterialColumn();
						rr.add(cc);
						

						MaterialCard mc = new MaterialCard();
						cc.add(mc);
						
						MaterialCardImage img=new MaterialCardImage();
						mc.add(img);
						MaterialWebpImage im=new MaterialWebpImage();
						img.add(im);

						MaterialCardContent mcd = new MaterialCardContent();
						mc.add(mcd);

						MaterialLabel ml1 = new MaterialLabel();
						MaterialLabel ml2 = new MaterialLabel();
						MaterialLabel ml3 = new MaterialLabel();
						MaterialLabel ml4 = new MaterialLabel();
						
						
						
						ml1.setText(result[j].getCaty());
						ml2.setText(result[j].getName());
						ml3.setText(result[j].getSubcaty());
						ml4.setText(result[j].getDesct());
						
						mcd.add(ml1);
						mcd.add(ml2);
						mcd.add(ml3);
						mcd.add(ml4);
						
					}
				}

				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

	/*
	 * @UiField MaterialButton b1; MaterialButton b2; MaterialButton b3;
	 * MaterialButton b4; MaterialButton b5; MaterialButton b6; MaterialButton b7;
	 * MaterialButton b8;
	 * 
	 * @UiHandler("b1") void onClick(ClickEvent e) { //jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID);
	 * 
	 * }
	 * 
	 * @UiHandler("b2") void onClick1(ClickEvent e) {
	 * 
	 * jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 * 
	 * @UiHandler("b3") void onClick2(ClickEvent e) { jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 * 
	 * @UiHandler("b4") void onClick3(ClickEvent e) { jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 * 
	 * @UiHandler("b5") void onClick4(ClickEvent e) { jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 * 
	 * @UiHandler("b6") void onClick5(ClickEvent e) { jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 * 
	 * @UiHandler("b7") void onClick6(ClickEvent e) { jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 * 
	 * @UiHandler("b8") void onClick7(ClickEvent e) { jobID = c.incrementAndGet();
	 * Window.alert("you verification id is book"+jobID); }
	 */

}

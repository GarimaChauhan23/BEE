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
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.Add;
import com.shared.Books;
import com.shared.Data;

import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.addins.client.fileuploader.MaterialFileUploader;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialCardContent;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialProgress;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.html.Option;

public class BUpl extends Composite {

	private static BUplUiBinder uiBinder = GWT.create(BUplUiBinder.class);

	interface BUplUiBinder extends UiBinder<Widget, BUpl> {
	}

	public BUpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
	
	    	
		//MaterialPanel m=new MaterialPanel();
		RootPanel.get("r2").add(m);
		m.setMarginLeft(420);
		m.setPaddingBottom(10);
		//MaterialRow r= new MaterialRow();
		m.add(r);
		r.setWidth("160%");
		r.setHeight("150%");
		//MaterialColumn c=new MaterialColumn();
		m.add(c);
		c.setGrid("l4");
		c.setHeight("150%");
		//MaterialCard card=new MaterialCard();
		c.add(card);
		//MaterialCardContent cc=new MaterialCardContent();
		card.add(cc);
		/*MaterialCardTitle ct=new MaterialCardTitle();
		card.add(ct);
		ct.setText("UPLOAD");*/
		//MaterialLabel ml1=new MaterialLabel();
		cc.add(ml1);
	    ml1.setText("CATEGORY");
	    //MaterialComboBox cb=new MaterialComboBox();
	    cb.setPlaceholder("SELECT");
	    cb.setAllowClear(true);
	    cc.add(cb);
	    Option o1=new Option();
	    cb.add(o1);
	    o1.setText("Book");
	    Option o2=new Option();
	    o2.setText("Gadget");
	    cb.add(o2);
	    //MaterialLabel ml2=new MaterialLabel();
	    cc.add(ml2);
	    ml2.setText("SUB_CATEGORY");
	    if(cb.equals(o1))
	    {
	    
	    //MaterialComboBox cb1=new MaterialComboBox();
	    cb1.setPlaceholder("SELECT");
	    cb1.setAllowClear(true);
	    cc.add(cb1);
	    Option o3=new Option();
	    cb1.add(o3);
	    o3.setText("Educational");
	    Option o4=new Option();
	    cb1.add(o4);
	    o4.setText("Mystery");
	    
	    Option o5=new Option();
	    cb1.add(o5);
	    o5.setText("Adventure");
	    
	    Option o6=new Option();
	    cb1.add(o6);
	    o6.setText("Horror");
	    
	    Option o7=new Option();
	    cb1.add(o7);
	    o7.setText("Self-Help");
	    
	    Option o8=new Option();
	    cb1.add(o8);
	    o8.setText("Comic");
	    }
	    else if(cb.equals(o2))
	    {
	    	//MaterialComboBox cb2=new MaterialComboBox();
	    	cb2.setAllowClear(true);
	    	cc.add(cb2);
	    	Option op=new Option();
	    	op.setText("Smart Watch");
	    	cb2.add(op);
	    	Option op1=new Option();
	    	op1.setText("Bluetooth");
	    	cb2.add(op1);
	    	Option op2=new Option();
	    	op2.setText("Ear-phones");
	    	cb2.add(op2);
	    	Option op3=new Option();
	    	op3.setText("Mobiles");
	    	cb2.add(op3);
	    	
	    	
	    }
	    
	    MaterialLabel k=new MaterialLabel();
	    k.setText("BOOK NAME");
	    cc.add(k);
	    //MaterialTextBox mb=new MaterialTextBox();
	    cc.add(mb);
	    mb.setGrid("s12");
	    mb.setLabel("Name");
	    MaterialLabel k1=new MaterialLabel();
	    k1.setText("DESCRIPTION");
	    cc.add(k1);
	    //MaterialTextArea ar=new MaterialTextArea();
	    cc.add(ar);
	    ar.setGrid("s12");
	    ar.setLabel("Add description here");
	    MaterialLabel k2=new MaterialLabel();
	    k2.setText("CITY");
	    cc.add(k2);
	    //MaterialTextBox mb1=new MaterialTextBox();
	    mb1.setLabel("city");
	    cc.add(mb1);
	    mb1.setGrid("s12");
	    //MaterialButton b=new MaterialButton();
	    cc.add(b);
	    b.setText("UPLOAD");
	    
	    

	}
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	MaterialPanel m=new MaterialPanel();
	MaterialRow r= new MaterialRow();
	MaterialColumn c=new MaterialColumn();
	MaterialCard card=new MaterialCard();
	MaterialLabel ml1=new MaterialLabel();
	MaterialCardContent cc=new MaterialCardContent();
	MaterialComboBox cb=new MaterialComboBox();
	MaterialComboBox cb1=new MaterialComboBox();
	MaterialComboBox cb2=new MaterialComboBox();
	MaterialLabel ml2=new MaterialLabel();
	MaterialTextBox mb=new MaterialTextBox();
	MaterialTextArea ar=new MaterialTextArea();
	MaterialTextBox mb1=new MaterialTextBox();
	MaterialButton b=new MaterialButton();
	@UiHandler ("b")
void onClick(ClickEvent e) {
	Books b=new Books();
	b.setCaty(cb.getPlaceholder());
	b.setName(mb.getText());
	if(b.getCaty()=="books")
	{b.setSubcaty(cb1.getPlaceholder());}
	else {
		b.setSubcaty(cb2.getPlaceholder());}
	
	b.setDesct(ar.getText());
	b.setCity(mb1.getText());
		a1.fun1(b,new AsyncCallback<Books>() {
		
		@Override
		public void onSuccess(Books result) {
			// TODO Auto-generated method stub
			Window.alert("SUCCESS");
			cb.setPlaceholder(result.getCaty());
			mb.setText(result.getName());
			if(result.getCaty()=="books")
			{cb1.setPlaceholder(result.getSubcaty());}
			else {cb2.setPlaceholder(result.getSubcaty());}
			ar.setText(result.getDesct());
			mb1.setText(result.getCity());
			
			
			String s3= mb1.getText();
			Add d= new Add();
			String s=d.cname;
			a1.po(s3, new AsyncCallback<Add[]>() {
				
				@Override
				public void onSuccess(Add[] result) {
					// TODO Auto-generated method stub
		for(int i=0;i<result.length;i++)
		{	MaterialRow r=new MaterialRow();
					RootPanel.get("r2").add(r);
					for(int j=0;j<result.length;j++)
					{/*MaterialColumn mc= new MaterialColumn();
					r.add(mc);
					MaterialCard m= new MaterialCard();
					mc.add(m);
					MaterialCardContent n= new MaterialCardContent();
					m.add(n);*/
					MaterialComboBox mb= new MaterialComboBox();
					mb.setPlaceholder("Select");
					cc.add(mb);
					Option h= new Option();
					mb.add(h);
					h.setText(result[j].cname);}
					
		}
					
				
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		
		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			Window.alert(caught.getMessage());
		}
	} );
}
}

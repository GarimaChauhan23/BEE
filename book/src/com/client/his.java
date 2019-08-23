package com.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class his {

	static his h=null;
	login l=null;
	Creg r=null;
	Nav n=null;
	private his() {}
	static his getInstance() {
		if(h==null)
			h=new his();
		return h;
		
	}
	public void abc()
	{
		if(History.getToken().equals("a"))
		{
			RootPanel.get("r2").clear();
			RootPanel.get("r2").add(getLogin());
		}
		if(History.getToken().equals("b"))
		{
			RootPanel.get("r2").clear();
			RootPanel.get("r2").add(getCreg());
		}
		if(History.getToken().equals("c"))
		{
			RootPanel.get("r2").clear();
			RootPanel.get("r2").add(getNav());
		}
	}
	login getLogin() {
		
		if(l==null) {
			l=new login();
		}
		return l;
		
	}
   Creg getCreg() {
		
		if(r==null) {
			r=new Creg();
		}
		return r;
		
	}
   Nav getNav() {
	   if(n==null) {
		   n=new Nav();
	   }
	   return n;
   }
}
	
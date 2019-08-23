package com.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.shared.Add;
import com.shared.Books;
import com.shared.Data;
import com.shared.Log;
import com.shared.outuser;
import com.shared.upl;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	Add getsubmit(Add name) throws IllegalArgumentException;

	Data p(Data n) throws IllegalArgumentException;

	Log l(Log u) throws IllegalArgumentException;

	upl insert(upl u) throws IllegalArgumentException;

	outuser getdata(outuser name) throws IllegalArgumentException;

	

	Books[] fun(String s1)throws IllegalArgumentException;

	Add[] po(String s)throws IllegalArgumentException;
	
	
	Books fun1(Books s1)throws IllegalArgumentException;
}

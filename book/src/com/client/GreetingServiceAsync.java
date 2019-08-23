package com.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.shared.Add;
import com.shared.Books;
import com.shared.Data;
import com.shared.Log;
import com.shared.outuser;
import com.shared.upl;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void getsubmit(Add input, AsyncCallback<Add> callback) throws IllegalArgumentException;

	void p(Data n, AsyncCallback<Data> callback) throws IllegalArgumentException;

	void l(Log u, AsyncCallback<Log> callback) throws IllegalArgumentException;

	void insert(upl u, AsyncCallback<upl> callback) throws IllegalArgumentException;

	void getdata(outuser output, AsyncCallback<outuser> callback) throws IllegalArgumentException;

	void po(String s, AsyncCallback<Add[]> callback) throws IllegalArgumentException;


	void  fun(String s1, AsyncCallback<Books[]> callback) throws IllegalArgumentException;
	void  fun1(Books s1, AsyncCallback<Books> callback) throws IllegalArgumentException;
}

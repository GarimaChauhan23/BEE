package com.shared;

import java.io.Serializable;

public class Log implements Serializable {
	public String uid;
	public Boolean cb;
	public Boolean getCb() {
		return cb;
	}
	public void setCb(Boolean cb) {
		this.cb = cb;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String pass;

}

package com.shared;

import java.io.Serializable;

public class Books implements Serializable
{
	String caty;
	String name;
	String subcaty;
	String desct;
	String cafe;
	String city;

	public String getCaty() {
		return caty;
	}

	public void setCaty(String caty) {
		this.caty = caty;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubcaty() {
		return subcaty;
	}

	public void setSubcaty(String subcaty) {
		this.subcaty = subcaty;
	}

	public String getDesct() {
		return desct;
	}

	public void setDesct(String desct) {
		this.desct = desct;
	}

	public String getCafe() {
		return cafe;
	}

	public void setCafe(String cafe) {
		this.cafe = cafe;
	}

}

package com.restful.stuff.ws.domain;

import java.io.Serializable;

public class ExampleStuff implements Serializable {

	private static final long serialVersionUID = -6824900918054838165L;

	private String stuff;
	private int intStuff;
	private boolean boolStuff;
	
	public ExampleStuff(String stuff, int intStuff, boolean boolStuff) {
		this.stuff = stuff;
		this.intStuff = intStuff;
		this.boolStuff = boolStuff;
	}

	public String getStuff() {
		return stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public int getIntStuff() {
		return intStuff;
	}

	public void setIntStuff(int intStuff) {
		this.intStuff = intStuff;
	}

	public boolean isBoolStuff() {
		return boolStuff;
	}

	public void setBoolStuff(boolean boolStuff) {
		this.boolStuff = boolStuff;
	}
}

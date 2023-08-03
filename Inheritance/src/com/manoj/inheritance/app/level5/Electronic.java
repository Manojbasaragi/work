package com.manoj.inheritance.app.level5;

public class Electronic extends Device{
	public boolean requiresPower = true;

	public void operate() {
		System.out.println("invoking operator() in Electronic");
	}

}

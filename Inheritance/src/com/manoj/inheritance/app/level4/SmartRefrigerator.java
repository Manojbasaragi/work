package com.manoj.inheritance.app.level4;

public class SmartRefrigerator extends Refrigerator {
	public boolean wifiConnected = true;

	public void controlTemperature() {
		System.out.println("invoking controlTemperature() in SmartRefrigerator");
	}

}

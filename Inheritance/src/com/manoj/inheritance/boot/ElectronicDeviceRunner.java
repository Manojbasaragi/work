package com.manoj.inheritance.boot;

import com.manoj.inheritance.app.ElectronicDevice;
import com.manoj.inheritance.app.SmartPhone;
import com.manoj.inheritance.app.Television;

public class ElectronicDeviceRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in ElectronicDeviceRunner");

		ElectronicDevice electronicDevice = new ElectronicDevice();
		electronicDevice.performTask();
		ElectronicDevice electronicDevice1 = new Television();
		electronicDevice1.performTask();
		ElectronicDevice electronicDevice2 = new SmartPhone();
		electronicDevice2.performTask();
		Television television = new Television();
		television.performTask();
		television.show();
		Television television1 = new SmartPhone();
		television1.performTask();
		television1.show();
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.performTask();
		smartPhone.show();
		smartPhone.call();

	}

}

package com.manoj.inheritance.boot;

import com.manoj.inheritance.app.level5.Computer;
import com.manoj.inheritance.app.level5.ConvertibleUltrabook;
import com.manoj.inheritance.app.level5.Device;
import com.manoj.inheritance.app.level5.Electronic;
import com.manoj.inheritance.app.level5.Laptop;
import com.manoj.inheritance.app.level5.UltraBook;

public class DeviceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DeviceRunner");

		Device device = new Device();
		device.powerOn();
		Device device1 = new Electronic();
		device1.powerOn();
		Device device2 = new Computer();
		device2.powerOn();
		Device device3 = new Laptop();
		device3.powerOn();
		Device device4 = new UltraBook();
		device4.powerOn();
		Device device5 = new ConvertibleUltrabook();
		device5.powerOn();

		Electronic electronic = new Electronic();
		electronic.powerOn();
		electronic.operate();
		Electronic electronic1 = new Computer();
		electronic1.powerOn();
		electronic1.operate();
		Electronic electronic2 = new Laptop();
		electronic2.powerOn();
		electronic2.operate();
		Electronic electronic3 = new UltraBook();
		electronic3.powerOn();
		electronic3.operate();
		Electronic electronic4 = new ConvertibleUltrabook();
		electronic4.powerOn();
		electronic4.operate();

		Computer computer = new Computer();
		computer.powerOn();
		computer.operate();
		computer.process();
		Computer computer1 = new Laptop();
		computer1.powerOn();
		computer1.operate();
		computer1.process();
		Computer computer2 = new UltraBook();
		computer2.powerOn();
		computer2.operate();
		computer2.process();
		Computer computer3 = new ConvertibleUltrabook();
		computer3.powerOn();
		computer3.operate();
		computer3.process();

		Laptop laptop = new Laptop();
		laptop.powerOn();
		laptop.operate();
		laptop.process();
		laptop.useTouchpad();
		Laptop laptop1 = new UltraBook();
		laptop1.powerOn();
		laptop1.operate();
		laptop1.process();
		laptop1.useTouchpad();
		Laptop laptop2 = new ConvertibleUltrabook();
		laptop2.powerOn();
		laptop2.operate();
		laptop2.process();
		laptop2.useTouchpad();

		UltraBook ultraBook = new UltraBook();
		ultraBook.powerOn();
		ultraBook.operate();
		ultraBook.process();
		ultraBook.useTouchpad();
		ultraBook.travelCompanion();
		UltraBook ultraBook1 = new ConvertibleUltrabook();
		ultraBook1.powerOn();
		ultraBook1.operate();
		ultraBook1.process();
		ultraBook1.useTouchpad();
		ultraBook1.travelCompanion();

		ConvertibleUltrabook convertibleUltrabook = new ConvertibleUltrabook();
		convertibleUltrabook.powerOn();
		convertibleUltrabook.process();
		convertibleUltrabook.operate();
		convertibleUltrabook.useTouchpad();
		convertibleUltrabook.travelCompanion();
		convertibleUltrabook.flipScreen();

	}

}

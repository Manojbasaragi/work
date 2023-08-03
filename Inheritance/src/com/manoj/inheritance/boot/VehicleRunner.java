package com.manoj.inheritance.boot;

import com.manoj.inheritance.app.Car;
import com.manoj.inheritance.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in VehicleRunner");

		Vehicle vehicle = new Vehicle();
		vehicle.start();
		System.out.println("Vehicle model is:" + vehicle.model);

		Car car = new Car();
		System.out.println("Car name is:" + car.name);
		System.out.println("Vehicle model is:" + car.model);
		car.move();
		car.start();

		Vehicle vehicle1 = new Car();
		System.out.println("Vehicle model is:" + vehicle1.model);
		vehicle1.start();

	}

}

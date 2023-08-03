package com.manoj.inheritance.boot;

import com.manoj.inheritance.app.level4.AIRefrigerator;
import com.manoj.inheritance.app.level4.Appliences;
import com.manoj.inheritance.app.level4.KitchenAppliance;
import com.manoj.inheritance.app.level4.Refrigerator;
import com.manoj.inheritance.app.level4.SmartRefrigerator;

public class AppliencesRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AppliencesRunner");

		Appliences appliences = new Appliences();
		appliences.turnOn();
		Appliences appliences1 = new KitchenAppliance();
		appliences1.turnOn();
		Appliences appliences2 = new Refrigerator();
		appliences2.turnOn();
		Appliences appliences3 = new SmartRefrigerator();
		appliences3.turnOn();
		Appliences appliences4 = new AIRefrigerator();
		appliences4.turnOn();

		KitchenAppliance kitchenApplience = new KitchenAppliance();
		kitchenApplience.turnOn();
		kitchenApplience.cook();
		KitchenAppliance kitchenAppliance1 = new Refrigerator();
		kitchenAppliance1.turnOn();
		kitchenAppliance1.cook();
		KitchenAppliance kitchenAppliance2 = new SmartRefrigerator();
		kitchenAppliance2.turnOn();
		kitchenAppliance2.cook();
		KitchenAppliance kitchenAppliance3 = new AIRefrigerator();
		kitchenAppliance3.turnOn();
		kitchenAppliance3.cook();

		Refrigerator refrigerator = new Refrigerator();
		refrigerator.turnOn();
		refrigerator.cook();
		refrigerator.keepFresh();
		Refrigerator refrigerator1 = new SmartRefrigerator();
		refrigerator1.turnOn();
		refrigerator1.cook();
		refrigerator1.keepFresh();
		Refrigerator refrigerator2 = new AIRefrigerator();
		refrigerator2.turnOn();
		refrigerator2.cook();
		refrigerator2.keepFresh();

		SmartRefrigerator smartRefrigerator = new SmartRefrigerator();
		smartRefrigerator.turnOn();
		smartRefrigerator.cook();
		smartRefrigerator.keepFresh();
		smartRefrigerator.controlTemperature();
		SmartRefrigerator smartRefrigerator1 = new AIRefrigerator();
		smartRefrigerator1.turnOn();
		smartRefrigerator1.cook();
		smartRefrigerator1.keepFresh();
		smartRefrigerator1.controlTemperature();

		AIRefrigerator aiRefrigerator = new AIRefrigerator();
		aiRefrigerator.turnOn();
		aiRefrigerator.cook();
		aiRefrigerator.keepFresh();
		aiRefrigerator.controlTemperature();
		aiRefrigerator.suggestGroceries();
	}

}

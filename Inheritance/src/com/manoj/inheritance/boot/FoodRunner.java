package com.manoj.inheritance.boot;

import java.awt.image.ByteLookupTable;

import com.manoj.inheritance.app.level7.BloodOrange;
import com.manoj.inheritance.app.level7.BloodOrangeVariety;
import com.manoj.inheritance.app.level7.Citrus;
import com.manoj.inheritance.app.level7.ExoticBloodOrange;
import com.manoj.inheritance.app.level7.Food;
import com.manoj.inheritance.app.level7.Fruit;
import com.manoj.inheritance.app.level7.Orange;
import com.manoj.inheritance.app.level7.RareExoticBloodOrange;

public class FoodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FoodRunner");

		Food food = new Food();
		food.describe();
		Food food1 = new Fruit();
		food1.describe();
		Food food2 = new Citrus();
		food2.describe();
		Food food3 = new Orange();
		food3.describe();
		Food food4 = new BloodOrange();
		food4.describe();
		Food food5 = new BloodOrangeVariety();
		food5.describe();
		Food food6 = new ExoticBloodOrange();
		food6.describe();
		Food food7 = new RareExoticBloodOrange();
		food7.describe();

		Fruit fruit = new Fruit();
		fruit.describe();
		fruit.eat();
		Fruit fruit1 = new Citrus();
		fruit1.describe();
		fruit1.eat();
		Fruit fruit2 = new Orange();
		fruit2.describe();
		fruit2.eat();
		Fruit fruit3 = new BloodOrange();
		fruit3.describe();
		fruit3.eat();
		Fruit fruit4 = new BloodOrangeVariety();
		fruit4.describe();
		fruit4.eat();
		Fruit fruit5 = new ExoticBloodOrange();
		fruit5.describe();
		fruit5.eat();
		Fruit fruit6 = new RareExoticBloodOrange();
		fruit6.describe();
		fruit6.eat();

		Citrus citrus = new Citrus();
		citrus.describe();
		citrus.eat();
		citrus.makeJuice();
		Citrus citrus1 = new Orange();
		citrus1.describe();
		citrus1.eat();
		citrus1.makeJuice();
		Citrus citrus2 = new BloodOrange();
		citrus2.describe();
		citrus2.eat();
		citrus2.makeJuice();
		Citrus citrus3 = new BloodOrangeVariety();
		citrus3.describe();
		citrus3.eat();
		citrus3.makeJuice();
		Citrus citrus4 = new ExoticBloodOrange();
		citrus4.describe();
		citrus4.eat();
		citrus4.makeJuice();
		Citrus citrus5 = new RareExoticBloodOrange();
		citrus5.describe();
		citrus5.eat();
		citrus5.makeJuice();

		Orange orange = new Orange();
		orange.describe();
		orange.eat();
		orange.makeJuice();
		orange.peel();
		Orange orange1 = new BloodOrange();
		orange1.describe();
		orange1.eat();
		orange1.makeJuice();
		orange1.peel();
		Orange orange2 = new BloodOrangeVariety();
		orange2.describe();
		orange2.eat();
		orange2.makeJuice();
		orange2.peel();
		Orange orange3 = new ExoticBloodOrange();
		orange3.describe();
		orange3.eat();
		orange3.makeJuice();
		orange3.peel();
		Orange orange4 = new RareExoticBloodOrange();
		orange4.describe();
		orange4.eat();
		orange4.makeJuice();
		orange4.peel();

		BloodOrange bloodOrange = new BloodOrange();
		bloodOrange.describe();
		bloodOrange.eat();
		bloodOrange.makeJuice();
		bloodOrange.peel();
		bloodOrange.enjoy();
		BloodOrange bloodOrange1 = new BloodOrangeVariety();
		bloodOrange1.describe();
		bloodOrange1.eat();
		bloodOrange1.makeJuice();
		bloodOrange1.peel();
		bloodOrange1.enjoy();
		BloodOrange bloodOrange2 = new ExoticBloodOrange();
		bloodOrange2.describe();
		bloodOrange2.eat();
		bloodOrange2.makeJuice();
		bloodOrange2.peel();
		bloodOrange2.enjoy();
		BloodOrange bloodOrange3 = new RareExoticBloodOrange();
		bloodOrange3.describe();
		bloodOrange3.eat();
		bloodOrange3.makeJuice();
		bloodOrange3.peel();
		bloodOrange3.enjoy();

		BloodOrangeVariety bloodOrangeVareity = new BloodOrangeVariety();
		bloodOrangeVareity.describe();
		bloodOrangeVareity.eat();
		bloodOrangeVareity.makeJuice();
		bloodOrangeVareity.peel();
		bloodOrangeVareity.enjoy();
		bloodOrangeVareity.savor();
		BloodOrangeVariety bloodOrangeVariety1 = new ExoticBloodOrange();
		bloodOrangeVariety1.describe();
		bloodOrangeVariety1.eat();
		bloodOrangeVariety1.makeJuice();
		bloodOrangeVariety1.peel();
		bloodOrangeVariety1.enjoy();
		bloodOrangeVariety1.savor();
		BloodOrangeVariety bloodOrangeVariety2 = new RareExoticBloodOrange();
		bloodOrangeVariety2.describe();
		bloodOrangeVariety2.eat();
		bloodOrangeVariety2.makeJuice();
		bloodOrangeVariety2.peel();
		bloodOrangeVariety2.enjoy();
		bloodOrangeVariety2.savor();

		ExoticBloodOrange exoticBloodOrange = new ExoticBloodOrange();
		exoticBloodOrange.describe();
		exoticBloodOrange.eat();
		exoticBloodOrange.makeJuice();
		exoticBloodOrange.peel();
		exoticBloodOrange.enjoy();
		exoticBloodOrange.savor();
		exoticBloodOrange.exploreOrigin();
		ExoticBloodOrange exoticBloodOrange1 = new RareExoticBloodOrange();
		exoticBloodOrange1.describe();
		exoticBloodOrange1.eat();
		exoticBloodOrange1.makeJuice();
		exoticBloodOrange1.peel();
		exoticBloodOrange1.enjoy();
		exoticBloodOrange1.savor();
		exoticBloodOrange1.exploreOrigin();

		RareExoticBloodOrange ref = new RareExoticBloodOrange();
		ref.describe();
		ref.eat();
		ref.makeJuice();
		ref.peel();
		ref.enjoy();
		ref.savor();
		ref.exploreOrigin();
		ref.admireRarity();

	}

}

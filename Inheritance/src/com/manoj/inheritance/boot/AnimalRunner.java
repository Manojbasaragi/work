package com.manoj.inheritance.boot;

import com.manoj.inheritance.app.level3.Animal;
import com.manoj.inheritance.app.level3.Cat;
import com.manoj.inheritance.app.level3.Kitten;
import com.manoj.inheritance.app.level3.Mammal;

public class AnimalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AnimalRunner");

		Animal animal = new Animal();
		animal.eat();
		Animal animal1 = new Mammal();
		animal1.eat();
		Animal animal2 = new Cat();
		animal2.eat();
		Animal animal3 = new Kitten();
		animal3.eat();

		Mammal mammal = new Mammal();
		mammal.eat();
		mammal.run();

		Mammal mammal2 = new Cat();
		mammal2.eat();
		mammal2.run();

		Mammal mammal3 = new Kitten();
		mammal3.eat();
		mammal3.run();

		Cat cat = new Cat();
		cat.eat();
		cat.run();
		cat.meow();

		Cat cat1 = new Kitten();
		cat1.eat();
		cat1.run();
		cat1.meow();

		Kitten kitten = new Kitten();
		kitten.eat();
		kitten.run();
		kitten.meow();
		kitten.play();
	}

}

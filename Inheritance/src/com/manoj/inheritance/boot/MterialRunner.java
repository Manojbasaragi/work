package com.manoj.inheritance.boot;

import com.manoj.inheritance.app.level6.DessertFork;
import com.manoj.inheritance.app.level6.Fork;
import com.manoj.inheritance.app.level6.KitchenUtensil;
import com.manoj.inheritance.app.level6.Material;
import com.manoj.inheritance.app.level6.Metal;
import com.manoj.inheritance.app.level6.StainlessSteel;
import com.manoj.inheritance.app.level6.Steel;

public class MterialRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MaterialRunner");

		Material material = new Material();
		material.describe();
		Material material1 = new Metal();
		material1.describe();
		Material material2 = new Steel();
		material2.describe();
		Material material3 = new StainlessSteel();
		material3.describe();
		Material material4 = new KitchenUtensil();
		material4.describe();
		Material material5 = new Fork();
		material5.describe();
		Material material6 = new DessertFork();
		material6.describe();

		Metal metal = new Metal();
		metal.describe();
		metal.conductHeat();
		Metal metal1 = new Steel();
		metal1.describe();
		metal1.conductHeat();
		Metal metal2 = new StainlessSteel();
		metal2.describe();
		metal2.conductHeat();
		Metal metal3 = new KitchenUtensil();
		metal3.describe();
		metal3.conductHeat();
		Metal metal4 = new Fork();
		metal4.describe();
		metal4.conductHeat();
		Metal metal5 = new DessertFork();
		metal5.describe();
		metal5.conductHeat();

		Steel steel = new Steel();
		steel.describe();
		steel.conductHeat();
		steel.resistCorrosion();
		Steel steel1 = new StainlessSteel();
		steel1.describe();
		steel1.conductHeat();
		steel1.resistCorrosion();
		Steel steel2 = new KitchenUtensil();
		steel2.describe();
		steel2.conductHeat();
		steel2.resistCorrosion();
		Steel steel3 = new Fork();
		steel3.describe();
		steel3.conductHeat();
		steel3.resistCorrosion();
		Steel steel4 = new DessertFork();
		steel4.describe();
		steel4.conductHeat();
		steel4.resistCorrosion();

		StainlessSteel stainlessSteel = new StainlessSteel();
		stainlessSteel.describe();
		stainlessSteel.conductHeat();
		stainlessSteel.resistCorrosion();
		stainlessSteel.polish();
		StainlessSteel stainlessSteel1 = new KitchenUtensil();
		stainlessSteel.describe();
		stainlessSteel1.conductHeat();
		stainlessSteel1.resistCorrosion();
		stainlessSteel1.polish();
		StainlessSteel stainlessSteel3 = new Fork();
		stainlessSteel3.describe();
		stainlessSteel3.conductHeat();
		stainlessSteel3.resistCorrosion();
		stainlessSteel3.polish();
		StainlessSteel stainlessSteel4 = new DessertFork();
		stainlessSteel4.describe();
		stainlessSteel4.conductHeat();
		stainlessSteel4.resistCorrosion();
		stainlessSteel4.polish();

		KitchenUtensil kitchenUtensil = new KitchenUtensil();
		kitchenUtensil.describe();
		kitchenUtensil.conductHeat();
		kitchenUtensil.resistCorrosion();
		kitchenUtensil.polish();
		kitchenUtensil.use();
		KitchenUtensil kitchenUtensil1 = new Fork();
		kitchenUtensil1.describe();
		kitchenUtensil1.conductHeat();
		kitchenUtensil1.resistCorrosion();
		kitchenUtensil1.polish();
		kitchenUtensil1.use();
		KitchenUtensil kitchenUtensil2 = new DessertFork();
		kitchenUtensil2.describe();
		kitchenUtensil2.conductHeat();
		kitchenUtensil2.resistCorrosion();
		kitchenUtensil2.polish();
		kitchenUtensil2.use();

		Fork fork = new Fork();
		fork.describe();
		fork.conductHeat();
		fork.resistCorrosion();
		fork.polish();
		fork.use();
		fork.eatWith();
		Fork fork1 = new DessertFork();
		fork1.describe();
		fork1.conductHeat();
		fork1.resistCorrosion();
		fork1.polish();
		fork1.use();
		fork1.eatWith();

		DessertFork dessertFork = new DessertFork();
		dessertFork.describe();
		dessertFork.conductHeat();
		dessertFork.resistCorrosion();
		dessertFork.polish();
		dessertFork.use();
		dessertFork.eatWith();
		dessertFork.enjoySweets();

	}

}

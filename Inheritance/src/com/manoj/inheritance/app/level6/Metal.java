package com.manoj.inheritance.app.level6;

public class Metal extends Material{

	public boolean conductive = true;

	public void conductHeat() {
		System.out.println("invoking conductHeat() in Metal");
	}
}

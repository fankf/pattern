package com.fankf.pattern.creational.builder.test;

import com.fankf.pattern.creational.builder.utils.Meal;
import com.fankf.pattern.creational.builder.utils.MealBuilder;

public class MealTest {
	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		Meal noVegBurgerMeal = mb.NoVegBurgerMeal();
		noVegBurgerMeal.showItem();
		System.out.println("coast"+noVegBurgerMeal.getCoast());
	}

}

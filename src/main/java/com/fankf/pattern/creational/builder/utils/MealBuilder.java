package com.fankf.pattern.creational.builder.utils;

import com.fankf.pattern.creational.builder.entity.Cola;
import com.fankf.pattern.creational.builder.entity.ColdWater;
import com.fankf.pattern.creational.builder.entity.NoVegBurger;
import com.fankf.pattern.creational.builder.entity.VegBurger;

public class MealBuilder {
	public Meal NoVegBurgerMeal() {
		Meal meal = new Meal();
		meal.addItem(new NoVegBurger());
		meal.addItem(new Cola());
		return meal;
	}
	
	public Meal VegBurgerMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new ColdWater());
		return meal;
	}
}

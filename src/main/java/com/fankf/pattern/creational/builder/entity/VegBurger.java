package com.fankf.pattern.creational.builder.entity;

public class VegBurger extends Burger {

	@Override
	public String getName() {
		return "VegBurger";
	}

	@Override
	public Float getPrice() {
		return 12.0f;
	}

}

package com.fankf.pattern.creational.builder.entity;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String getName();

	@Override
	public Packing getPacking() {
		return new Bottle();
	}

	@Override
	public abstract Float getPrice();

}

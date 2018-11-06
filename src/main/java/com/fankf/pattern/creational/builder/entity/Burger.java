package com.fankf.pattern.creational.builder.entity;

public abstract class Burger implements Item {

	@Override
	public abstract String getName();

	@Override
	public Packing getPacking() {
		return new Wrapper();
	}

	@Override
	public abstract Float getPrice();

}

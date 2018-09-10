package com.fankf.pattern.creational.abstractFactory.entity;

public class Red implements Color{

	@Override
	public String getColor() {
		System.out.println("red.............");
		return "red";
	}

}

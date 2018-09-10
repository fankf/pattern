package com.fankf.pattern.creational.abstractFactory.entity;

public class Circle implements Shape{

	@Override
	public String getShape() {
		System.out.println("getShape...........Circle");
		return "Circle";
	}


}

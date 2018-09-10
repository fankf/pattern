package com.fankf.pattern.creational.abstractFactory.entity;

public class Square implements Shape{

	@Override
	public String getShape() {
		System.out.println("getShape...........Square");
		return "Square";
	}


}

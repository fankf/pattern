package com.fankf.pattern.creational.abstractFactory.entity;

public class Green implements Color{

	@Override
	public String getColor() {
		System.out.println("getColor.........Green....");
		return "Green";
	}

}

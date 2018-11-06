package com.fankf.pattern.creational.prototype.entity;


public class Cat extends Animal {
	
	public Cat() {
		name = "cat";
	}
	
	@Override
	public Animal getAnimal() {
		System.out.println("Cat.....");
		return new Cat();
	}

}

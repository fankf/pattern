package com.fankf.pattern.creational.prototype.entity;


public class Dog extends Animal {
	
	public Dog() {
		name = "dog";
	}
	
	@Override
	public Animal getAnimal() {
		System.out.println("Dog.....");
		return new Dog();
	}

}

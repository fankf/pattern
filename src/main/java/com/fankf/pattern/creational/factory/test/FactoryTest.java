package com.fankf.pattern.creational.factory.test;

import com.fankf.pattern.creational.factory.entity.Animal;
import com.fankf.pattern.creational.factory.utils.AnimalFactory;

public class FactoryTest {
	public static void main(String[] args) {
		Animal animal = AnimalFactory.getAnimal("dog");
		System.out.println(animal);
		animal.run();
	}
}

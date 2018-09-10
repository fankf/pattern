package com.fankf.pattern.creational.abstractFactory.utils;

public class FactoryProducer {
	public AbstractClothesFactory getFactory(String name) {
		if(name.equalsIgnoreCase("Shirt")) {
			AbstractClothesFactory ab = new ShirtFactory();
			return ab;
		}else if(name.equalsIgnoreCase("Pants")) {
			AbstractClothesFactory ab = new PantsFactory();	
			return ab;
		}
		return null;
	}
}

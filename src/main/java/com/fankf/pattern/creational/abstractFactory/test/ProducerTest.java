package com.fankf.pattern.creational.abstractFactory.test;

import com.fankf.pattern.creational.abstractFactory.utils.AbstractClothesFactory;
import com.fankf.pattern.creational.abstractFactory.utils.FactoryProducer;

public class ProducerTest {
	public static void main(String[] args) {
		
		FactoryProducer p = new FactoryProducer();
		AbstractClothesFactory factory = p.getFactory("Shirt");
		factory.getColor("Red");
	}
}

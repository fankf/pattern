package com.fankf.pattern.creational.abstractFactory.entity;

public abstract class AbstractClothesFactory {
	public abstract AbstractClothesFactory getFactory(String factoryName);
}

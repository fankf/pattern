package com.fankf.pattern.behavior.strategy.service.impl;

import com.fankf.pattern.behavior.strategy.service.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak...");
		
	}


}

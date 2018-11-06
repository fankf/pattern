package com.fankf.pattern.behavior.strategy.service.impl;

import com.fankf.pattern.behavior.strategy.service.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("QuackQuack...");
		
	}


}

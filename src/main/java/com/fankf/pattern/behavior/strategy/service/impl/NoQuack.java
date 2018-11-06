package com.fankf.pattern.behavior.strategy.service.impl;

import com.fankf.pattern.behavior.strategy.service.QuackBehavior;

public class NoQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("NoQuackNoQuack...");
		
	}


}

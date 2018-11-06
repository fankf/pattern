package com.fankf.pattern.behavior.strategy.service.impl;

import com.fankf.pattern.behavior.strategy.service.FlyBehavior;

public class NoFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("can not fly");
		
	}

}

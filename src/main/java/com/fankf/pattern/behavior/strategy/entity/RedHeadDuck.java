package com.fankf.pattern.behavior.strategy.entity;

import com.fankf.pattern.behavior.strategy.entity.supertype.Duck;
import com.fankf.pattern.behavior.strategy.service.impl.FlyByWing;
import com.fankf.pattern.behavior.strategy.service.impl.NoQuack;

public class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		flyBehavior = new FlyByWing();
		quackBehavior = new NoQuack();
	}
}

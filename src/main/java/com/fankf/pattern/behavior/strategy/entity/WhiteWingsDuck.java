package com.fankf.pattern.behavior.strategy.entity;

import com.fankf.pattern.behavior.strategy.entity.supertype.Duck;
import com.fankf.pattern.behavior.strategy.service.impl.FlyByNoWing;
import com.fankf.pattern.behavior.strategy.service.impl.Quack;

public class WhiteWingsDuck extends Duck{
	public WhiteWingsDuck() {
		flyBehavior = new FlyByNoWing();
		quackBehavior = new Quack();
	}
}

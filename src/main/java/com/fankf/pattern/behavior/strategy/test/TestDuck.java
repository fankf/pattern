package com.fankf.pattern.behavior.strategy.test;

import com.fankf.pattern.behavior.strategy.entity.RedHeadDuck;
import com.fankf.pattern.behavior.strategy.entity.WhiteWingsDuck;
import com.fankf.pattern.behavior.strategy.entity.supertype.Duck;
import com.fankf.pattern.behavior.strategy.service.FlyBehavior;
import com.fankf.pattern.behavior.strategy.service.impl.NoFly;

public class TestDuck {
	public static void main(String[] args) {
		Duck redDuck = new RedHeadDuck();
		Duck whiteWingsDuck = new WhiteWingsDuck();
		redDuck.flyMethod();
		whiteWingsDuck.flyMethod();
		redDuck.quackMethod();
		whiteWingsDuck.quackMethod();
		FlyBehavior fb = new NoFly();
		redDuck.setFlyBehavior(fb);
		redDuck.flyMethod();
	}
}

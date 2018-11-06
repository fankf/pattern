package com.fankf.pattern.behavior.strategy.entity.supertype;

import com.fankf.pattern.behavior.strategy.service.FlyBehavior;
import com.fankf.pattern.behavior.strategy.service.QuackBehavior;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
//	public void setFlyBehavior(FlyBehavior fb){
//		flyBehavior = fb;
//	}
//	public void setQuackBehavior(QuackBehavior qb){
//		quackBehavior = qb;
//	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void flyMethod() {
		flyBehavior.fly();
	};

	public void quackMethod() {
		quackBehavior.quack();
	};
}

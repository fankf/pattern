package com.fankf.pattern.creational.factory.utils;

import com.fankf.pattern.creational.factory.entity.Animal;
import com.fankf.pattern.creational.factory.entity.Cat;
import com.fankf.pattern.creational.factory.entity.Dog;
import com.fankf.pattern.creational.factory.entity.Monkey;

public class AnimalFactory{

	public static Animal getAnimal(String name) {
		if(name.equalsIgnoreCase("CAT")) {
			return new Cat();
		}else if (name.equalsIgnoreCase("DOG")) {
			return new Dog();
		}else if (name.equalsIgnoreCase("MONKEY")){
			return new Monkey();
		}else {
			System.out.println("此动物不存在！！");
		}
		return null;
	}
	
}

package com.fankf.pattern.creational.prototype.Utils;

import java.util.Hashtable;
import java.util.Map;

import com.fankf.pattern.creational.prototype.entity.Animal;
import com.fankf.pattern.creational.prototype.entity.Cat;
import com.fankf.pattern.creational.prototype.entity.Dog;

public class PrototypeCache {
	private static Map<Integer,Animal> map = new Hashtable<>(); 
	
	public static Animal getAnimal(Integer id){
		Animal animal = map.get(id);
		return (Animal) animal.clone();
	}
	
	public static void addCache() {
		Dog dog = new Dog();
		dog.setId(1);
		map.put(dog.getId(),dog);
		Cat cat = new Cat();
		cat.setId(2);
		map.put(cat.getId(),cat);
	}
}

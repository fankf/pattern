package com.fankf.pattern.creational.prototype.test;

import com.fankf.pattern.creational.prototype.Utils.PrototypeCache;
import com.fankf.pattern.creational.prototype.entity.Animal;

public class TestProtoType {
	public static void main(String[] args) {
		//添加缓存数据
		PrototypeCache.addCache();
		//获取第一个动物
		Animal animal = PrototypeCache.getAnimal(1);
		System.out.println(animal.getName());
		//获取第二个动物
		Animal animal2 = PrototypeCache.getAnimal(2);
		System.out.println(animal2.getName());
		//判断两个对象是否是一个
		Animal animal3 = PrototypeCache.getAnimal(2);
		System.out.println(animal2.equals(animal3));
	}
}

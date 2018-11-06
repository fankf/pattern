package com.fankf.pattern.creational.builder.utils;

import java.util.ArrayList;
import java.util.List;

import com.fankf.pattern.creational.builder.entity.Item;

public class Meal {
	private List<Item> list = new ArrayList<>();
	
	public void addItem(Item item) {
		list.add(item);
	}
	
	public Float getCoast() {
		Float f = new Float(0);
		for (Item item : list) {
			f += item.getPrice();
			
		}
		return f;
	}
	
	public void showItem() {
		for (Item item : list) {
			System.out.print("Name:"+item.getName());
			System.out.print("，Packing:"+item.getPacking().pack());
			System.out.println("，Price:"+item.getPrice());
		}
	}
}

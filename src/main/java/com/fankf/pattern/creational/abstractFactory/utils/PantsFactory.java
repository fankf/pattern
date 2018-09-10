package com.fankf.pattern.creational.abstractFactory.utils;

import com.fankf.pattern.creational.abstractFactory.entity.Circle;
import com.fankf.pattern.creational.abstractFactory.entity.Color;
import com.fankf.pattern.creational.abstractFactory.entity.Green;
import com.fankf.pattern.creational.abstractFactory.entity.Red;
import com.fankf.pattern.creational.abstractFactory.entity.Shape;
import com.fankf.pattern.creational.abstractFactory.entity.Square;

public class PantsFactory extends AbstractClothesFactory{

	@Override
	public void getColor(String color) {
		System.out.println("PantsFactory.....getColor");
		Color color2 = null;
		if("RED".equalsIgnoreCase(color)) {
			System.out.println("new Red();");
			color2 = new Red();
		}else if("Green".equalsIgnoreCase(color)) {
			System.out.println("new Green();");
			color2 = new Green();
		}
		
	}

	@Override
	public void getShape(String shape) {
		System.out.println("PantsFactory.....getShape");
		Shape shape2 = null;
		if("Circle".equalsIgnoreCase(shape)) {
			System.out.println("new Circle();");
			shape2 = new Circle();
		}else if("Square".equalsIgnoreCase(shape)) {
			System.out.println("new Square();");
			shape2 = new Square();
		}
	}

 
}

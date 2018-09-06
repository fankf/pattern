package com.fankf.pattern.creational.factory.entity;

public class Dog implements Animal{
	private Integer animalId;
	private String type;

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [animalId=" + animalId + ", type=" + type + "]";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Animal======>>>Dog");
	}
	
	
}

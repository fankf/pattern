package com.fankf.pattern.creational.factory.entity;

public class Cat implements Animal{
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
		return "Cat [animalId=" + animalId + ", type=" + type + "]";
	}
	
	@Override
	public void run() {
		System.out.println("Animal======>>>Cat");
	}
}

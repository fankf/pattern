package com.fankf.pattern.structural.proxy.entity;

import lombok.Data;

@Data
public class Student implements Play{
	private int studentNo;
	private String studentName;
	
	@Override
	public void play() {
		studentName = "zzz";
		System.out.println("zzz");
	}
}

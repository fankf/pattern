package com.fankf.pattern.structural.proxy.service;

import com.fankf.pattern.structural.proxy.entity.Play;
import com.fankf.pattern.structural.proxy.entity.Student;

public class StudentProxy implements Play{
	private Student student;
	private String log;
	
	@Override
	public void play() {
		if(student == null)
			student = new Student();
		student.play();
	}
}

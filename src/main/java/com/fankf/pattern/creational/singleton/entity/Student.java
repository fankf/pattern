package com.fankf.pattern.creational.singleton.entity;

public class Student {
	private int studentNo;
	private String studentName;

	public Student() {
	}

	public Student(int studentNo, String studentName) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}

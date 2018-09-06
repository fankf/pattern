package com.fankf.pattern.creational.singleton.utils;

import com.fankf.pattern.creational.singleton.entity.Student;


/**
 * @author fan
 *	DCL double-checked locking双重锁
 *	特点：
 *		1.懒加载
 *		2.线程安全
 *		3.在多线程的情况下保证高性能
 */
public class DCLSingleton {
	private static volatile Student student;
	private DCLSingleton() {};
	public Student getStudent() {
		synchronized (DCLSingleton.class) {
			if (student == null) {
				student = new Student();
			}
		}
		return student;
	}
	public Student getStudent(int studentNo,String studentName) {
		synchronized (DCLSingleton.class) {
			if (student == null) {
				student = new Student();
			}
		}
		student.setStudentNo(studentNo);
		student.setStudentName(studentName);
		return student;
	}
	
}

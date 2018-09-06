package com.fankf.pattern.creational.singleton.utils;

import com.fankf.pattern.creational.singleton.entity.Student;

/**
 * @author fan
 *	饿汉式 单例模式
 *	特点：
 *		1.线程安全
 *		2.懒加载：否
 *		3.容易浪费内存，产生垃圾对象
 *		4.最常用
 */
public class HungrySingleton {
	private static Student student = new Student();
	//私有的构造器
	private HungrySingleton(){};
	
	public static Student getStudent() {
		return student;
	} 
	public static Student getStudent(int studentNo,String studentName) {
		student.setStudentNo(studentNo);
		student.setStudentName(studentName);
		return student;
	} 
}

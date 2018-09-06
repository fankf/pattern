package com.fankf.pattern.creational.singleton.utils;

import com.fankf.pattern.creational.singleton.entity.Student;

/**
 * @author fan
 *	懒汉式单例模式
 *	特点：
 *		私有的构造器
 *		私有的创建对象方式
 *		调用方法时加载对象
 *	注意：多线程无法使用
 */
public class LazySingleton {
	private static Student student;
	private LazySingleton() {};
	public static Student getStudent() {
		if(student == null)
			student = new Student();
		return student;
	}
	public static Student getStudent(int studentNo,String studentName) {
		if(student == null) {
			student = new Student();
			System.out.println("student == null");
		}
		student.setStudentNo(studentNo);
		student.setStudentName(studentName);
		return student;
	} 
}

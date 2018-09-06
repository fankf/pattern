package com.fankf.pattern.creational.singleton.utils;

import com.fankf.pattern.creational.singleton.entity.Student;


/**
 * @author fan
 *	静态内部类单例模式
 *	特点：
 *		1。懒加载
 *		2.线程安全
 *		同样通过延迟加载的方式加载类对象，相对于饿汉式，做到的懒加载方式
 *		只有调用getStudent()方法的时候才会加载静态内部类，想要做到延迟加载的效果这种方式是比较合理的
 */
public class StaticInnerClassSingleton {
	private static class SingletonInstance{
		private static final Student student = new Student();
	}
	private StaticInnerClassSingleton() {};
	public static Student getStudent() {
		Student student = SingletonInstance.student;
		return student;
	}
	public static Student getStudent(int studentNo,String studentName) {
		Student student = SingletonInstance.student;
		student.setStudentName(studentName);
		student.setStudentNo(studentNo);
		return student;
	}
}

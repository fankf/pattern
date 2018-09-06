package com.fankf.pattern.singleton.utils;

import com.fankf.pattern.singleton.entity.Student;

/**
 * @author fan
 *	加锁懒汉式单例模式
 *	特点:1.线程安全
 *		2.懒加载
 *		3.效率低，浪费内存，一般不用，因为大多数时候不需要考虑线程安全
 */
public class SynchronizedSingleton {
	private static Student student;
	private SynchronizedSingleton() {}
	public synchronized Student getStudent() {
		if(student == null) {
			student = new Student();
		}
		return student;
	}
}

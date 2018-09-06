package com.fankf.pattern.creational.singleton.utils;
/**
 * @author fan
 *	枚举就是单例模式的体现
 */
public enum SingletonEnum{
	STUDENT(12,"里斯"),
	INSTANCE;
	private SingletonEnum() {};
	private SingletonEnum(int studentNo,String studentName) {
		
	};
	
}

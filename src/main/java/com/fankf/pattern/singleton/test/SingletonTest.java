package com.fankf.pattern.singleton.test;

import com.fankf.pattern.singleton.entity.Student;
import com.fankf.pattern.singleton.utils.HungrySingleton;
import com.fankf.pattern.singleton.utils.LazySingleton;
import com.fankf.pattern.singleton.utils.SingletonEnum;
import com.fankf.pattern.singleton.utils.StaticInnerClassSingleton;

public class SingletonTest {
	public static void main(String[] args) {
		Student student = HungrySingleton.getStudent();
		Student student2 = HungrySingleton.getStudent(12, "张三");
		System.out.println("student====>>>>姓名："+student2.getStudentName()+"学号:"+student2.getStudentNo());
		System.out.println(student == student2);
		
		//2.切换13与14行可以明确看出是否是单例
		Student student4 = LazySingleton.getStudent(12, "张三");
		Student student3 = LazySingleton.getStudent();
		System.out.println(student3);
		
		//5.innerClass
		Student student5 = StaticInnerClassSingleton.getStudent(12, "lisi");
		System.out.println(student5);
		
		SingletonEnum singletonEnum = SingletonEnum.STUDENT;
		System.out.println(singletonEnum);
	}
}

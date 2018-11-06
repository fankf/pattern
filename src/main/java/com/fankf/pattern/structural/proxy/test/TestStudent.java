package com.fankf.pattern.structural.proxy.test;

import com.fankf.pattern.structural.proxy.entity.Play;
import com.fankf.pattern.structural.proxy.service.StudentProxy;

public class TestStudent {
	public static void main(String[] args) {
		Play pl = new StudentProxy();
		pl.play();
	}
}

package com.fankf.pattern.structural.adapter.test;

import com.fankf.pattern.structural.adapter.service.impl.Mp3Player;

public class TestMp3Player {
	public static void main(String[] args) {
		Mp3Player mp3 = new Mp3Player();
		mp3.play("mp3", "zzz");
		mp3.play("mp4", "aaa");
		mp3.play("avi", "bbb");
	}
}

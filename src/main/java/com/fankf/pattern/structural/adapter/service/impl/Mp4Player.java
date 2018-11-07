package com.fankf.pattern.structural.adapter.service.impl;

import com.fankf.pattern.structural.adapter.service.VideoMediaPlayer;

public class Mp4Player implements VideoMediaPlayer{

	@Override
	public void play(String fileName) {
		System.out.println("Mp4Player...."+fileName);
		
	}
	
}
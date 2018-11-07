package com.fankf.pattern.structural.adapter.service.impl;

import com.fankf.pattern.structural.adapter.service.VideoMediaPlayer;

public class AviPlayer implements VideoMediaPlayer{

	@Override
	public void play(String fileName) {
		System.out.println("AviPlayer...."+fileName);
		
	}
	
}
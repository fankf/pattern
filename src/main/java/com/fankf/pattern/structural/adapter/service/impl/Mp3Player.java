package com.fankf.pattern.structural.adapter.service.impl;

import com.fankf.pattern.structural.adapter.service.MediaPlay;
import com.fankf.pattern.structural.adapter.service.adapter.VideoPlayerAdapter;

public class Mp3Player implements MediaPlay{
	VideoPlayerAdapter videoAdapter;
	@Override
	public void play(String mediaType, String fileName) {
		if("MP3".equals(mediaType.toUpperCase())) {
			System.out.println("MP3....");
		}else if("MP4".equals(mediaType.toUpperCase())||"AVI".equals(mediaType.toUpperCase())) {
			videoAdapter = new VideoPlayerAdapter(mediaType);
			videoAdapter.play(mediaType, fileName);
		}
		
	}

}

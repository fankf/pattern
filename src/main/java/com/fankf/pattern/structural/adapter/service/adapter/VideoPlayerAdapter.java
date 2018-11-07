package com.fankf.pattern.structural.adapter.service.adapter;

import com.fankf.pattern.structural.adapter.service.MediaPlay;
import com.fankf.pattern.structural.adapter.service.VideoMediaPlayer;
import com.fankf.pattern.structural.adapter.service.impl.AviPlayer;
import com.fankf.pattern.structural.adapter.service.impl.Mp4Player;

public class VideoPlayerAdapter implements MediaPlay{
	private VideoMediaPlayer mediaPlayer;
	
	/**
	 * 初始化
	 * @param mediaType 视频格式类型
	 */
	public VideoPlayerAdapter(String mediaType) {
		if("MP4".equals(mediaType.toUpperCase())){
			mediaPlayer = new Mp4Player();
		}else if("AVI".equals(mediaType.toUpperCase())) {
			mediaPlayer = new AviPlayer();
		}
	}
	
	@Override
	public void play(String mediaType,String fileName) {
		mediaPlayer.play(fileName);
	}
	
	
}

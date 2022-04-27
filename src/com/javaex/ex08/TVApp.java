package com.javaex.ex08;

public class TVApp {
	
	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
		tv.power(true);
		tv.setVolume(120);
		tv.status();
		
		tv.volume(true);
		tv.status();
		
		tv.volume(true);//볼륨 업
		tv.status();
		
		tv.channel(true);//채널 업
		tv.status();
		
		tv.setChannel(254);
		tv.status();

		tv.channel(true);//채널 업
		tv.channel(true);//채널 업
		tv.channel(true);//채널 업
		tv.channel(true);//채널 업
		tv.status();

		tv.status();
		tv.status();
		tv.status();
		tv.status();
		tv.status();
		
	}

}

package com.javaex.ex08;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자

	public TV() {
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		// 볼륨 0<x<100 고정
		if (volume<0) {
			volume = 0;
		} else if (this.volume>100){
			volume = 100;
		}
		
		// 채널 1<x<255 고정
		if (channel<1) {
			this.channel = 1;
		} else if (this.channel>255){
			channel = 255;
		}
	}
	
	

	//메소드 gs
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	
	
	//메소드 일반
	
	public void power (boolean on) {
		if (on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	
	public void channel( int channel ) {
		if(this.power == true) {//TV가 켜져있을때만 작동
			// 채널 1<x<255 고정
			if (channel<1) {
				this.channel = 1;
			} else if (channel>255){
				this.channel = 255;
			}
		}else {
			System.out.println("전원이 껴져있습니다.");
		}
	}
	public void channel(boolean up) { // up일때 볼륨 +1
		if(up == true) {
			channel = this.channel + 1;
		}else {
			channel = this.channel -1;
		}
	}
	
	
	public void volume(int voluem) {
		if(this.power == true) {//TV가 켜져있을때만 작동
			// 볼륨 0<x<100 고정
			if (volume<0) {
				this.volume = 0;
			} else if (volume>100){
				this.volume = 100;
			}
		}else {
			System.out.println("전원이 껴져있습니다.");
		}
	}
	public void volume(boolean up) { // up일때 볼륨 +1
		if(up == true) {
			volume = this.volume + 1;
		}else {
			volume = this.volume -1;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	public void status() {
		System.out.println("채널:" + channel + ", 볼륨:" + volume + ", 전원:" + power + "");
	}
	
	
}

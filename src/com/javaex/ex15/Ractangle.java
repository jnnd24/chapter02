package com.javaex.ex15;

public class Ractangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	public Ractangle() {
		super();
	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	//메gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", fillColor=" + super.fillColor + ", lineColor="
				+ super.lineColor + "]";
	}
	
	
	

}

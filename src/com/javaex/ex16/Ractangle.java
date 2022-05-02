package com.javaex.ex16;

public class Ractangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	public Ractangle() {
		super();
		//System.out.println("Ractangle()");
	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
		//super(fillColor, lineColor);
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		//System.out.println("Ractangle(4)");
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
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + 
		                        ", 가로:" + width + ", 세로:" + height + 
		                        "] 사각형을 그렸습니다. " );
		}

	public double area() {
		double area = width * height;
		return area;
	}
	
	
	

}

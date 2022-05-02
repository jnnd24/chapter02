package com.javaex.ex16;

public class Circle extends Shape {
	
	private int radius;

	

	//생성자

	public Circle() {
		super();
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	
	
	//메소드gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	
	//메소드일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색:" + lineColor + ", 반지름: " + radius + "] 원을 그렸습니다.");
	}
	
	public double area() {
		double area = 3.14 * radius * radius;
		return area;
	}

}

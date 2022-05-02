package com.javaex.ex18;

public abstract class Shape {
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자
	public Shape() {
		//System.out.println("Shape()");
	}
	
	public Shape(String fillColor, String lineColor) {
		//System.out.println("Shape(2)");
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	
	//메소드gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
	//메소드일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	//인터페이스에서 draw 관리할 예정
	//public abstract void draw();
	
	public abstract double area();
	
	

}

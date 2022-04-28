package com.javaex.ex15;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Shape s01 = new Shape("빨강", "노랑");
		System.out.println(s01);
		s01.draw();
		
		
		
		Ractangle r01 = new Ractangle("빨강", "검정", 4, 6);
		System.out.println(r01.toString());
		
	}

}

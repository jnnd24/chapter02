package com.javaex.ex15;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		/*
		Shape s01 = new Shape("빨강", "노랑");
		System.out.println(s01);
		s01.draw();
		*/
		
		
		Ractangle r01 = new Ractangle("빨강", "검정", 4, 6);
		Ractangle r02 = new Ractangle("노랑", "검정", 7, 7);
		
		Ractangle[] rArray = new Ractangle[2];
		rArray[0] = r01;
		rArray[1] = r02;
		
		for(int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		/*
		r01.draw();
		r02.draw();
		*/
	}

}

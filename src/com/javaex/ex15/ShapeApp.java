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
		
		
		//Circle
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		
		Circle[] cArray = new Circle[2];
		cArray[0] = c01;
		cArray[1] = c02;
		
		for(int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		//Triangle
		Triangle t01 = new Triangle("빨강","검정",4,4);
		Triangle t02 = new Triangle("보라","검정",10,10);
		
		Triangle[] tArray = new Triangle[2];
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		
		
		
	}

}

package com.javaex.ex04;

public class PointApp {
	
	public static void main(String[] args){
		
		Point p1 = new Point(5, 5);
		//p1.setX(5);
		//p1.setY(5);
		
		Point p2 = new Point(10);
		//p2.setX(10);
		p2.setY(23);
		
		
		//1) draw() 메소드를호출하여다음과같이출력하세요
		p1.draw();
		p2.draw();
		
		p1.draw(false); // boolean을 줘서 false면 지우기
		p2.draw(false);
		
		
	}

}

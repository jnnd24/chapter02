package com.javaex.ex14;

public class MainApp {

	public static void main(String[] args) {

		
/*
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		System.out.println(t01);

		Triangle t02 = new Triangle("보라", "검정", 10, 10);
		System.out.println(t02);
		
		System.out.println(c01);

		System.out.println(c02);
		*/
		
		
		
		
		
		
		//배열 생성
		Ractangle[] rArray = new Ractangle[2];
		Circle[] cArray = new Circle[2];
		
		//사각형생성
		Ractangle r01 = new Ractangle("빨강", "검정", 4, 4);
		Ractangle r02 = new Ractangle("주황", "검정", 5, 5);
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
		
		
		//배열에 도형 넣기
		rArray[0] = r01;
		rArray[1] = r02;
		cArray[0] = c01;
		cArray[1] = c02;
		
		//배열을 이용해 전체사각형 출력하기
		for(int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		for(int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		//r01.draw();
		//r02.draw();
		//t01.draw();
		
	}

}

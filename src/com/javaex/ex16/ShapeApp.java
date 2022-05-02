package com.javaex.ex16;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		//Shape아파트로 배열관리하기
		
		
		
		
		
		//Shape s = new Shape("빨강", "노랑");
		
		Ractangle r = new Ractangle("빨강", "검정", 5, 5);
		//System.out.println(r.getWidth()); // 자식이니까 당연히 자식메소드 사용 가능
		
		//메모리에는 다 올라갔지만, 부모만 보인다 (섞어쓰기)
		Shape sr = new Ractangle("빨강", "검정", 15, 15);
		//System.out.println(sr.getWidth()); // 자식메소드 못씀
		
		
		/* Shape 배열에 모든 도형을 담아서 관리하기 !!!! */

		//배열생성
		Shape[] sArray = new Shape[6];


		//사각형 2개
		Shape r01 = new Ractangle("빨강", "검정", 4, 4);
		Shape r02 = new Ractangle("주황", "검정", 5, 5);
		
		//원 2개
		Shape c01 = new Circle("노랑","검정", 6);
		Shape c02 = new Circle("초록", "검정", 7);
		
		//삼각형 2개
		Shape t01 = new Triangle("파랑", "검정", 8, 8);
		Shape t02 = new Triangle("남색", "검정", 9, 9);
		
		//배열에 담기
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;
		
		
		for (int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}
		
		((Ractangle)sArray[0]).getWidth();
		
		System.out.println("==========");
		//라인컬러 바꾸기
		for(int i=0; i<sArray.length; i++) {
			sArray[i].setLineColor("보라");
		}
		
		//라인컬러바꾼거 출력
		for (int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
	}

}

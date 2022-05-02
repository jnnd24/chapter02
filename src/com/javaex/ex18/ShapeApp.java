package com.javaex.ex18;

public class ShapeApp {
	
	public static void main(String[] args) {
		/*
		Point p01 = new Point(3,5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(100,100);
		p02.draw();
		//System.out.println(p02.getClass());
		
		
		
		System.out.println("=============================");
		


		Ractangle r00 = new Ractangle("빨강", "검정", 1, 1);
		r00.draw();
		r00.area();
		

		Shape r01 = new Ractangle("빨강", "검정", 5, 5);
		r01.area();
		//r01.draw();

		Drawable r02 = new Ractangle("빨강", "검정", 10, 10);
		r02.draw();
		//r02.area();
		//r02.getWidth();
		
		*/
		

		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle ("빨강", "검정", 1, 1);
		Drawable c01 = new Circle("파랑", "검정", 3);
		Drawable t01 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8, 8);

		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i = 0; i< dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로, 다운캐스팅(시선바꾸기)
		System.out.println(((Ractangle)dArray[0]).getWidth());
		
		//사각형 면 색
		System.out.println(((Ractangle)dArray[0]).fillColor);
		
		System.out.println("=================");
		System.out.println("배열을 통해 면적 구하기");
		
		//Point에는 area가 없어서 오류뜨는거임
		for(int i=0;i<dArray.length;i++) {
			
			//System.out.println((dArray[i] instanceof Drawable));
			//t or f로 결과 포시 됨
			
			if(dArray[i] instanceof Shape) // t 인것만 표시하면 된다~라는 의미로 사용
			System.out.println(((Shape)dArray[i]).area());
			
			
		}
		
		
		
		
		
		
	}

}

package com.javaex.ex11;

public class Math {
	
	//필드
	private static double pi = 3.14;
	
	//생성자
	public Math() {
	}
	
	
	
	//메소드gs
	
	
	//메소드일반
	
	//스태틱으로먼저올리기
	public static int plus (int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
	
	public static double cArea(int radius) {
		double area = pi*radius*radius;
		return area;
	}
	
	

}

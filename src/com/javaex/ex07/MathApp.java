package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {

		Math m1 = new Math();
		System.out.println(m1.plus(2, 5)); // 2+5 = 7
		System.out.println(m1.plus(3.2, 5)); // 3.2+5 = 8.2
		System.out.println(m1.plus(5, 3.2)); //5+3.2 = 8.2
		System.out.println(m1.plus(3.2, 5.1)); //3.2+5.1 = 8.3 
		
		
	}

}

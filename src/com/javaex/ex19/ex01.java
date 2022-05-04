package com.javaex.ex19;

import java.util.Scanner;

public class ex01 {//예외처리 1
	
	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		try {
			result = 100/num;
			System.out.println(result);
		}catch (ArithmeticException e) { //ArithmeticException라는 오류가 뜨는 경우
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("finally영역");
		}
		
		//result = 100/num;
		
		//System.out.println(result);
		
		
		
		sc.close();
		
	}

}

package com.javaex.ex10;

public class GoodsApp {
	
	static public void main(String[] args) {
		
		//static 사전조사
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera);
		System.out.println(camera.count);
		System.out.println(Goods.count);
		
		Goods computer = new Goods("LG그램", 900000);
		System.out.println(computer);
		System.out.println(computer.count);
		System.out.println(Goods.count);
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		
		
		
		
		
		
	}

}

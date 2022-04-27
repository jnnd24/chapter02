package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		Goods computer = new Goods("LG그램", 900000);

		Goods camera = new Goods("니콤", 400000);
		
		Goods cup = new Goods("머그컵", 2000);

		//System.out.println(computer.getName());
		//System.out.println(computer.getPrice());
		
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup);
	}

}

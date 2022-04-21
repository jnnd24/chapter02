package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		System.out.println("상품이름: " + camera.getName() + " 상품가격: " + camera.getPrice());
		
		
		String camName = camera.getName();
		System.out.println(camName);
		//System.out.println(camera.name);
		
		int camPrice = camera.getPrice();
		System.out.println(camPrice);
		
		camera.showinfo();
		
		
		
	}

}

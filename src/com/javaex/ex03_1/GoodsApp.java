package com.javaex.ex03_1;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		String camName = camera.getName();
		int camPrice = camera.getPrice();
		
		System.out.println(camName + camPrice);
		
		
	}

}

package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("장성찬", 27);
		System.out.println(p01);
		
		p01.showInfo();
		
		Student s01 = new Student ("서울고등학교");
		System.out.println(s01);
		
		Student s02 = new Student ();
		s02.getAge();
		
	}

}

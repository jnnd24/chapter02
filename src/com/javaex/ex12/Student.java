package com.javaex.ex12;

public class Student extends Person {
	
	
	//필드
	private String schoolName;

	
	//생성자
	public Student() {
		super();
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		//부모를 메모리에 올리는거
		super(name, age);//부모에서 name, age를 불러오기
		this.schoolName = schoolName;//학교명
		System.out.println("Stueden(3)");
	}


	//메소드 gs
	public String getChoolName() {
		return schoolName;
	}


	public void setChoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	



	
	//메소드 일반
	/*@Override
	public String toString2() {
		return "Student [schoolName=" + schoolName + getName() + "," + getAge() + "]";
	}*/
	

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + name + ", getAge()=" + age + "]";
	}
	
	/*public void showInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 학교: " + schoolName);
	}*/
	
	public void showInfo() {
		System.out.println(this.toString());
		System.out.println("학교: " + schoolName);
	}
	
	

}

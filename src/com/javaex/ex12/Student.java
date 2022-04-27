package com.javaex.ex12;

public class Student extends Person {
	
	
	//필드
	private String choolName;


	
	
	
	//생성자
	public Student() {
	}
	
	public Student(String choolName) {
		this.choolName = choolName;
	}


	//메소드 gs
	public String getChoolName() {
		return choolName;
	}


	public void setChoolName(String choolName) {
		this.choolName = choolName;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [choolName=" + choolName + "]";
	}
	
	
	

}

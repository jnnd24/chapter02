package com.javaex.ex12;

public class Student extends Person {
	
	
	//필드
	private String schoolName;


	
	
	
	//생성자
	public Student() {
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}


	//메소드 gs
	public String getChoolName() {
		return schoolName;
	}


	public void setChoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	

}

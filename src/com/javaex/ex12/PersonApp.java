package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		//Person p01 = new Person("장성찬", 27);
		//p01.showInfo();
		
		/*
		Student s01 = new Student ("서울고등학교");
		System.out.println(s01);
		*/
		/*
		Student s02 = new Student ();
		s02.setName("장성찬");
		s02.setAge(22);
		s02.setChoolName("서울고");
		*/
		//System.out.println(s02.toString());
		

		Student s03 = new Student ("장성찬", 27, "서울고등");
		//System.out.println(s03.getName());
		//System.out.println(s03.toString());
		s03.showInfo();
		
		/*
		생성자 순서
		 1.자식 -> 시작만하고 완료되지않음 // -> 부모 생성자 호출
		 2. 부모 완료
		 3. 자식 완료
		 
		 
		자식생성자가 부모생성자 부르는법 -- > super();
		 super(파라미터);
		 
		 
		 
		기본적으로 한몸처럼 움직이지만,
		부모의 필드,메소드가 private 면 자식이어도 못쓴다 (클래스가 달라서)
		
		
		
		 * 부모,자식 메소드 이름이 같을 떄 (ex. toString)
		
		
		*/
		
		
		
		
		
	}

}

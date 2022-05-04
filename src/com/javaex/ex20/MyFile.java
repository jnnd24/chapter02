package com.javaex.ex20;

import java.io.IOException;

public class MyFile {
	//만든사람 제임스
	
	//필드
	
	
	//생성자
	public MyFile() {
		
	}
	
	//메소드gs
	
	//메소드일반
	//정상경로로 파일을 불러온 경우
	public String read(String path) {
		//path에 있는 파일을 읽어서 문자열로 만들어준다
		String result = "학교종이 떙땡땡";//예제
		
		return result;
		
	}
	
	//파일이 없어서 못가져오는 경우 -- 만드는쪽에서 예외처리하는거
	public String read2(String path) {
		//path에 있는 파일을 읽어서 문자열로 만들어준다
		//파일이 없을 떄
		String result = "";
		try {
			throw new IOException();//파일이없는 상황을 강제로 만듦
		
		} catch (IOException e) {
			System.out.println(path + "파일이 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("널포인트");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

		return result;
	}
	
	
	//파일이 없는데 -- 사용하는쪾에서 예외처리를 알려주는거
	public String read3(String path) throws IOException {
		String result = "";
		throw new IOException(); //파일이없는 상황을 강제로 만듦
	}
	
	
	
	

}

package controller;

import java.util.Scanner;

import action.Action;

public class MemberController {

	public void processRequest(Scanner sc, Action action) {
		// 예외처리
		try {
			action.excute(sc);	// 발생지점
		} catch(Exception e) {
			e.printStackTrace();// 처리지점
			// printStackTrace()
			// 전체 애러발생 경로 및 메세지를 출력
			// 단개별로 오류가 발생한 위치를 추적
		} 
		
	}
	/*
	  	try{
	  		예외가 발생할 만한 코드
	  	}catch(예외클래스 변수){
	  		예외처리
	  	}
	  	
	  
	  
	 */
	
	
	
	
}

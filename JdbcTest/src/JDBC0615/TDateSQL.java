package JDBC0615;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TDateSQL {
	
	       // DB 접속을 위한 변수 선언
			Connection con = null;

			// 쿼리문 전송을 위한 변수 선언
			// Statement stmt = null;		// ? 없이 사용할때
			PreparedStatement pstmt = null;	// ?에 문자를 저장 하는기능 (63 행참고) 

			// 조회 (Select) 결과를 저장하기 위한 변수 선언 
			ResultSet rs = null; //(count랑은 다른 개념 rs는 데이터 count는 갯수 라고 생각)

			// DB 접속
			public void connect() {
				con = DBC.DBConnect();
				// DBC.DBConnect() = DBC클래스 DBConnect 메소드의 con 값
			}
			
			public void testDate(TDate tdate) {
				String sql = "INSERT INTO TESTDATE VALUES(TO_DATE(?))";
				
				try {
					pstmt = con.prepareStatement(sql);
					
					pstmt.setString(1, tdate.getToday());
					
					pstmt.executeUpdate();
					System.out.println("입력성공");
					
				}catch(SQLException se) {
					se.printStackTrace();
                }
				
			}		
}

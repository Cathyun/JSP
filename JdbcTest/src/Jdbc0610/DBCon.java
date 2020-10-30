package Jdbc0610;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBCon {
   //DB 접속 정보 저장을 위한 Connection 변수 con 선언
	Connection con = null;
	
	//static메소드
	static {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//ojdbc6파일을 현재 소스에 적용
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
			System.out.println("DB접속 실패 : 드라이버 로딩 실패");
		}
	}//end static
	
	
	public void connect() {
		
		try{
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "YOU30";
	    	String password = "1111";
	    	con = DriverManager.getConnection(url, user, password);
	    	System.out.println("DB접속성공");
			//con = DriverManager.getConnection
	    	//("jdbc:oracle:thin:@licaljost:1521:XE","YOU30","1111");
			
		}catch(SQLException se) {
			se.printStackTrace();
//		}finally {
			//무조건 실행 
//			try {
//				con.close();
//				System.out.println("DB접속종료");
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}//connect()
	
	
	
	}
}

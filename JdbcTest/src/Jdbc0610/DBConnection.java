package Jdbc0610;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
    public static Connection DSConnect() {
    //DB의 접속 정보 저장을 위한 Connection 변수 con선언
    	
    	Connection con = null;
    	
    	//접속할 DB의 계정 정보
    	String user = "YOU30";
    	String password = "1111";
    	
    	//접속할 DB의 주소 정보
    	String url = "jdbc:oracle:thin:@localhost:1521:XE";
    	
    	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		//ojdbc6 파일을 현재 소스에 적용
    		con = DriverManager.getConnection(url, user,password);
    		System.out.println("DB접속성공!");
    	}catch(ClassNotFoundException cne) {
    		cne.printStackTrace();
    		System.out.println("DB 드라이버 로딩 실패");
    	} catch(SQLException se) {
    		se.printStackTrace();
    		System.out.println("DB접속 실패 : SQLException");
    	}
    	return con;
    	//DB접속이 정상적으로 되면 접속 상태를 리턴
      }
	 
}

package youOjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ojdbc {
	public static Connection DBConnect() {
    	Connection con = null;
    	
    	try{
    		//1.ojdbc6없이 실행 ->> 안됨
    		Class.forName("oracle.jdbc.driver.OracleDriver");//라이브러리 확인
    		String url = "jdbc:oracle:thin:@localhost:1521:XE";
    		String user = "YOU30";
    		String password = "1111";
    		
    		//2.ojdbc6추가 후 
    		//url,user,password 틀리고 실행
    		con = DriverManager.getConnection(url, user, password);//DB랑 접속할 수 있도록 함.
    		//접속이 잘되었는지 확인하는 캐치문
    		
    		System.out.println("DB 접속 성공");//DB가 접속 되었는지 확인하기 위한 출력문
    		
    	}catch(ClassNotFoundException cne) {
    		cne.printStackTrace();
    		//printStackTrace(); : 에러 발생시 경로를 찾아준다.
    		System.out.println("DB 접속 실패 : 드라이버 로딩 실패");
    	}catch(SQLException se){ //SQLException : SQL 실행했을 때 발생하는 에러 처리하는 예외처리문
    		se.printStackTrace();
    		System.out.println("DB접속 실패 : url,user,password 확인");
    	}
    	
		return con;
    }
		
}



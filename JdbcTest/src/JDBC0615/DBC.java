package JDBC0615;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
	public static Connection DBConnect() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "YOU30";
			String password = "1111";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 접속성공 ^오^b");
		} catch(ClassNotFoundException cne) {
			cne.printStackTrace();
			// printStackTrace(); : 에러 발생 시 경로를 찾아준다.
			System.out.println("DB 접속실패 드라이버 로딩 실패 T^T");
		} catch(SQLException se) {
			se.printStackTrace();
			System.out.println("DB 접속 실패 : url, user, password 확인");
		}
		return con;
	}
}

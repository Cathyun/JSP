package Jdbc0610;

public class JdbcMain {

	public static void main(String[] args) {
//		DBConnection conn = new DBConnection();
//		conn. DSConnect();
		
		DBCon conn = new DBCon();
		conn.connect();
	}

}

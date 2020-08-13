package db;

import java.sql.*;

import javax.naming.*;
import javax.sql.*;

public class jdbcUtil {

	//(1) getConnection
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
		//DB연동을 도와주는 Context 	
		Context initCtx = new InitialContext(); 
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		
		DataSource ds = (DataSource)envCtx.lookup("jdbc/OracleDB");
		                                     //lookup안에 객체를 넣어준다.
		
		con = ds. getConnection();
		con.setAutoCommit(false);
		System.out.println("DB접속 성공");
		}catch(Exception e){
			System.out.println("DB접속실패!");
			e.printStackTrace();
		}
		return con;
	}
	
	//(2)close
	public static void close(Connection con) {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//(3)Statement
	public static void close(Statement stmt) {
		try {
			stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//(4)commit
	public static void commit(Connection con) {
		try {
			con.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//(5)rollback
	public static void rollback(Connection con) {
		try {
			con.rollback();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

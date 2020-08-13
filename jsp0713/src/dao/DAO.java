package dao;

import java.sql.*;
import java.util.*;

public class DAO {
             //sql문을DB에 전달함.
	private static DAO dao;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	 
	public static DAO getInstance() {
		// TODO Auto-generated method stub
		if(dao==null) {
			dao = new DAO();
		}
	   return dao;
	}
	

	public void setConnection(Connection con) {
		this.con = con;
		
	}

	public int inputDB(String data1) {
		              //service의 값을 parameter로 가져옴!
		System.out.println("3.dao로 넘어 왔나?");
		String sql = "INSERT INTO JSP VALUES(?)";
		
		int result = 0;
		
		try {
			System.out.println("4.db로 넘어왔나?");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, data1);
			//4.DB에 입력
			result = pstmt.executeUpdate();
			//5.DB에 입력했을 때 반환하는 값

		}catch(SQLException se) {
			se.printStackTrace();
		}
		System.out.println("5.dao의 result = " + result);
		return result;
		//6.inputDB의 result값
	}

    //DB조회- DB연결
	public List<String> selectDB() {
		System.out.println("4");
		String sql = "SELECT * FROM JSP";
		List<String>resultList = new ArrayList<String>();
		try {
	    pstmt =con.prepareStatement(sql);
	    rs = pstmt.executeQuery();
	     while(rs.next()) {
	    	resultList.add(rs.getString("DATA1"));
	     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println("5");
		return resultList;
	}


}

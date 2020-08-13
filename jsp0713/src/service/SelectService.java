package service;

import static db.jdbcUtil.*;

import java.sql.*;
import java.util.*;

import dao.DAO;

public class SelectService {
	
	//
	public List<String> selectDB() {
		
		System.out.println("3");
		DAO dao = DAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		
		List<String> resultList = new ArrayList<String>();
		
		resultList = dao.selectDB();
		//리스트를 dao에 보내준다.
		return resultList;
	}
  
}

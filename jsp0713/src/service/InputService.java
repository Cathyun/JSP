package service;

import java.sql.*;
import static db.jdbcUtil.*;
import dao.DAO;

public class InputService {
	
 public boolean inputDB(String data1) {
                   //service의 값을 parameter로 가져옴!
	 System.out.println("2.service로 넘어 왔나?");
	 DAO dao =  DAO.getInstance();
	 Connection con = getConnection();
	 dao.setConnection(con);
	 
	 boolean inputResult;
	 
	 int result = dao.inputDB(data1);
	 //3.dao에 있는 inputDB의 값을 가져와라	
	 
	 if(result>0) {//7.result값의 boolean구분
		 commit(con);
		 inputResult = true;
	 }else {
		 rollback(con);
		 inputResult = false;
	 }
	 System.out.println("6.service.inputResult = " + inputResult);
	 return inputResult;
 }
}

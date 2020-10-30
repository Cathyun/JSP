package Jdbc0610;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
       //Statement import해야함

public class CRUDTest {
	
	Connection con; //import(sql) 

    //CRUD
	//CREATE(생성)
	//READ(검색)
	//UPDATE(수정)
	//DELETE(삭제)
//INSERT	
 public void insert() {
	 Statement stmt = null;
	 //SQL문을 DB로 전송하는 역할
	 try {
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","YOU30","1111");
		 stmt = con.createStatement();
         String sql = "INSERT INTO JAVASQL VALUES('자바이름')";
  
         int count = stmt.executeUpdate(sql);
         System.out.println("count : " + count);
         
         if(count > 0) {
        	 System.out.println("insert success!");
         }else {
        	 System.out.println("insert fail count T^T");
         }
         
	 }catch(SQLException se){
		   //import(sql) 
		 se.printStackTrace();
		 System.out.println("insert fail SQLException");
	 }finally {
		 try {
			 stmt.close();
			 con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }//end finally
 }//end insert()

 
}

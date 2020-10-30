package Jdbc0610;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
       //Statement import해야함

public class NAVER {
	
	Connection con; //import(sql) 

    //CRUD
	//CREATE(생성)
	//READ(검색)
	//UPDATE(수정)
	//DELETE(삭제)
	
 public void insert() {
	 Statement stmt = null;
	 //SQL문을 DB로 전송하는 역할
	 try {
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","YOU30","1111");
		 stmt = con.createStatement();
		 String sql = "INSERT INTO NAVER_MEMBER VALUES"
		 		+ "('네이버 아이디','네이버 비번','네이버이름',26,'여자','메일주소@네이버','010-7700-0000')";
		  
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
 
//SELECT
public void select() {
	 Statement stmt = null;
	 ResultSet rs = null;
	 //ResultSet을 이용해서 컬럼의 데이터를 받아온다. 
	 try {
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","YOU30","1111");
		 stmt = con.createStatement();
		 String sql = "SELECT * FROM NAVER_MEMBER";
		 rs = stmt.executeQuery(sql);
		 
		 
		 while(rs.next()) {//레코드가 더 이상 존재하지 않을 때까지 
			 System.out.println("아이디 : " + rs.getString(1));
			 System.out.println("비밀번호 : "+rs.getString(2));
			 System.out.println("이름 : "+rs.getString(3));
			 System.out.println("나이 : "+rs.getInt(4));
			 System.out.println("성별 : "+rs.getString(5));
			 System.out.println("이메일 : "+rs.getString(6));
			 System.out.println("전화전호 : "+rs.getString(7));
			 System.out.println();
		 };
		 
	 }catch(SQLException se){
		 se.printStackTrace();
	 }finally {
		 try {
			 stmt.close();
			 con.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 } 
	  }
    }//end select()

     //UPDATE - > 업데이트 한 만큼 COUNT가 나옴
     public void update() {
    	 Statement stmt = null;
    	 try {
    		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","YOU30","1111");
    		 stmt = con.createStatement();
    		 String sql = "UPDATE NAVER_MEMBER SET N_AGE = 25 WHERE N_ID ='네이버 아이디'";
    		 
    		  int count = stmt.executeUpdate(sql);
    				  
    		   if(count > 0) {
    			   System.out.println("update success");
    			   System.out.println(count);
    		   }else {
    			   System.out.println("update  fail count....");
    			   System.out.println(count);
    		   }
    			
    	 }catch(SQLException se) {
    		 se.printStackTrace();
    		 System.out.println("update fail SQLException");
    	 }finally {
    		 try{
    			 stmt.close();
			     con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
    	 }
    
     }//end update
 
     //DELETE
     public void delete() {
    	 Statement stmt = null;
    	 try{
    		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","YOU30","1111");
    		 stmt = con.createStatement();
    		 String sql = "DELETE NAVER_MEMBER WHERE N_ID ='ID'";
    		 //ID에 포함된 모든 정보들을 지울 수 있다.
    		 //SQL에서 insert한 정보들을 commit하지 않으면 저장되지않아서 지워지지도 않는다.
    		 int count = stmt.executeUpdate(sql);
			  
  		   if(count > 0) {
  			   System.out.println("delete success");
  			   System.out.println(count);
  		   }else {
  			   System.out.println("delete fail count....");
  			   System.out.println(count);
  		   }
    		 
    	 }catch(SQLException se) {
    		 se.printStackTrace();
    	 }finally {
    		 try{
    			 stmt.close();
			     con.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
    	 } 
    		 
    	 }//end delete
    	 
     }
     



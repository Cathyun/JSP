package dao;

import java.sql.*;
import java.util.*;
import static db.jdbcUtil.*;
import dto.MemberDTO;

public class MemberDAO {
    private static MemberDAO dao;
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
  public static MemberDAO getInstance() {
	  if(dao==null) {
		  dao =new MemberDAO();
	  }
	  return dao;
  }
  public void setConnection(Connection con) {  
	 this.con = con;
  }
  public int memberJoin(MemberDTO member) {
   //DB에서 불러오는 작업(회원가입)
	String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?)";  
	
	int result = 0;
	 try {
		 pstmt = con.prepareStatement(sql);
		 //DB에 SQL문을 전달하기 위한pstmt선언;
		 
		 
		 pstmt.setString(1, member.getId());
		 //pstmt.setString(1,member.getId())
		 //작성한 sql
		 pstmt.setString(2, member.getPassword());
		 pstmt.setString(3, member.getJsname());
		 pstmt.setString(4, member.getBirth());
		 pstmt.setString(5, member.getGender());
		 pstmt.setString(6, member.getEmail()); 
		 
		 result = pstmt.executeUpdate();
		 //pstmt.executeUpdate :DB실행
		 //result에 실행된 결과를 담는다.
		 
		 System.out.println("result"+result);
	 }catch(SQLException e) {
		 e.printStackTrace();
		 //DB실행시 오류가 발생하면 오류 경로를 찾아준다.
	 }
	
	  return result;
	  //메소드의 결과 값을 return한다.
	  //정상실행 : result = 1
	  //실행실패시 : result = 0
}
     //로그인
     public String memberLogin(String id, String password) {
       String sql = "SELECT ID FROM MEMBER WHERE ID = ? AND PASSWORD = ?";
       String loginId = null;
       try {
    	 //DB에 SQL문을 전달하기 위한pstmt선언; 
    	 pstmt = con.prepareStatement(sql);
    	 
    	 //pstmt.setString(1,member.getId())
		 //작성한 sql
    	 pstmt.setString(1, id);
    	 pstmt.setString(2, password);
    	 
    	 //sql을 rs에 담는다.
    	 rs = pstmt.executeQuery();
    	 
    	 //하나의 값을 출력할 때는 if사용
    	 if(rs.next()) {
    		 loginId = rs.getString("ID");
    		  //loginId를 sql의 있는 ID로 담아준다.
    	  }else {
    		  loginId = null;
    		  //rs가 다음이 없다면 loginId가 null이다.
    	 }
       }catch(SQLException e) {
    	   e.printStackTrace();
       }
       //return값을 loginId으로 받는다. 
      return loginId;
  }
     //멤버 리스트
	public List<MemberDTO> memberList() {
        String sql = "SELECT * FROM MEMBER ORDER BY JSNAME ASC";
        
        //MemberDTO의 List의 객체(memberList)생성
        List<MemberDTO> memberList = new ArrayList<MemberDTO>();
        MemberDTO member = null;
        
        try {
          
          //DB에 SQL문을 전달하기 위한pstmt선언; 	
          pstmt = con.prepareStatement(sql);
          
          //result set = sql의 결과를 담는다.
          rs = pstmt.executeQuery();
          
          //memberList는 여러개를 보여줘야 하므로 
          //while를 사용한다.
          while(rs.next()) {
        	//MemberDTO를 member로 새로 생성한다.
        	member = new MemberDTO();
        	
        	//MemberDTO에 있는 회원정보를 setId로 가지고 와서 member에 담는다.
        	//rs.getString("ID") : rs에 sql을 담을 것을 getString에 ID로 받는다.
        	member.setId(rs.getString("ID"));
        	member.setPassword(rs.getString("PASSWORD"));
        	member.setJsname(rs.getString("JSNAME"));
        	member.setBirth(rs.getString("BIRTH"));
        	member.setGender(rs.getString("GENDER"));
        	member.setEmail(rs.getString("EMAIL"));
        	
        	
        	memberList.add(member); //memberList에 member목록이 추가되도록 add를 사용!
          }    	  
          
        }catch(SQLException e) {
        	e.printStackTrace();
        }finally {
        	//finally : try문이 끝나고 
        	
        	//DB접속해제
        	close(pstmt);
        	//result set을 닫는다.
        	close(rs);
        }
		return memberList;
	}
	//멤버 상세조회
	 public MemberDTO memberView(String id) {
		 String sql = "SELECT * FROM MEMBER WHERE ID =? ";
		 
		 //MemberDTO의 객체(memberView)생성 및 import
		 MemberDTO memberView = new MemberDTO();
		 
		 try {
			 //DB에 SQL문을 전달하기 위한pstmt선언; 	
			pstmt= con.prepareStatement(sql);
			
			//sql문의 setString으로 첫번째 물음표를 id로 지정
			pstmt.setString(1, id);
			
			//rs로 sql로 담는다.
			rs = pstmt.executeQuery();
			
			//하나의 멤버를 상세조회해야 하기 때문에 if사용!
			if(rs.next()) {
				//MemberDTO의 객체(memberView)에 MemberDTO의 set을 사용
				//rs.getString("ID") : SQL의 컬럼값을 memberView.setId에 담는다. 
				memberView.setId(rs.getString("ID"));
				memberView.setPassword(rs.getString("PASSWORD"));
				memberView.setJsname(rs.getString("JSNAME"));
				memberView.setBirth(rs.getString("BIRTH"));
				memberView.setGender(rs.getString("GENDER"));
				memberView.setEmail(rs.getString("EMAIL"));
			}
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }finally {
			//finally : try문이 끝나고 
	        	
	        	//DB접속해제
	        	close(pstmt);
	        	//result set을 닫는다.
	        	close(rs);
	        }
		return memberView;
	}
	 //멤버탈퇴
	public int memberDelete(String delId) {
		String sql = "DELETE FROM MEMBER WHERE ID=? ";
		
		int deleteResult = 0;
			
		try {
			 //DB에 SQL문을 전달하기 위한pstmt선언; 	
			pstmt = con.prepareStatement(sql);
			
			//sql문의 setString으로 첫번째 물음표를 delId로 지정
			pstmt.setString(1, delId);
			
			//SQL을 deleteResult로 담는다.
	       deleteResult = pstmt.executeUpdate();
	       
		}catch(SQLException e) {
			e.printStackTrace();
		
		}finally{
			
			//DB접속 해제
			close(pstmt);
		
		}
		
		return deleteResult;
	}
	//회원정보 수정
	public int memberModify(MemberDTO member) {
		String sql ="UPDATE MEMBER SET JSNAME=?,EMAIL=? WHERE ID = ?";
		
		//modifyResult를 int로 선언
		int modifyResult = 0;
		
		System.out.println("dqo midufy name :" + member);
		
		try {
			//DB에 SQL문을 전달하기 위한pstmt선언; 	
			pstmt = con.prepareStatement(sql);
			
			//sql문의 setString으로 첫번째 물음표를 MembeDTO에 있는 getJsname으로 지정
			pstmt.setString(1, member.getJsname());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getId());
			
			modifyResult = pstmt.executeUpdate();
		}catch(SQLException e) {
           e.printStackTrace();			
		}finally {
			
			//DB접속 해제
			close(pstmt);
		}
		
		System.out.println("modifyResult결과 값 : " + modifyResult);
		return modifyResult;
	}
	
   
}














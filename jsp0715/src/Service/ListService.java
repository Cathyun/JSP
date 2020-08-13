package Service;

import static db.jdbcUtil.*;

import java.sql.*;
import java.util.*;

import dao.MemberDAO;
import dto.MemberDTO;

public class ListService {

	public List<MemberDTO> memberList() {
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		//MemberDTO의 리스트의 객체(memberList)생성! 
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		//dao의 memberList를 memberList로 담아준다.
		memberList = dao.memberList();

		close(con);
		//db접속해제
		return memberList;
		//메소드의 결과 값을 memberList한다.
	     //정상실행 : memberList = 1
		 //실행실패시 : memberList = 0
	}
   
}

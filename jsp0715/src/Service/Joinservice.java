package Service;

import java.sql.*;
import static db.jdbcUtil.*;
import dao.MemberDAO;
import dto.MemberDTO;

public class Joinservice {

	public int memberJoin(MemberDTO member) {
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		int result = dao.memberJoin(member);
		//int result : 결과에 따라 commit을 할지 rollback을 할지 정하기 위해 선언해준 변수
		
		//dao.memberJoin(member) :dao로 보낸다.
		//DAO에 있는 memberJoin(member)의 return값
		
		//dao에서 처리한 값을 result에 담는다.
		//dao.memberJoin(member)는 0 아니면 1값을 가진다.
		
		//result값이 0보다 크면 commit
		if(result>0) {
			commit(con);
			//result값이 0 보다 크다면(정상실행시)
			//commit실행
		}else {
			rollback(con);
			//result값이 0이라면 or 0보다 작다면
			//rollback 실행
		}
		close(con);
		//db접속해제
		return result;
		 //메소드의 결과 값을 return한다.
	     //정상실행 : result = 1
		 //실행실패시 : result = 0
	}
	}



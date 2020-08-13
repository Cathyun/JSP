package Service;

import static db.jdbcUtil.*;

import java.sql.Connection;

import dao.MemberDAO;

public class DeleteService {

	public int memberDelete(String delId) {
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		int deleteResult = dao.memberDelete(delId);
		//int deleteResult : 결과에 따라 commit을 할지 rollback을 할지 정하기 위해 선언해준 변수
		
		//dao.memberDelete(delId) : dao로 보낸다.
		//DAO에 있는 memberDelte(delId)의 return값
		
		//dao에서 처리한 값을 deleteResult에 담는다.
		// memberDelte(delId)sms 0 아니면 1값을 가진다.
		
		//deleteResult값이 0보다 크면 commir
		if(deleteResult>0) {
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
		return deleteResult;
		//메소드의 결과 값을 deleteResult한다.
	     //정상실행 : deleteResult = 1
		 //실행실패시 : deleteResult = 0
	
	}

}

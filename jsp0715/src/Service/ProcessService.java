package Service;

import static db.jdbcUtil.*;

import java.sql.Connection;

import dao.MemberDAO;
import dto.MemberDTO;

public class ProcessService {

	public int memberModify(MemberDTO member) {
		
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		//dao의 memberModify(member)를 int modifyResult로 담는다. 
		int modifyResult = dao.memberModify(member);
		
		
		if(modifyResult>0) {
			//modifyResultrk 0보다 크면
			//commit
			commit(con);
		}else {
			//modifyResultrk 0이거나 작으면
			//rollback
			rollback(con);
		}
		
		//리턴 값을 modifyResult으로 받는다.
		return modifyResult;
	}

}

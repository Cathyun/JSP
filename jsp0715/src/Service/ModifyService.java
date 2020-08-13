package Service;

import static db.jdbcUtil.*;

import java.sql.Connection;

import dao.MemberDAO;
import dto.MemberDTO;

public class ModifyService {

	public MemberDTO memberModify(String id) {
		

		System.out.println("가져가는ID"+id);
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		//MemberDTO의 객체(mbmodify) 생성 안에 dao에 있는 memberView(id)를 담는다.
		MemberDTO mbmodify = dao.memberView(id);
		
		close(con);
		
		return mbmodify;
	}

}

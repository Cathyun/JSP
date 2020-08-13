package Service;

import static db.jdbcUtil.*;

import java.sql.Connection;

import dao.MemberDAO;
import dto.MemberDTO;

public class ViewService {

	public MemberDTO memberView(String id) {
		
		System.out.println("가져가는ID"+id);
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		//MemberDTO의 객체(memberView)생성 후 dao에 memberView(id)를 담는다.  
		MemberDTO memberView =dao.memberView(id);
		
		//db 접속 해제
		close(con);
		
		
		return memberView;
	}
 
}

package Service;

import java.sql.Connection;
import static db.jdbcUtil.*;
import dao.MemberDAO;

public class LoginService {

	public String memberLogin(String id, String password) {
		//import한 것들 확인
		//import static db.JdbcUtil.*;
		MemberDAO dao = MemberDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		//위 3개는 공통으로 작성!
		
		//String loginId를 String 타입으로 생성
		//dao의 memberLogin에 id,password를 String loginId에 담는다.
		String loginId = dao.memberLogin(id,password);
		//dao.memberLogin(id,password) => dao에서 return받은 값
		
		//db접속 해제 
		close(con);
		
		//loginId으로 리턴 값을 받는다.
		return loginId;
	}
   
}

package Service;

import static DB.jdbcUtil.*;

import java.sql.*;

import DAO.BoardDAO;

public class delService {

	public int DelList(int bNum) {
		
		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		
		int delResult = dao.viewdel(bNum);
		
		if(delResult>0) {
			commit(con);
		}else {
			rollback(con);
		}
		
		close(con);
		
		return delResult;
	}

}

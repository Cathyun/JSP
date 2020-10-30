package Service;

import static DB.jdbcUtil.*;

import java.sql.*;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class ModiService {

	public int viewModi(BoardDTO bomi) {

		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		
		int modiResult = dao.viewModi(bomi);
		
		if(modiResult>0) {
			commit(con);
			
		}else {
			rollback(con);
		}
		close(con);
		
		return modiResult;
	
	}
}


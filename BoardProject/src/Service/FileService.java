package Service;

import DAO.BoardDAO;
import DTO.BoardDTO;
import static DB.jdbcUtil.*;

import java.sql.*;



public class FileService {

	public int BoardWrite(BoardDTO board) {
		
		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		
		int svcResult = dao.BoardWrite(board);
		//dao.BoardWrite(board) =>BoardDAO의 BoardWrite(BoardDTO board)
		//메소드의 return값 daoResult
		
		if(svcResult>0) {
			commit(con);
		}else {
			rollback(con);
		}
		
		close(con);
		return svcResult;
	}
  
	
	
}

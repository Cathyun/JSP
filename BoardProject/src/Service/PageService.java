package Service;

import static DB.jdbcUtil.*;

import java.sql.Connection;
import java.util.List;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class PageService {

	public int ListCount() {
      
		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);

		int listCount = dao.ListCount();

		close(con);

		return listCount;
	}

	public List<BoardDTO> BoardList(int startRow, int endRow) {
		
		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		
		List<BoardDTO> boardList = dao.BoardList(startRow,endRow);
		
		close(con);
		return boardList;
	}

}

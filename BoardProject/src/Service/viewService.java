package Service;

import static DB.jdbcUtil.*;

import java.sql.*;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class viewService {

	public BoardDTO BoardView(int bNum) {
		
		BoardDAO dao = BoardDAO.getInstance();
		Connection con = getConnection();
		dao.setConnection(con);
		
		//조회수 1 증가
		int bHit = dao.BoardHit(bNum);
		
		if(bHit>0) {
			commit(con);
		}else {
			rollback(con);
		}
		
		//해당글 가져오기
		BoardDTO boardView = dao.BoardView(bNum);
		close(con);
		return boardView;
	}
}

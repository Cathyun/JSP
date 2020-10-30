package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import DTO.BoardDTO;
import static DB.jdbcUtil.*;

public class BoardDAO {

	private static BoardDAO dao;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public static BoardDAO getInstance() {

		if (dao == null) {
			dao = new BoardDAO();
		}

		return dao;
	}

	public void setConnection(Connection con) {
		this.con = con;
	}

	// 파일등록
	public int BoardWrite(BoardDTO board) {
		String sql = "INSERT INTO BOARDTT VALUES" + "(BOARD_SEQ.NEXTVAL,?,?,?,?,SYSDATE,0,?)";
		// SYSDATE 현재 시간
		// 0 : 조회수

		int daoResult = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getbWriter());
			pstmt.setString(2, board.getbPassword());
			pstmt.setString(3, board.getbTitle());
			pstmt.setString(4, board.getbContent());
			pstmt.setString(5, board.getbFile());

			daoResult = pstmt.executeUpdate();
			// 제대로 DB에 등록되면 daoResult = 1
			// 오류 발생하면 daoResult = 0
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			close(pstmt);
		}

		return daoResult;
	}

	// 게시글 갯수 확인
	public int ListCount() {
		String sql = "SELECT COUNT(*) FROM BOARDTT";
		int listCount = 0;

		try {
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				listCount = rs.getInt(1);
			} else {

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCount;
	}

	// 리스트 보기
	public List<BoardDTO> BoardList(int startRow, int endRow) {
		String sql = "SELECT * FROM BOARDLIST WHERE RN BETWEEN ? AND ?";
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		BoardDTO board = null;

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// board초기화
				board = new BoardDTO();

				// BoardDTO값설정
				board.setbNum(rs.getInt("BNUM"));
				board.setbWriter(rs.getString("BWRITER"));
				board.setbPassword(rs.getString("BPASSWORD"));
				board.setbTitle(rs.getString("BTITLE"));
				board.setbContent(rs.getString("BCONTENT"));
				board.setbHit(rs.getInt("BHIT"));
				board.setbDate(rs.getString("BDATE"));
				board.setbFile(rs.getString("BFILE"));

				// boardList에 board를 추가한다.
				boardList.add(board);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			close(pstmt);
		}
		return boardList;
	}
	
//////////////////////////////////////////////////////////////////////
	// 조회수 증가
	public int BoardHit(int bNum) {
		String sql = "UPDATE BOARDTT SET BHIT = BHIT+1 WHERE BNUM=?";
		int hitResult = 0;
		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, bNum);
			hitResult = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return hitResult;
	}

	// 해당글가져오기
	public BoardDTO BoardView(int bNum) {
		String sql = "SELECT * FROM BOARDTT WHERE BNUM = ?";
		BoardDTO boardView = new BoardDTO();

		try {
			
			pstmt = con.prepareStatement(sql);
            
			//pstmt에 ?(물음표)값을 담는다.
			pstmt.setInt(1, bNum);
			
            //rs의 sql값을 담는다.
			rs = pstmt.executeQuery();
			
			//한 개의 값을 가지고 오기 위해 if
			if (rs.next()) {
				
				boardView.setbNum(rs.getInt("BNUM"));
				boardView.setbWriter(rs.getString("BWRITER"));
				boardView.setbPassword(rs.getString("BPASSWORD"));
				boardView.setbTitle(rs.getString("BTITLE"));
				boardView.setbContent(rs.getString("BCONTENT"));
				boardView.setbDate(rs.getString("BDATE"));
				boardView.setbHit(rs.getInt("BHIT"));
				boardView.setbFile(rs.getString("BFILE"));

				boardView.toString();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}

		return boardView;
	}

	//게시물삭제
	public int viewdel(int bNum) {
		String sql = "DELETE FROM BOARDTT WHERE BNUM = ?";
		int delResult = 0;
		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, bNum);

			delResult = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return delResult;
	}

	//수정
	public int viewModi(BoardDTO bomi) {

		String sql = "UPDATE BOARDTT SET BWRITER = ?, BTITLE = ?, BCONTENT =? WHERE BNUM=?";
		int modiResult = 0;

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, bomi.getbWriter());
			pstmt.setString(2, bomi.getbTitle());
			pstmt.setString(3, bomi.getbContent());
			pstmt.setInt(4, bomi.getbNum());

			modiResult = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			close(pstmt);
		}
		return modiResult;

	}
}

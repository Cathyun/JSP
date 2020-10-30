package controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.BoardDTO;
import DTO.PageDTO;
import Service.PageService;

@WebServlet("/pagingList")
public class pageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public pageController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//page,limit의 값을 선언
		//page는 1개 limit는 게시물을 3개 보여준다는 뜻!
		int page = 1;
		int limit = 5;

		// page 파라미터 값 검사
		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		// 전체 게시글 갯수를 가져오기 위한 PageService의 ListCount 메소드 호출!
		PageService pagesvc = new PageService();

		int listCount = pagesvc.ListCount();
		// pagesvc.ListCount() =63;
		// 따라서 listCount = 63;

		// limit 값을 걸어놓은 만큼 범위에 해당하는 글만 가져오는 방법
		int startRow = (page - 1) * limit + 1;
		int endRow = page * limit;
		// startRow = (1-1)*3+1 = 1
		// endRow = 1*3 =3

		List<BoardDTO> boardList = pagesvc.BoardList(startRow, endRow);

		// 최대로 필요한 페이지 갯수 계산
		// 게시글의 끝페이지
		int maxPage = (int) ((double) listCount / limit + 0.9);

		// 현재 페이지에 보여줄 시작 페이지
		// 1,11,21,31.....
		int startPage = (((int) ((double) page / 10 + 0.9)) - 1) * 10 + 1;

		// 현재페이지에 보여줄 끝페이지
		// 10,20,30,40,.....
		int endPage = startPage + 10 - 1;
		if (endPage > maxPage) {
			endPage = maxPage;
		}
		
		PageDTO paging = new PageDTO();
		paging.setPage(page);
		paging.setStartPage(startPage);
		paging.setEndPage(endPage);
		paging.setMaxPage(maxPage);
		paging.setListCount(listCount);

		// Attribute
		request.setAttribute("paging", paging);
		request.setAttribute("boardList", boardList);
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("PageList.jsp");
		dispatcher.forward(request, response);

	}

}

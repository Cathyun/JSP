package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.BoardDTO;
import Service.viewService;


@WebServlet("/boardView")
public class viewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public viewController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		//bNum,page
		int bNum = Integer.parseInt(request.getParameter("bNum"));
		
		int page = Integer.parseInt(request.getParameter("page"));
		
		//viewService객체 생성
		viewService viewsvc = new  viewService(); 
		
		//BoardDTO의 값을 담는다.
		//bNum을 가지고 와서!
		BoardDTO boardView = viewsvc.BoardView(bNum);
		
		if(boardView !=null) {
			request.setAttribute("boardView",boardView);
			request.setAttribute("page", page);
			RequestDispatcher dispatcher = request.getRequestDispatcher("BoardView.jsp");
			dispatcher.forward(request,response);
			
		} else {
			response.sendRedirect("ViewFail.jsp");
		}
	}

}

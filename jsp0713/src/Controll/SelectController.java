package Controll;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SelectService;

/**
 * Servlet implementation class SelectController
 */
@WebServlet("/selectDB")
public class SelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		SelectService selsvc = new SelectService();
		
		System.out.println("2");
		
		List<String>resultList = new ArrayList<String>();
		//result의 리스트를 새롭게 선언
		
		resultList = selsvc.selectDB();
		//리스트에 selsvc에 있는 selectDB값을 가져와라
		
		request.setAttribute("selectResult", resultList);
		//리스트의 이름 selectResult의 값을 리스트로 받는다.
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("SelectResult.jsp");
		//RequestDispatcher클래스 안에request담아서 SelectResult.jsp페이지로 넘어 간다.
		
		dispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.ListService;
import dto.MemberDTO;

/**
 * Servlet implementation class listController
 */
@WebServlet("/memberList")
public class listController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
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
        
        //MemberDTO의 객체(memberList)생성 및 import
        //ArrayList를 사용할 때는 배열을 하고자하는 것을 <>안에 넣어준다.
        List<MemberDTO> memberList = new ArrayList<MemberDTO>();
        
        //service로 들어가기 위한 작업
        //ListService의 객체(listsvc)생성 및 import
        ListService listsvc = new ListService();
        //listsvc에 있는 memberList를 memberList에 담는다.
        memberList = listsvc.memberList();
        
        //정보를 보내주기 위해 세션(memberList)을 생성
        request.setAttribute("memberList", memberList);
        
        //정보를 보내주면 MemberList.jsp으로 이동한다. 
        RequestDispatcher dispatcher = request.getRequestDispatcher("MemberList.jsp");
        
        //MemberList.jsp로 이동할 때 request,response를 가져간다.
        dispatcher.forward(request,response);
       
	}

}

















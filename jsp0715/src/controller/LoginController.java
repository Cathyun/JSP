package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/memberLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        //HttpSession세션을 생성 = 세션 초기화
	    HttpSession session = request.getSession(); 
	    
	    //String id ; String 타입의 변수 id선언
	    //request.getParameter("id"): member에서 name = "id"로 넘겨준 정보 값
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        
        //LoginService의 객체를 생성
        //loginsvc: 변수 명
        LoginService loginsvc = new LoginService();
        
        //String loginId를 String타입으로 loginId선언
        //LoginServive에 있는 memberLogin를 id와 pasword를 String loginId에 담는다. 
        String loginId = loginsvc.memberLogin(id,password);
        
        
        if(loginId !=null) {
        	session.setAttribute("loginId",loginId);
        	//session.setAttribute : 세션을 생성
        	//session.setAttribute("세션 명",세션 값)
            response.sendRedirect("LoginSuccess.jsp");
            //loginId가 null이 아닐 경우 LoginSuccess.jsp로 이동
        }else {
        	
        	response.sendRedirect("LoginFail.jsp");
        	//loginId가 null이 아닐 경우 LoginFail.jsp로 이동
        	
        }
        
	
	}
        
}



















package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.ViewService;
import dto.MemberDTO;

/**
 * Servlet implementation class viewController
 */
@WebServlet("/memberView")
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
//request : 요청
//response : 정보 		
	}
	
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//String id ; String 타입의 변수 id선언
		String id = request.getParameter("id");
        
		//ViewService의 객체(viewsvc) 생성 및 import
		ViewService viewsvc = new ViewService();
		//MemberDTO의 객체(memberView) 생성 및 import
		MemberDTO memberView = new MemberDTO();
		
		//ViewService에 있는 memberView에 id를 viewsvc를 담아서
		//memberView로 담는다.
		memberView = viewsvc.memberView(id);
		
       if(memberView !=null) {
    	   //memberViewrk null이 아니라면
    	   //반환하고자 하는 세션을 셍성하여
    	   //MemberView.jsp로 이동한다.
    	   request.setAttribute("memberView", memberView);
    	   RequestDispatcher dispatcher = request.getRequestDispatcher("MemberView.jsp");
           dispatcher.forward(request,response);
       }
		
		
		
		
		
		
		
		
	}

}


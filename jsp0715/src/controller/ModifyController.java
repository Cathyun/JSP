package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.ModifyService;
import dto.MemberDTO;

/**
 * Servlet implementation class ModifyController
 */
@WebServlet("/memberModify")
public class ModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ModifyController() {
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
      
      //HttpSession세션을 생성 = 세션 초기화 
      HttpSession session = request.getSession();
	  
      //String id를 String 타입으로 받아서 세션을 생성한 것을 담아주고
      // 세션의 이름을 session.getAttribute()의 괄호 안에 넣어준다.
      String id = (String) session.getAttribute("loginId");
      
      //Service로 들어가기 위한 작업
      //ModifyService의 객체(modifysvc) 생성 및 import
      ModifyService modifysvc = new ModifyService();
      
      //MemberDTO의 객체(mbmodify) 생성 및 import
      MemberDTO mbmodify = modifysvc.memberModify(id);
      
      //request.setAttribute : MemberDTO의 객체(mbmodify)를 반환하도록 만들어준다. 
      request.setAttribute("mbmodify", mbmodify);
      
      //RequestDispatcher로 객체를 만들어서 MemberModify.jsp로 보내준다.
      RequestDispatcher dispatcher = request.getRequestDispatcher("MemberModify.jsp");
      
      //dispatcher.forward(request,response) : MemberModify.jsp로 이동할 때 
      //request,response값을 가지고 간다.
      dispatcher.forward(request,response);
	
	}
}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.ProcessService;
import dto.MemberDTO;

@WebServlet("/ModifyProcess")
public class ProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProcessController() {
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
        
        //String jsname ; String 타입의 변수 jsname선언
        //request.getParameter("jsname"): member에서 name = "jsname"로 넘겨준 정보 값
        String jsname =request.getParameter("jsname");
        String email =request.getParameter("email");
        
        //String id : String 타입의 변수 id로 선언
        //String id를 세션으로 생성하여 세션의 이름을 "loginId"로 한다. 
        String id = (String)session.getAttribute("loginId");
        
        //가져온 정보들을member변수에 담기 위해 MemberDTO 객체 선언 및 import
        MemberDTO member = new MemberDTO();
        
        //MemberDTO 객체인 member에  MemberDTO의 setId메소드에 넣는다.
         member.setId(id);
         member.setJsname(jsname);
         member.setEmail(email);
         
        //service에 들어가기 위한 작업
         //ProcessService로 보내고 받기위해 ProcessService 객체(prosvc)생성 및 import
        ProcessService prosvc = new ProcessService();
        //ProcessService의 객체 인 prosvc에 memberModify에 있는 member를 
        //int modifyResult에 담는다.
        int modifyResult = prosvc.memberModify(member);
        
        
        if(modifyResult>0) {
        	//modifyResult가 0보다 크면 
        	//LoginSuccess.jsp로 보내준다.
        	//response.sendRedirect : 정보를 보내준다.
        	response.sendRedirect("LoginSuccess.jsp");
        }else {
        	//modifyResult가 0이거나 작으면 
        	//modifyFail.jsp로 보내준다.
        	response.sendRedirect("modifyFail.jsp");
        }
	     
	}
}

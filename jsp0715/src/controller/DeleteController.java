package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.DeleteService;

@WebServlet("/memberDelete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteController() {
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
		
		//String delId ; String 타입의 변수 id선언
	    //request.getParameter("id"): member에서 name = "id"로 넘겨준 정보 값
		String delId = request.getParameter("id");
		
		//service로 넘어가게 하기 위한 작업
		//DeleteService의 객체(delscv)생성 및 import
		DeleteService delscv = new DeleteService();
		//DeleteService의 객체(delscv)의 memberDelete에 delId를 
		//int delteResult에 담는다.
		int deleteResult = delscv.memberDelete(delId);
		
		
		if(deleteResult>0) {
			//deleteResult가 0보다 크다면
			//@wepservlet의 memberList가 사용되는  servlet 페이지로 이동한다.
			response.sendRedirect("memberList");
		}else {
			//deleteResult가 0이거나 작으면
			//DelteFail.jsp로 이동한다.
			response.sendRedirect("DelteFail.jsp");
		}
		
	}

}

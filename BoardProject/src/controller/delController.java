package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.delService;

@WebServlet("/boardDelte")
public class delController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public delController() {
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
		
		int bNum = Integer.parseInt(request.getParameter("bNum"));
		System.out.println(bNum);
		delService delsvc = new delService();
		
		int result = delsvc.DelList(bNum);
		
		if(result>0) {
			response.sendRedirect("pagingList");
		}else {
			response.sendRedirect("delFail.jsp");
		}
		
		
		
	}
}

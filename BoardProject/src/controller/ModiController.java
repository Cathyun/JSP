package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.BoardDTO;
import Service.ModiService;


@WebServlet("/modiView")
public class ModiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ModiController() {
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
	      
	      String bWriter = request.getParameter("bWriter");
	      String btitle = request.getParameter("bTitle");
	      String bcontent = request.getParameter("bContent");
	      int bNum =  Integer.parseInt(request.getParameter("bNum"));
	      
	      ModiService mdsvc = new ModiService();
	      
	      BoardDTO bomi = new BoardDTO();
	      bomi.setbWriter(bWriter);
	      bomi.setbTitle(btitle);
	      bomi.setbContent(bcontent);
	      bomi.setbNum(bNum);
	      
	      int result = mdsvc.viewModi(bomi);
	      	      
	      if(result>0) {
	    	  response.sendRedirect("pagingList");
	      }else {
	    	  response.sendRedirect("modiFail.jsp");
	      }
	    		  
	      
	      
	      
	      
	}

}

package Controllor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet1") //login파일에서 form의 action에 있는 LoginServlet1을 받겠다는 의미 
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
		response.getWriter().append("doGet메소드 호출!");
		
		}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //		doGet(request, response);
		doProcess(request, response);
		response.getWriter().append("doPost메소드 호출!");
		
	}
	
	//임의로 doProcess 생성
	//doGet , doPost에 공통된 부분을 작성
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //		doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		response.getWriter().append("doProcess메소드 호출!");
		
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPw");
		int num = Integer.parseInt(request.getParameter("num1"));
		//num을 int로 받아지지 않아서 Integer.parseInt으로 int를 설정.
		
		response.getWriter().append("아이디 : " +id + "<br/>");
		response.getWriter().append("패쓰워드 : " +pw + "<br/>");
		response.getWriter().append("숫자 : " +num + "<br/>");
	}

	

}










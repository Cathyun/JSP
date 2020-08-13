package Controll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.InputService;

/**
 * Servlet implementation class inputController
 */
@WebServlet("/inputServer") //받아올 값
public class inputController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inputController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		System.out.println("1.controller로 넘어 왔나?");
		String data1 = request.getParameter("data1");
		//request.getParameter("data1");로 data1을 호출한다.
		
		//DB에 저장되는 과정
		//(1)inputDB.JSP -> (2)inputController -> (3)inputService -> 
		//(4)DAO -> (5)DB의 JSP 테이블 
		
		InputService inputsvc = new InputService();
		//service 클래스의 객체
		boolean inputResult = inputsvc.inputDB(data1);
		//2.boolean으로 참과 거짓으로 결정 -> service메소드에 있는 inputDB값을 가져와라. 
		System.out.println("7.controll.inputResult = " + inputResult);
		if(inputResult) { //8.값이 맞는지 아닌지에 따라 참,거짓 조건으로 jsp파일로 보낸다.
			response.sendRedirect("inputSuccess.jsp");
			System.out.println("8.inputSuccess.jsp로 이동");
		}else {
			response.sendRedirect("inputFail.jsp");
			System.out.println("8.inputFail.jsp로 이동");
		}
		
		
		
		
		
		
		
		
		
	}

}

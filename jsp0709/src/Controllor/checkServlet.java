package Controllor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checkServlet
 */
@WebServlet("/checkServlet")
public class checkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkServlet() {
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
		doProcess(request, response);
		/* doGet(request, response); */
		response.getWriter().append("doGet메소드 호출!");
	}
	
	    //임의로 doProcess 생성
		//doGet , doPost에 공통된 부분을 작성
		protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
	        //		doGet(request, response);
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			//getParameter로 배열을 만들어서 불어오려고 하면 몇 개 인지 몰라서
			//getParameterValues를 써줘야 한다.
			String hoon[] = request.getParameterValues("pick");
			out.append("<html>");
			out.append("<head>");
			out.append("<title>이미지선택Test Page</title>");
			out.append("<style>");
			out.append("body{background-color : orange;}");
			out.append("table{background-color: yellow;}");
			out.append("</style>");
			out.append("</head>");
			out.append("<body>");
			out.append("<table>");
			out.append("<tr>");
			for( int i=0; i<hoon.length; i++) {
         			out.append("<td>");
		         	out.append("<img src = 'image/"+hoon[i]+"'width = '200px'/>");
			        out.append("<td>");
			}       
			out.append("</tr>");
			out.append("</table>");
			out.append("</body>");
			out.append("</html>");
			//html안에 표시할 것!
            //response.getWriter().append("doProcess메소드 호출!");
		}


}

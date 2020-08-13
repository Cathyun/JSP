package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.Joinservice;
import dto.MemberDTO;

/**
 * Servlet implementation class JoinController
 */
@WebServlet("/memberJoin")
//member.jsp에서action값과 같아야 하는곳 
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public JoinController() {
        super();
    }

    /*
     * 1.doGet,doPost안에 내용을 삭제
     * 2.doProcess생성
     * 3.doGet,doPost안에 doProcess(request,response);입력
     * 4.doProcess안에request.setCharacterEncoding("UTF-8");입력
     * 5. 
     * 
     * 
     * */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
        //1번
     	//member에서 넘겨준 정보를 각각 변수에 저장한다. 
        String id = request.getParameter("id");
        //String id ; String 타입의 변수 id선언(변수는 마음대로)
        //request.getParameter("id"): member에서 name = "id"로 넘겨준 정보 값
        
     	String password= request.getParameter("password");
     	String jsname = request.getParameter("jsname");
     	String birth = request.getParameter("birth");
     	String gender = request.getParameter("gender");
     	String email = request.getParameter("email");
     	 
     	//가져온 정보들을member변수에 담기 위해 MemberDTO 객체 선언 및 import
     	MemberDTO member = new MemberDTO();
     	
     	//위에서 설정한 String id 값을  MemberDTO의 setId메소드에 넣는다.
     	member.setId(id);
     	member.setPassword(password);
     	member.setJsname(jsname);
     	member.setBirth(birth);
     	member.setGender(gender);
     	member.setEmail(email);
     	
     	//입력한 값들이 member객체에 제대로 들어갔는지 확인하도록 toString()
     	System.out.println(member.toString());
     	
     	
     	
     	//2번
     	//service로 들어가기 위한 작업
     	//JoinService로 보내고 받기 위해 JoinService 객체(joinsvc)생성 및 import
     	Joinservice joinsvc = new Joinservice();
        
     	//int result : 결과 페이지로 이동하기 위해 int타입의 변수 result를 선언
     	int result = joinsvc.memberJoin(member);
     
     	//joninService로 보내지는 역할을 한다.
     	//joinsvc.memberJoin(member): 
     	//JoinService에 있는 memberJoin(member)메소드의 return 값
     	
     	//joinsvc에서 처리한 값을 result에 담는다.
     	//joinsvc.memberJoin(member)는0 아니면 1의 값을 가진다.
     	
     	
     	
     	if(result>0) {
     		response.sendRedirect("JoinSuccess.jsp");
     		//result값이 0 보다 크다면(정상실행시)
     		//JoinSuccess.jsp페이지로 이동
     	}else {
     		response.sendRedirect("JoinFail.jsp");
     		//result값이 0이거나 0보다 작다면
     		//JoinFail.jsp페이지로 이동
     	}
	}

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import DTO.BoardDTO;
import Service.FileService;


@WebServlet("/boardWriteFile")
public class fileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public fileController() {
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
	   
	   int size = 10 * 1024 * 1024; //10MB

	   String savePath = "D:/hyun/BoardProject/WebContent/Fileuplode";
       //업로드 파일 저장경로	   
	   
	   MultipartRequest multi = new MultipartRequest(
	      request, //담아온 정보
	      savePath, //저장폴더
	      size,//파일크기
	      "UTF-8",//인코딩
	      new DefaultFileRenamePolicy() //중복 파일 이름 바꿔주기
	   );
	   
	   BoardDTO board = new BoardDTO();
	   
	   board.setbWriter(multi.getParameter("bWriter"));
	   board.setbPassword(multi.getParameter("bPassword"));
	   board.setbTitle(multi.getParameter("bTitle"));
	   board.setbContent(multi.getParameter("bContent"));
	   board.setbFile(multi.getOriginalFileName((String)multi.getFileNames().nextElement()));
	   
	   
	   FileService filesvc = new FileService();
	   
	   int ctrlResult = filesvc.BoardWrite(board);
	   //filesvc.BoardWrite(board)=>FileService의 BoardWrite(Board DTO board)메소드의
	   //return 값 svcResult
	   
	   if(ctrlResult>0) {
		   response.sendRedirect("pagingList");
	   }else {
		   response.sendRedirect("FileFail.jsp");
	   }
	   
	   
	   
	   
	}

}






























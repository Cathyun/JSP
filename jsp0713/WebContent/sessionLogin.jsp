<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <% 
  String id;
  if(session.getAttribute("id")!=null){
	  id = (String)session.getAttribute("id");
  }else{
	  id = "아이디 없음!";
  }
%>   --%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SessionLogin</title>
</head>
<body>
  <!--  [1] sessionLogin.jsp
        - 로그인 폼 만들어서 아이디/패쓰워드를
        sessionLoginResult.jsp로 넘긴다.
   -->
  <form action = "sessionLogin"method = "GET">    
 <br/>
   아이디 : <input type = "text"  name = "id">       
   비밀번호 : <input type = "password" name = "pw">
 <br/>
 <input type = "submit" onclick = "location.href='sessionLoginResult.jsp'" value = "로그인"/>      
 </form>    
             
</body>
</html>



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    
<% String userId = request.getParameter("id"); %>
<% session.setAttribute("id", userId);%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginResult</title>
</head>
<body>
   <h1>로그인 되었습니다
   <br/>
   <%=(String)session.getAttribute("id")%>님 환영합니다.
   </h1>
   <input type = "button" onclick = "location.href = 'logout.jsp'"value = "로그아웃"></input>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
   String id = request.getParameter("id");
   String pw = request.getParameter("pw");
   System.out.println("id : " + id);
   System.out.println("pw : " + pw); 
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 로그인 Page</title>
</head>
<body>
   <h1>FormTest Page</h1>
   <h3>id : <%=id %></h3>
   <h3>pw : <%=pw %></h3>
  <%--  <h3>id: <%=request.getParameter("id")%></h3>
   <h3>pw: <%=request.getParameter("pw")%></h3> --%>
</body>
</html>
<!-- 

   파라미터란?
   - 일반적으로 HTML 코드의 FORM태그 안에 정의된 인자들
   - 폼 전송이 일어날 때 HTTP요청 메시지에 담겨서
         폼 태그 내에 acion에 정의된 url로 전송된다.

 -->
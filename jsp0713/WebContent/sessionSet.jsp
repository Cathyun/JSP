<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 session.setAttribute("name", "세션값 생성"); 
 session.setMaxInactiveInterval(30*60); //30분
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionSet</title>
</head>
<body>

</body>
<script>
 location.href = "sessionTest.jsp"
</script>
</html> 
<!--  [1] sessionLogin.jsp
        - 로그인 폼 만들어서 아이디/패쓰워드를
        sessionLoginResult.jsp로 넘긴다.
        
      [2] sessionLoginResult.jsp
        - 로그인 페이지에서 넘어온 id에 session을 부여 한다.
        - 로그아웃 버튼을 만들어서 sessionLogout.jsp로 넘긴다.
      
      [3] sessionLogout.jsp
        - 로그 아웃 성공 이라는 문구를 띄우고(h1사용)
        - 로그인 페이지(sessionLogin.jsp)로 이동하는 버튼을 만든다.  -->
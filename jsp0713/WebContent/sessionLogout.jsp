<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
 <% 
 session.invalidate();
 %>   
 <!-- session.invalidate(); 모든 데이터 삭제  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionLogout</title>
</head>
<body>
<!--  [3] sessionLogout.jsp
        - 로그 아웃 성공 이라는 문구를 띄우고(h1사용)
        - 로그인 페이지(sessionLogin.jsp)로 이동하는 버튼을 만든다.
 -->  
  <h1>로그아웃 성공!</h1>
  <input type = "button" onclick = "location.href ='sessionLogin.jsp'"value = "로그인페이지로"></input>
</body>
</html>
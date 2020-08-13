<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<form action="loginResult.jsp" method = "GET">
  <h1>로그인</h1>
   아이디 : <input type="text" name = "id">
   비밀번호 : <input type ="password" name = "userPw">
 <input type = "submit" onclick = "location.href = 'loginResult.jsp'" value ="로그인"></input>    
</form>
</body>
</html>
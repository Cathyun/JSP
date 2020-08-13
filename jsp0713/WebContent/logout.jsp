<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%session.invalidate(); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
  <h1>로그아웃 되었습니다.</h1>
  <input type = "button" onclick = "location.href = 'login.jsp'" value = "처음으로"></input>
</body>
</html>
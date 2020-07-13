<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginTest Page</title>
</head>
<body>
    <!-- html  페이지에 나오도록 jsp에서 호출 -->
   <h1>LoginTest Page</h1>
   
   <h3>id : <%= request.getParameter("userId")%></h3>
   <h3>pw : <%= request.getParameter("userPw")%></h3>
   
</body>
</html>
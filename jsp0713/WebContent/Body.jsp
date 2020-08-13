<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include 지시어 예시</title>
</head>
<body>
   <%@ include file = "Header.jsp" %>
   <hr/>
   <h1>이곳은 Body부분입니다.</h1>
   <hr/>
   <%@ include file = "Footer.jsp" %>
</body>
</html>
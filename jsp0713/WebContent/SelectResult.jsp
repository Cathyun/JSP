<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>SelectResult.jsp</h1>
  <h1>DB조회 내용 출력</h1>
  <c:forEach var ="selResult" items ="${selectResult }">
   <h3>${selResult }</h3>
  </c:forEach> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DispatcherResult</title>
</head>
<body>
<h1>DispatcherResult Page</h1>
 ID1 : <%= request.getParameter("userId") %>
 PW : <%= request.getParameter("userPw") %>
 request 속성 값 : <%= request.getAttribute("requestName") %>
</body>
</html>
<!-- 
   Dispatcher방식
  - 이 방식으로 포워딩 하게 되면 주소 표시줄이 주소가 변경되지 않는다.
  - 즉, 하나의 요청이라는 의미 
  - request영역을 공유한다. 
  

  -->
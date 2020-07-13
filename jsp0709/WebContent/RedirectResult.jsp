<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RedirectResult</title>
</head>
<body>
<h1>RedirectResult Page</h1>
 ID1 : <%= request.getParameter("userId") %><br>
 PW : <%= request.getParameter("userPw") %><br>
 request 속성 값 : <%= request.getAttribute("requestName") %>
</body>
</html>
<!-- 
    Redirect방식
  - 이 방식으로 포워딩 하게 되면 주소 표시줄이 주소가 변경된다.
  - 따라서, 포워딩 된 jsp페이지에서는 request영역에 공유한 속성값에 접근할 수 없다.
  - request영역을 공유하지 않는다. 
  - value의 값이 없기 때문에 null으로 결과값이 나온다.
 -->

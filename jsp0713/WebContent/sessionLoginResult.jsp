<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
  (1)sessionLogin.jsp에서 넘어온 정보를 request.getParmeter로 받아온다.

 -->    
<%  String userId = request.getParameter("id"); %>
<!-- 
(2)request.getParmeter로 받아온 값을 변수에 담고 session을 부여한다. 
      예) session,setAttribut("id",userId);
   String id = userId;
   id 라는 변수에 user를 담는 것과 비슷한 맥락
   -->
<% session.setAttribute("id", userId);%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionLoginResult.jsp</title>
</head>
<body>
<!--  [2] sessionLoginResult.jsp
        - 로그인 페이지에서 넘어온 id에 session을 부여 한다.
        - 로그아웃 버튼을 만들어서 sessionLogout.jsp로 넘긴다.
 -->
<h1>로그인 되었습니다!
request: <%=request.getParameter("id") %>님 환영합니다.
session: <%=(String)session.getAttribute("id") %>님 환영합니다.
</h1> 

<!-- session이 부여된 값을 session.getAttribnute로 불러 온다.
     request.getParameter랑 값은 같지만 session가 부여됐는디 차이가 있다.  -->
<%-- 비밀번호 : <%=(String)session.getAttribute("pw") %> --%>
<input type = "button"onclick = "location.href = 'sessionLogout.jsp'"value = "로그아웃">
</body>
</html>













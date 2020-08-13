<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ELTest</title>
</head>
<body>
   <h2>sessionScope :  ${sessionScope.test }</h2>
       <!-- Session영역에 test라는 이름을 참조 -->
   <h2>param: ${param.name}</h2>
       <!--파라미터의 name을 표시-->

   <h2>sessionScope :<%=session.getAttribute("test") %></h2>
                <!--test라는 이름을 가진sessionScope의 이름 호출  -->
   <h2>request:<%=request.getParameter("name") %> </h2>
                   <!--내가 호출해야할 값을 괄호가 넣어야한다!-->
   <h2>session:<%=session.getAttribute("test") %></h2>
                  <!--session으로 셋팅했던 세션의 이름  호출 -->
  
</body>
</html>

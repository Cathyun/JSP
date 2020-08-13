<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% session.setAttribute("test", "SessionTest"); %> 
                     <!--세션의 이름, 세션값  -->
                     <!--test에 SessionTest를 담는다.  -->  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
 <form action = "EL_Test.jsp" method = "GET">
 <fieldset>
 <legend>EL_Test.jsp로 보내기</legend>
 <input type = "text" name= "name" value = "유현서"/>
 <input type = "submit" value ="전송" />
                <!-- submit으로 전송하고자 하는 페이지를 호출할 수 있다.  -->
 </fieldset>
 </form>   
    
</body>
</html>
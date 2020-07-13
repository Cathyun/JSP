<%@ page language= "java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset= "UTF-8">
<title>로그인 form</title>
</head>
<body>
   <form action = "FormTest" method = "POST">
   <!--method = "GET"으로 하면 한글이 나온다 
   method = "POST"는 한글이 나오지 않는다.  -->
   <fieldset>
   <legend>로그인</legend>
   <label>ID: <input type = "text" name ="id"></label>
    <label>PW: <input type = "password" name ="pw"></label>
    <input type = "submit" value ="로그인"/>
    </fieldset>
  </form>
</body>
</html>
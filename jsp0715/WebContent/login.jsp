<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
fieldset{
  width : 500px;
  margin-left : 500px;
}

#login{
  margin-left: 150px;
}

legend{ 
  text-align : center;
  
}
</style>
</head>
<body>
<form action = "memberLogin" method = "GET">
  <fieldset>
     <legend>로그인</legend>
     <table>
       <tr>
         <td>아이디: <input type = "text" name = "id"></td>
         <td>패쓰워드 : <input type ="password" name ="password"></td>
       </tr>
     </table>	
       <input type = "submit" value = "로그인" id  = "login">
       <input type = "button" value = "회원가입" onclick = "location.href = 'member.jsp'">
       <input type = "button" value ="뒤로 가기" onclick = "location.href = 'main.jsp'">   
 </fieldset> 
 </form>
</body>
</html>
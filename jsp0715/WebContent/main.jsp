<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<style>

fieldset{
  width : 150px;
  margin-left : 650px;
} 
td{
 margin : 300px;
}

legend{
 text-align:center;
}
#login{
 margin-left : 30px; 
 
 }
</style>
</head>
<body>
     <fieldset>
     <legend>로그인/회원가입</legend>
     <table>
       <tr>
         <td><img src = "poo.jpg" width = "200px"></td>
       </tr>
       <tr>  
         <td><input type = "button" value="로그인" onclick = "location.href = 'login.jsp'" id = "login">
         <!--회원가입 버튼을 누르면 회원가입페이지(member.jsp)로 이동  -->
         &nbsp&nbsp&nbsp&nbsp&nbsp<input type = "button" value = "회원가입" onclick = "location.href = 'member.jsp'"></td>
       </tr>
     </table>

     </fieldset>
</body>
 
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberModify.jsp</title>
</head>
<body>
    <h1>회원정보 수정</h1>
     현재 아이디 : ${mbmodify.id }<br/>
     현재 비밀번호 : ${mbmodify.password }<br/>
     현재 이름 : ${mbmodify.jsname }<br/>
     현재 생년월일 : ${mbmodify.birth }<br/>
     현재 성별 : ${mbmodify.gender }<br/>
     현재 이메일 : ${mbmodify.email }<br/>
  <form action  = "ModifyProcess" method ="POST" name = "modiform">
   <fieldset>
  
   <table>
     <tr>
      <td>확인용 비밀번호 : <input type ="password" name ="password" id="password"></td>
     </tr>
     <tr>
       <td>이름 : <input type ="text" name = "jsname"></td>
     </tr> 
     <tr>
      <td>이메일 : <input type ="email" name = "email"></td>
     </tr>
    </table>
 </fieldset>
</form>
    <button onclick = "memberModify()">정보수정</button>  
    <button onclick = "gomain()">메인으로</button>
</body>
<script>
  function goMain(){
	  location.href = "Main.jsp"
  }
  
  function memberModify(){
	  
	  var passwordConfirm = document.getElementById("password").value;
	  var password = '${mbmodify.password}';
	  
	  if(passwordConfirm == password){
		  modiform.submit();
	  }else{
		  alert('비밀번호가 틀립니다.');
	  }
  }
</script>
</html>
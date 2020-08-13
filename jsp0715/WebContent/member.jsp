<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
<style>
fieldset{
  width : 450px;
 
}

#re{
  margin-left: 50px;
}
legend{ 
  text-align : center;
  
}

td{
 padding-left: 50px;

}
#name{
 margin-left :55px;
}
</style>
</head>
<body>
<!--action: 작성된 것을 보내주는 페이지를 작성한다.  -->
<!--memberJoin은 어디로 갈지 모르지만 servlet 파일 중 @webServlet(/"memberJoin")이 작성된 곳으로 이동  -->
<!--JoinController.java파일에 작성  -->
<!--※※※※※※※※주의 사항※※※※※※※  -->
<!--action으로 보내는 값과 servlet에서 받는 값이 같아야 한다.  -->
<!--method : post/get 개인정보가 있을 때는 post로!  -->
<form action  = "memberJoin" method ="POST">
   <fieldset>
   <legend>회원가입</legend>
   <table>
     <tr>
      <td>아이디 : <input type ="text" name ="id" id = "id"></td>
     </tr>
     <tr>
      <td>비밀번호 : <input type ="password" name ="password" id = "password"></td>
     </tr>
     <tr>
     <!--password : 입력시 보이지 않도록 표시함  -->
       <td>이름 : <input type ="text" name = "jsname" id="jsname"></td>
     </tr> 
     <tr>
     <!--date : 달력  -->
      <td>생년월일 : <input type ="Date" name = "birth" id = "birth"></td>
     </tr>
     <tr>
     <!--radio : name이 같은 것 중 하나만 선택됨  -->
     <!--value : 결과 값이 넘어갔을 때 표시되는 값  -->
      <td><input id = "name"type ="radio" name = "gender" id = "gender"value ="women">여자 <input type ="radio" name = "gender" value ="Men" id = "gender">남자</td>
     </tr>
     <tr>
     <!--email: @가 작성이 들어가야  입력이 가능하다.  -->
      <td>이메일 : <input type ="email" name = "email"></td>
     </tr>
    </table>
    <!--reset: form안에 작성했던 것을 모두 초기화  -->
       <input type ="reset" value ="다시 작성" id = "re">
       <!--submit: form안에 있는 작성하는 것을 보내준다. value에 글자를 적으면 버튼이름이 된다.-->
       <input type ="submit" value ="회원가입">
       <input type ="button" value ="다시 앞으로" onclick = "location.href = 'main.jsp'">
 </fieldset>
</form>
</body>
</html>
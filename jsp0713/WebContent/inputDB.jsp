<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input DB.jsp</title>
</head>
<body>
   <h1>Input DB</h1>
   <h3>data1이라는 파라미터에 각각 jsp라는 정보를 담아서 
   inputServer라는 주소로 전송하고 콘솔에 전송받는 값을 출력</h3>
<form action = "inputServer"method = "GET">
<!-- inputController에 보내야함!!  -->
       입력값 : <input type ="text" name = "data1"/> 
   <input type = "submit" value ="전송"/>
</form>   
 
 //DB내용 조회
<h1>DB내용 조회하기</h1>
첫번째 방법 : <a href = "selectDB">DB조회링크</a>
<br/>
두번째 방법 : <button onclick = "select()">DB조회버튼</button>
</body>
<script>
 function select(){
	 location.href = "selectDB";
 }
</script>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<style>
table, td, th {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 10px;
}

.btn {
	text-align: center;
}
</style>
</head>
<body>
  <form action = "DispatcherResult" method = "POST">
 
	<table>   
		<caption>로그인 폼 만들기</caption>
		<tr>
			<th colspan="2">로그인</th>
		</tr>
		<tr>
			<th>ID</th>
			<td><input type="text" name="userId"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="password" name="userPw"></td>
		</tr>
		<tr>
			<td colspan="2" class="btn">
			 <input type="submit" value="로그인">
			 <input type="button" value="버튼">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>

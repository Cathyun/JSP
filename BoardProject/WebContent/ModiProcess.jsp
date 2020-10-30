<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% int bNum = Integer.parseInt(request.getParameter("bNum"));%>
<% String bContent = (request.getParameter("bContent"));%>
<% String bTitle = (request.getParameter("bTitle"));%>
<% String bWriter =(request.getParameter("bWriter"));%>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정페이지</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	현재 작성자 :<%=bWriter%><br/>
	현재 제목 : <%=bTitle%><br/>
	현재 내용 : <%=bContent%><br/>
	
	<form action="modiView" method="POST" name="modiform">
			<table>
				<tr>
					<td>작성자: <input type="text" name="bWriter" ></td>
				</tr>
				<tr>
					<td>제목 <input type="text" name="bTitle"	></td>
				</tr>
				<tr>
					<td>내용 : <input type="text" name="bContent"></td>
				</tr>
				<tr>
					<td>번호 : <input type="hidden" name="bNum" value =<%=bNum %>></td>
				</tr>
			</table>
	</form>
	<button onclick="boardPassword()">수정</button>
</body>

<script>
	function boardPassword() {
		modiform.submit();
	}
</script>
</html>
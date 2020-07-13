<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>choice picture</title>
<style>
table {
	text-align: center;
}
</style>
</head>
<body>
	<h1>좋아하는 사진을 선택하세요.</h1>
	<form action="checkServlet" method="GET">
		<table>
     <tr>
        <td><img src ="image/chen.jpg"width = "200px"></td>
        <td><img src ="image/jung.jpg"width = "200px"></td>
        <td><img src ="image/kim.jpg"width = "200px"></td>
        <td><img src ="image/lim.jpg"width = "200px"></td>
     </tr>
      <tr>
        <td><input type = "checkbox"name = "pick" value = "chen.jpg">1번 현서야</td>
        <td><input type = "checkbox"name = "pick" value = "jung.jpg">2번 사룽해</td>
        <td><input type = "checkbox"name = "pick" value = "kim.jpg">3번 열심히해</td>
        <td><input type = "checkbox"name = "pick" value = "lim.jpg">4번 짝꿍이 엘리트라 잘할거야</td>
     </tr>
      <tr>
        <td colspan = "4"><input type ="submit" value = "선택"/></td>
     </tr>  
		</table>
	</form>
</body>

</html>
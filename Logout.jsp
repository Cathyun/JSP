<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>S.BS</title>
 <link rel="shortcut icon" href="Image/logo_icon.ico">
</head>
<body>

</body>
<script>
	alert("로그아웃");
	<%session.invalidate();%>
	location.href="Index.jsp";
</script>
</html>
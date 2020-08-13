<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--taglib을 사용할 때는  html위에 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>을 작성한다!-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success.jsp</title>
</head>
<body>

	<form action="memberLogout">
		<h1>${sessionScope.loginId}님 환영합니다.</h1>
		                  <!--세션 값  -->
		                  
		<c:if test="${sessionScope.loginId eq 'admin'}">
		<!--LoginController에서 세션을 생성한 값을 가지고 와서
		    loginId의 값이 admin과 같다면 -->
		    
		  <!-- 회원조회 : 세션값을 설정하고 loginId를 'admin'으로 목록조회할 수 있도록 한다.-->
		  <!--회원목록조회을 누르면 memberList으로 이동한다. -->
			<a href="memberList">회원목록조회</a>
			
		</c:if>
		<input type="submit" onclick = "memberModify()" value="회원수정"></input>
    <!-- 회원수정을 눌렀을 때 memberModify()의 변수를 설정하여 script에서 function을 만들어준다.  -->
		<input type="submit" value="로그아웃"></input>
		<!--로그아웃 버튼을 누르면 form의 action값으로 이동한다.  -->
	</form>
    
		
</body>
<script>
 function memberModify(){
	 location.href ="memberModify"
 }
</script>
</html>
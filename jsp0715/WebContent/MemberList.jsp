<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  table,tr,td{
    border : 1px solid black;
  }
</style>
</head>
<body>
    <table>
      <tr>
        <td>이름</td>
        <td>패쓰워드</td>
        <td>이름</td>
        <td>생년월일</td>
        <td>성별</td>
        <td>이메일</td>
        <td>상세조회</td>
        <td>탈퇴</td>
      </tr>
      <!--반복처리 태그 : c:forEach를 사용하여 var로 변수를 설정   -->
      <c:forEach var = "member" items ="${memberList }">
      <!--listController에서 setAttribute이름을 items에 넣어준다. -->
        <tr>
        <!--listController에서 생성한 memberList를 member로 받아   
        EL의 사용법으로 호출한다.-->
        <td>${member.id }</td>
        <td>${member.password }</td>
        <td>${member.jsname }</td>
        <td>${member.birth }</td>
        <td>${member.gender }</td>
        <td>${member.email }</td>
        
        <!-- 상세조회는 memberView에서 id를 호출한다.  -->
        <td><a href = "memberView?id=${member.id}">상세조회</a></td>
        <!--탈퇴는 memberDelte에서 id를 호출한다.  -->
        <td><a href = "memberDelete?id=${member.id}">탈퇴</a></td>
      </tr>
      </c:forEach>
    </table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PageList.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>글제목</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="board" items="${boardList}">
			<tr>
				<td>${board.bNum}</td>
				<td>${board.bWriter}</td>
				<td><a href="boardView?bNum=${board.bNum}&page=${paging.page}">${board.bTitle}</a></td>
				<td>${board.bDate}</td>
				<td>${board.bHit}</td>
			</tr>
		</c:forEach>
	</table>
	
	<!--페이징 처리  : 이전의 맨마지막 이 1이다-->
	<c:if test="${paging.page<=1}">[이전]&nbsp;</c:if>
	<!-- 페이지를 하나 전으로 이동하겠다. -->
	<c:if test="${paging.page>1}">
       
		<a href="pagingList?page = ${paging.page-1}">[이전]</a>&nbsp;
	</c:if>
	<c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="i"
		step="1">

		<c:choose>
			<c:when test="${i eq paging.page }">
	        ${i}
	     </c:when>
			<c:otherwise>
				<a href="pagingList?page=${i}">${i}</</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>

	<c:if test="${paging.page>= paging.maxPage}"></c:if>
	<c:if test="${paging.page<paging.maxPage}">

		<a href="pagingList?page = ${paging.page+1}">[다음]</a>&nbsp;</c:if>
</body>
</html>
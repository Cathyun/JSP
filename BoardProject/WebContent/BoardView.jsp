<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardView.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>${boardView.bNum}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${boardView.bTitle}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${boardView.bWriter}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${boardView.bContent}</td>
		</tr>
		<tr>
			<td>파일</td>
			<td><img src="Fileuplode/${boardView.bFile}" width="200"><br />${boardView.bFile}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${boardView.bHit }</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${boardView.bDate}</td>
		</tr>
		<tr>
			<td colspan="2">
				<button onclick="pagingList()">목록보기</button>
				<button onclick="modiProcess()">수정</button>
				<button onclick="boardDelte()">삭제</button>
			</td>
		</tr>
	</table>
	<button onclick="password()">비밀번호 확인</button>

</body>
<script>
	function boardDelte() {
		var passConfirm = prompt('비밀번호를 입력하세요');
		var password = $
		{
			boardView.bPassword
		}
		;

		if (password == passConfirm) {
			alert('비밀번호가 일치합니다');
			location.href = "boardDelte?bNum=${boardView.bNum}";
		} else {
			alert('비밀번호가 틀립니다.');
		}
	}

	function pagingList() {
		location.href = "pagingList";
	}

	function password() {

		var passConfirm = prompt('비밀번호를 입력하세요');
		var password = $
		{
			boardView.bPassword
		}
		;

		if (password == passConfirm) {
			alert('비밀번호가 일치합니다');
		} else {
			alert('비밀번호가 틀립니다.');
		}
	}

	function modiProcess() {
		var passConfirm = prompt('비밀번호를 입력하세요');
		var password = $
		{
			boardView.bPassword
		}
		;

		if (password == passConfirm) {
			alert('비밀번호가 일치합니다');
			location.href = 'ModiProcess.jsp?bNum=${boardView.bNum}&bWriter=${boardView.bWriter}&bTitle=${boardView.bTitle}&bContent=${boardView.bContent}';
		} else {
			alert('비밀번호가 틀립니다.');
		}
	}
</script>
</html>
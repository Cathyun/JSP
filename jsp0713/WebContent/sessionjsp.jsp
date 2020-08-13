<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% session.setMaxInactiveInterval(1000); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
 <!--
   [1]Session
     - (세)션은 정보가  (서)버에 저장된다.
     - 서버당 한 개만 생성 가능
     - 브라우저를 종료하면 삭제된다.
     - 보안이 좋다.
     - 세션이 많아질 경우 서버에 과부하가 올 수 있다.
     ex) 로그인, 장바구니
   
   [2]Cookie
   - (쿠)키는 정보가 (클)라이언트에 저장된다.
   - 클라이언트(컴퓨터)에 여러 개(파일) 생성 가을
   - 브라우저를 삭제해도 기록이 남아 있다.
          단, 만료 기간이 지나면 삭제 된다.
   - 보안에 취약하다.       
   
   [3]Session객체의 사용
    (1)setAttribute() : 세션에 데이터를 저장한다.
    (2)getAttribute() : 세션에 저장된 데이터를 불러온다.
    (3)getAttributeName : 세션에 저장되어 있는 모든 세션 이름을 가져온다.
    (4)getId : 자동 생성된 세션의 유니크한 아이디를 얻는다.
    (5)getCreateTime() : 세션이 생선된 시간을 구한다.
    (6)getLastAccessesTime() : 웹 브라우저라 마지막에 세션에 접근한 시간을 구한다.
    (7)setMaxInactiveInterval() : 세션의 유효 시간을 설정(초단위)
    (8)getMaxInactiveInterval() :세션의 유효 시간을 얻는다.
    (9)removeAttribute(): 특정 세션을 삭제 한다.
    (10)invalidate(): 모든 세션을 삭제 한다.
   -->	
   
   <h1>세션테스트</h1>
   isNew() : <%session.isNew(); %><br/>
     생성시간 : <%session.getCreationTime();%><br/>
     최종 접속 시간 : <%session.getLastAccessedTime(); %>
    세션 ID: <%session.getId(); %> 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
</body>
</html>
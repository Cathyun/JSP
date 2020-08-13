<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL의 정의</title>
</head>
<body>
    <!-- 
    [1]EL(Express Language): 표현언어
     <%=%>를 ${}로 표시
     
     test 변수를 표시할 때 ${test}
     Car객체의 color를 표시할 때 {Car.color},${car['color']},${car["color"]}등으로 표현가능하다.
     
     [2]EL의 내장 객체

     (1)pageScope : Page영역에 존재하는 객체를 참조할 때 사용
     (2)requestScope: Request영역에 존재하는 객체를 참조할 때 사용
     (3)sessionScope : Session영역에 존재하는 객체를 참조할 때 사용
     (4)applicationScope : Application 영역에 존재하는 객체를 참조할 때 사용
     (5)param : 파라미터 값을 얻어 올 때 사용
     (6)paramValues : 파라미터 값을 배열로 얻어 올 때 사용
     (7)initParam : 컨텍스트의 초기화 파라미터를 의미
     
     [3]영역 객체(Scope)와 속성(Attribute)

      - 영역 객체 종류 : page, request,session, application
      (1)page : 해당 페이지가 유지되어 있는 동안에만 유효하고 페이지가 바뀌면 사라진다.
      (2)request : 클라이언트의 요청이 처리되는 동안에만 유효한다.
               포워딩을 수행해도 유지가 되기 때문에 request영역에 데이터를 저장하면 다양하게 활용할 수 있다.
      (3)session : 웹 브라우저가 실행되고 있는 동안에마 유효하다.
                   웹브라우저를 닫기 전까지는 session영역에 담겨 있는 데이터를 사라지지 않고  게속 유지
                   웹사이트에 로그인 했을 때 로그인 정보를 보통 session영역에 담음.
      (4)application : 서버가 구동되고 있는 동안에만 유효하EK. 
                       서버를 올리고 내리기 전까지는 application영역에 담은 데이터는 유지된다. 
      
    -->
</body>
</html>
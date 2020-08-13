<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--JSP지시어  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP지시어(Directive)</title>
</head>
<body>
<!-- 
  [1]JSP : 전체적인 틀은 HTML로 구성
           Java코드를 <% %>안에 삽입
  [2]Servlet : 전체적인 틀은 java코드로 구성
                             객체를 통해 HTML 코드 삽입        
  [3]JSP지시어(Directive)
    - <%@ %>로 구성되어 있는 코드
    1) Page 지시어
    2) Include 지시어
    3) Taglib 지시어
    
  [4]Page지시어
    1)language
     - language = "java"
     - 스크립트 요소에서 사용할 언어 설정
     
    2) extends
     - extends = "클래스명"
     - 상속받을 클래스 설정
     
    3) import
     - import = "패키지 명.클래스명"
     - import할 패키지, 클래스 설정
     
    4)session
     - session = "true"
     - HttpSeession 사용여부를 설정
     
    5) errorPage
     - errorPage = "에러페이지.jsp"
     - 에러 페이지로 사용할 페이지 설정
     
    6) contentType
     - contentType = "text/html; charset = "UTF-8"
     - JSP페이지가 생성할 문서타입을 지정
     
    7)pageEncoding
     - pageEncoding = "UTF-8"
     - 현재 페이지의 문자 인코딩 타입 설정
     
  [5]Include 지시어
    - 페이지를 삽입할 때 사용하는 지시어
    - HTML태그를 넣어도 HTML결과가 나오는 것이 아니라 
            소스 자체를 톨째로 가져온다고 보면 된다.
            
  [6]Taglib 지시어         
    - 태그 사용을 통해 자바 소스를 대체하고자 하는 경우
    - 사용자에 의해 만들어진 tag를 이용할 때 사용됨(사용자 정의태그)
    - <%@ taglib ptofix = "태그 라이브러리 타입" uri = "TLD파일 위치 정보"%> 
    - profix : 어떤 타입의 태그 라이브러리를 작성할 것인가
    - uri : 실제 존재하고 있는 TLD파일의 위치 정보
    - TLD 파일 : 커스텀 태그 정보를 담고 있는 라이브러리 파일	                           
  -->
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
</body>
</html>
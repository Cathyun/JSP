/* 
  Date : 2020.05.18
  Author : 	youhyunseo
  Description : 자바 기본문법1(식별자, 변수, 연산자)
  Version : 1.1   

*/
package Chapter02;
public class Ex01_Chapter02 {

	public static void main(String[] args) {
		// 1. main 함수 : 프로그램을 실행할 때 가장 먼저 호출
		//               프로그램을 실행하기 위해 필요한 메소드
        //2. 식별자 (Indentifier)
		
		//Naming Convension
		//(1)클래스 : 대문자로 시작, 다른듯의 단어가 나올 시 대문자로 
		           //ex) ArrayExample
		//(2)메소드 : 소문자로 시작해서 동사로 작성, 다른뜻이 나올 시 대문자
		           //ex)run(); runTrack();
		//(3)변수 : 소문자로 시작해서, 다른뜻의 단어가 나올시 대문자로 
		          //ex) numberOfStudent
		//(4)상수 : 모든 문자를 대문자, 다른 뜻의 단거가 나올 시 _(언더바)로 구분
		          //ex)PI, MAX_NUM
		
		//3. 주석
		//(1) //한줄 주석
		//(2) /* 범위 주석*/
		//(3) /** 도큐먼트 생성시 */
		
		//4. 변수 : 특정 타입의  데리터를 메모리상에 담는 영역
		//(1)변수 선언 
		// 데이터 타입 변수 명;
		//int num;
		//int x,y,z;(여러개 한번에 선어 가능)
		//(2)변수 초기화(값 대입)
		//  num = 5;
		//(3)변수 선언과 초기화
		//   int i = 10, j=20, k=30;(여러개 가능)
		
		
		
		//5. 데이터타입
		
		//(1)기본형(Primitive Type)
		//① 정수형 : byte, short, int, long(L)
		//② 실수형 : float(f),double
		//④ 논리형 : boolean
		//④ 문자형: char
		//(2)참조형(Reference Type)
		//        -기본형을 제외한 나머지 데이터 타입
		//         (String, System,Scanner 등등)
		//        - 객체의 주소를 저장
		//6. 데이터 형 변환
		//(1)일시적 형변환 : 작은 타입의 데이터를 큰 타입의 데이터로 할당할 때 
		               //자동으로 데이터 타입이 바뀜
//        byte bNum = 10;
//        int iNum = bNum;
//        System.out.println("bNum :" + bNum);
//        System.out.println("iNum :" + iNum);
		
        //(2)명시적 형변환 : 큰 타입의 데이터를 작은 타입의 데이터로 할당할 때 
        //               명시적으로 데이터 타입이 바뀜'
        int iNum1 = 20;
        byte bNum1 = (byte)iNum1;
        System.out.println("bNum :" + bNum1);
        System.out.println("iNum :" + iNum1);
		
		//7. 연산자
        //(1)단항연산자 : 증감연산자
        //(2)이항연산자 : 논리연산자, 대입연산자, 산술연산자, 비교연산자(, 비트연산자, 쉬프트연산자)
        //(3)삼항연산자 : 조건연산자
        
        //(4)증감 연산자 : 1씩 증가(++) 시키거나 1씩 감소 (--)
        //             i ++ =>>i = i + 1      i-- =>> i = i-1
        //++num : num이 가지고 있는 값에 1을 증가한 뒤 연산에 사용
        //num++ : num이 가지고 있는 값에 연산을 사용 후  1을 증가함.
        
        
        
        //(5)논리 연산자 
        //&&(AND연산) : 이거나
        //A && B 일 때 A,B모두 참(true)일 경우 결과가 true
        //A,B중에 하나라도 거짓(false)이 있으면 결과는 거짓(false)
        
        //||(or연산) : 또는
        //A || B일 때, A,B중에 하나라도 참이면 결과는 참
        //A,B모두 거짓일 경우 결과가 거짓
        
        //!(NOT연산) :boolean변수 앞에 사용하면 결과가 반전 
        
        
        boolean run = true;
        System.out.println("run :" + run);
        run = !run;
        System.out.println("!run : " + run);
        run = !run;
        System.out.println("!!run :" + run);
        
        
        //(6)조건연산자
        //(조건식) ? 참값: 거짓값
        //p.91
        int num = 10;
        int num1 = (num < 15) ? 7 : 15 ;
        //num값이 15보다 작으면 7로 출력 그렇지 않으면 15출력
        System.out.println("조건 연산자 결과"+num1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

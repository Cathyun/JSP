/* 
  Date : 2020.05.18
  Author : 	youhyunseo
  Description : 논리연산자
  Version : 1.1   
*/

package Chapter02;

public class Ex02_OperationTest4 {

	public static void main(String[] args) {
       
		int x = 100;
		int y = 200;
        boolean result = false;
        
        //&&
        result = x < y && y >=200;
        System.out.println("x < y && y >=200 :" + result);
        
        //System.out.println(" "+result);
        result = x < y && y <200;
        System.out.println("x < y && y <200 :" + result);
        System.out.println("y=" + y);
       
       
        //||
        result = x < y || y >= 200;
        System.out.println("x < y || y >= 200 :" + result);
        
        result = x < y || y < 200;
        System.out.println("x < y || y < 200 :" + result);
        
        result = x > y || y++ > 200 ;
        System.out.println("x > y || y++ > 200 :" + result);
        System.out.println("y = " + y);//201
        
        result = x < y || y++ > 200 ;
        System.out.println("x < y || y++ > 200 :" + result);
        System.out.println("y = " + y);//201S

        //!
        result = !(x > y);
        System.out.println("x > y = " + result);
        
        
        
        
        
        
        
        
        
        
		

	}

}

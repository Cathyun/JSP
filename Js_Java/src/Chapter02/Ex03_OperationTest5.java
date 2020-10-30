/* 
  Date : 2020.05.18
  Author : 	youhyunseo
  Description : 논리연산자5
  
  Version : 1.1   
*/
package Chapter02;

public class Ex03_OperationTest5 {

	public static void main(String[] args) {
		int var_inc = 1;
		int var_dec = 1;
		int result = 0;
		
		
		//++
		result = var_inc++;
		System.out.println("result = " +result);
		System.out.println("var_inc = " + var_inc);
		//result = var_inc
		//   1   =   1
		// var_inc = var_inc
		//    2    =    1   + 1
       
		result = ++var_inc;
		System.out.println("result = " +result);
		System.out.println("var_inc = "+ var_inc);
		//var_inc = var_inc + 1
		//   3    =   2     + 1
		//result  = var_inc
		//   3    =   3
		
		//--
		result = var_dec--;
		System.out.println("result ="+result);
		System.out.println("var_dec = "+ var_dec);
		// result = var_dec
		//   1    =   1 
	    //var_dec = var_dec - 1
		//   0    =   1    - 1
		result = --var_dec;
		System.out.println("result =" + result);
		System.out.println("var_dec ="+var_dec);
		//var_dec = var_dec - 1
		//   -1   =   0     - 1
		//result  =  var_dec
		//  -1    =   -1
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

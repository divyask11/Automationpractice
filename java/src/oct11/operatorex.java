package oct11;

public class operatorex {

	public static void main(String[] args) {
// compare the two opwrator with && and ||
		
		int num1=10,num2=50;
		boolean result1=(num1!=num2);
		boolean result2=(num1== num2);
		boolean result3=(num1>num2);
		boolean result4=(num1>=num2);
		boolean result5=(num1<num2);
		boolean result6=(num1<=num2);
		
		System.out.println("number1="+num1);
		System.out.println("number2="+num2);
		System.out.println("result="+result1);
		System.out.println("result="+result2);
		System.out.println("result="+result3);
		System.out.println("result="+result4);
		System.out.println("result="+result5);
		System.out.println("result="+result6);
		
	
		System.out.println("***********************************************");
	   System.out.println("final result: "+((num1!=num2)&&(num1<= num2)));
	   System.out.println("Final Result: "+((num1==num2) || (num1>=num2)));
	   System.out.println("Final Result: "+((num1>num2) && (num1<num2)));
	   System.out.println("Final Result: "+((num1!=num2) || (num1>num2)));
	   
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}


	}





/*
condition1 && condition2 
if both condition result is true dn final value will be true
if any one condition result is false dn final value will be false

condition1 || condition2 
if both condition result is true dn final value will be true
if any one condition result is true dn final value will be true
if both condition result is false dn final value will be false
*/

package nov14_scanner_string;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		
		System.out.println("start");
				 
//		int num1=10,num2=20,result;
//		System.out.println("Number1: "+num1);
//		System.out.println("Number2: "+num2);
//		result=num1+num2;
//		System.out.println("Result: "+result);
		
		
		int num1,num2,result;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no1:");
        num1=scn.nextInt();
        
        
        System.out.println("enter no 2:");
		num2=scn.nextInt();
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		
		result=num1+num2;
		System.out.println("result:"+result);
		
		
		
		
	}

}

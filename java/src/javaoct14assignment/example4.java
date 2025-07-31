package javaoct14assignment;

public class example4 {

	public static void main(String[] args) {
		//Reverse a number using a for loop in Java
		int num=12345;
		int revnum=0;
		
		System.out.println("number="+num);
		 while(num !=0) {
			 int rem=num%10;
			 
		 
		  revnum = revnum * 10 + rem;
		  
		System.out.println("reverse number="+revnum);
		 num = num / 10;
		 }
		}
	}
	

package oct11;

public class unaeyopex1 {

	public static void main(String[] args) {

	//using a increment and decrement operator 
	//	a++ ++a and --a and a --
		
		
		int num1 =10;
		int num2=num1;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		int num3=num1++;
		System.out.println("num1="+num1);// 10
		System.out.println("num3="+num3); //11
		
		
		num3=20;
		int num4=++num3;
		System.out.println("num4="+num4);// 21
		System.out.println("num3="+num3); //21
		
		 num1=num4--;
		 System.out.println("num4="+num4);// 20
			System.out.println("num1="+num1); //21
			
			num1=--num4;
			 System.out.println("num4="+num4);// 19
				System.out.println("num1="+num1); //19
		
		
	}

}



/*
increment
	pre- first operation dn use updated value
	post- first use the value dn perform operation

decrement
	pre- first operation dn use updated value
	post- first use the value dn perform operation
*/

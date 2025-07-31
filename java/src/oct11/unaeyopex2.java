package oct11;

public class unaeyopex2 {

	public static void main(String[] args) {

	//using a increment and decrement operator 
	//	a++ ++a and --a and a --
		
		
		int num1=50;
		
		System.out.println("number1:"+num1);
		
		
		              int res= num1  + ++num1 + num1++;
	//initial value              50   51         51
	//final value                50    550         52
		              
		              System.out.println("result:"+num1); //50

		              System.out.println("result:"+res);   
		              
		              int num2=10;
		              System.out.println("number2:"+num2);
		              int res2 = --num2 + num2--;
		                          //9      8
		              System.out.println("result:"+num2);
		              System.out.println("result:"+res2);
		              
		              
		              
		              num1=10;
		      		res = --num1 + num1-- + ++num1 + num1 + num1-- + ++num1;
		               //    9    8       11          10     8        11       
		      		System.out.println("result:"+num1);
		              System.out.println("result:"+res);
		              
		              
		
		
	
		
		
		
		
		
		
	
		
		
			
		
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

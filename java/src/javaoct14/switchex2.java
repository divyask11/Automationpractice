package javaoct14;

public class switchex2 {



	public static void main(String[] args) {
		 int  ope='-';
		
		 int num1=10;
		 int num2=20;
		 int res;
		 
		 System.out.println("number1="+num1);

		 System.out.println("number2="+num2);
		 
		 switch(ope) {

		 
		 case '+':
			 res=num1+num2;
			 System.out.println("given rsult is addition: "+res);
		 break;
		 
		 case '-':
			 res=num1-num2;
			 System.out.println("given rsult is substraction: "+res);
		 break;
		 
		 case '*':
			 res=num1+num2;
			 System.out.println("given rsult is multiplication: "+res);
		 break;
	
		 case '/':
			 res=num1+num2;
			 System.out.println("given rsult is division: "+res);
		 break;
		 
		
		 default:
			 System.out.println("wrong operation ");
		 break;
		 
		 
		 }
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
}
}
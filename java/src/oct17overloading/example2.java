package oct17overloading;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition();
System.out.println("************************************");
addition(10,200);
System.out.println("**************************************");
addition(10.5f,200.05);
System.out.println("**************************************");
addition(10.05,200);
System.out.println("**************************************");

		
	}
		
		static void addition () {
			int num1=10,num2=20,res=num1+num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
			System.out.println("result="+res);
		}
		
		
		
		static void addition (int num1,int num2) {
			double res=num1+num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
			System.out.println("result="+res);
		}
		static void addition (float num1,double num2) {
			double res=num1+num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
	
			System.out.println("Result: "+res);
		}
		static void addition (double num1,int num2) {
			double res=num1+num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
			System.out.println("result="+res);
		}
				
	}

/*
when a class contains same method more than once with different set of parameter like-
	- diff type of paramter
	- diff in position of parameter
	- diff in number of parameter


*/








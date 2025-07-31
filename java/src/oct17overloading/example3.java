package oct17overloading;

public class example3 {

	public static void main(String[] args) {
		// for using non static method 
		//we can create a referance varianle object 
		
		//classname refrancevariable=new class name =syntax of object
		example3 ref=new example3();
		
		
		
ref.addition();
System.out.println("************************************");
ref.substraction(10,200);
System.out.println("**************************************");
ref.multiplication(10.5f,200.05);
System.out.println("**************************************");
ref.division(1000.0,10);
System.out.println("**************************************");

		
	}
		
		 void addition () {
			int num1=10,num2=20,res=num1+num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
			System.out.println("result="+res);
		}
		
		
		
		 void substraction (int num1,int num2) {
			double res=num1-num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
			System.out.println("result="+res);
		}
		 void multiplication (float num1,double num2) {
			double res=num1*num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num2);
	
			System.out.println("Result: "+res);
		}
		 void division (double num1,int num2) {
			double res=num1/num2;
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








package oct17overloading;

public class example4 {

	public static void main(String[] args) {
	addition();
	addition();
	
		
	}
		// overloading method call
		
		static void addition() {
			int num1=10,num2=20,res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
		}
		static int addition() {
			double num1=10,num2=20,res=num1+num2;
			System.out.println("Number1: "+num1);
			System.out.println("Number2: "+num2);
			System.out.println("Result: "+res);
			

	}
				
}

/*
when a class contains same method more than once with different set of parameter like-
	- diff type of paramter
	- diff in position of parameter
	- diff in number of parameter

can we achieve overloading by just changing only method return type?
	no
*/










/*
when a class contains same method more than once with different set of parameter like-
	- diff type of paramter
	- diff in position of parameter
	- diff in number of parameter

when a class contains same method more than once with different set of parameter like-
	- diff type of paramter
	- diff in position of parameter
	- diff in number of parameter

you can overload
	static method
	non-static method
	main
	
overloading in not dependent on return type
*/









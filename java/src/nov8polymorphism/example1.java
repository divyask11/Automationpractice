package nov8polymorphism;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition();
System.out.println("________________");
addition(12,20);		
		
		
		
		
	}
	
	static void addition(int num1,int num2) {
		int  result=num1+num2;
		System.out.println(" num1:"+num1);
		System.out.println(" num2:"+num2);

		System.out.println(" result:"+result);
	}
		// create a method with satati 
		static void addition() {
			int num1=10,num2=20, result=num1+num2;
			System.out.println(" num1:"+num1);
			System.out.println(" num2:"+num2);

			System.out.println(" result:"+result);

			
		}
		
		
		
	}

/*
Compile time polymorphism:
	When a method gets to know its implementation at the time of compilation is know as CTP.
*/



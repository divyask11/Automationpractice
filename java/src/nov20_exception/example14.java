package nov20_exception;

public class example14 {

	public static void main(String[] args) {
System.out.println("start");

checkage(10);

System.out.println("end ");
	}
	
	// we create a method 
	
	static void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("sorry,u r not enligible");
		}else {
			System.out.println("welcome");
		}
	}
	

}

/**
throw: 
this will help programming to throw an exception explicitly based on his logic need
	this will use always inside the method body
	this will throw only one exeption at a time
*/

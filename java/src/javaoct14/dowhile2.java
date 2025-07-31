package javaoct14;

public class dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program Starts");
		int i=10;
		//if condition fails, while won't be executed
		while(i<1) {
			System.out.println("While loop executed and i is :"+i);
		}
		System.out.println("************do-while************");
		//even condition is failed, do-while will be executed at least once
		do {
			System.out.println("Do-While loop exected and i is: "+i);
		}while(i<1);
		System.out.println("Program Ends");
	
		
		
	}

}

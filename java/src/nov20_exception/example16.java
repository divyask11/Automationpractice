package nov20_exception;

public class example16 {

	public static void main(String[] args) throws divyaException{
		System.out.println("start");
	
		
		checkage(10);
		System.out.println("end ");

	}

	static void checkage(int age )throws divyaException{
		if (age<18) {
			throw new  divyaException(" sorry ");
			
		}else {
			System.out.println("welcome ");
		}
	}
	
	
}

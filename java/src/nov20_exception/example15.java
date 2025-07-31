package nov20_exception;
class divyaException extends Exception{
	divyaException(String msg){
		super(msg);
	}
}
public class example15 {

	public static void main(String[] args) {
System.out.println("program start");
try {
	checkage(10);
}
	catch(divyaException e) {
		e.printStackTrace();
	}


		
		
		System.out.println("program end ");
	}
	
	
	
	

	
	static void checkage(int age ) throws divyaException {
		if (age<18) {
			throw new divyaException("sorry u not enligiable ");
		}else{
		System.out.println("welcome uo are enligiable ");	
		}
	}
	
}


/**
throws: 
this will help to define checked exception type coming from method body
*/

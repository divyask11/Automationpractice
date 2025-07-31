package nov20_exception;

   public class example12 {

	public static void main(String[] args) {
    System.out.println("pragram start");
     int num1=10,num2=2,result;
         System.out.println("num1:"+num1);
         System.out.println("num2:"+num2);

// use try and catch statement to handle exception

try {
      result=num1/num2;//abnorma// this will inform JVM that its end of the program, so terminate the executionl statement, which will terminate the program execution
        System.out.println("result:"+result );
        
        //
        System.exit(0);// this will inform JVM that its end of the program, so terminate the execution
}catch   (ArithmeticException e ) {//when you are  sure about exception type coming from try block use 

	System.out.println("****exception handling *****");
		e.printStackTrace();// print all exception
}finally {
	System.out.println("a am fimally block");
}
	System.out.println("program end ");
	

	}
   }
   
   /**
   finally block:
   	will be execute even 
   		exception handled
   		or not handled
   */
   /**
   finally block:
   	will be execute even 
   		exception handled
   		or not handled
   		or no exception occurred in try block
   		
   finally block won't be executed in
   	if JVM finds System.exit(0); statement before finally block
   	if exception occurred in finally block
   	if current thread is dead
   */
   
  
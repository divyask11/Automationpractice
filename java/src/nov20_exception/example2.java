package nov20_exception;

   public class example2 {

	public static void main(String[] args) {
    System.out.println("pragram start");
     int num1=10,num2=0,result;
         System.out.println("num1:"+num1);
         System.out.println("num2:"+num2);

// use try and catch statement to handle exception

try {
      result=num1/num2;//abnormal statement, which will terminate the program execution
        System.out.println("result:"+result );
}catch   (Throwable e ) {//when you are not sure about exception type coming from try block use trowable

	System.out.println("****exception handling *****");
	
	System.out.println("print msg:"+e.getMessage());// by zero
	
	System.out.println("exceptional class with msg:"+e);//java.lang.ArithmeticException: / by zero
	
	e.printStackTrace();// print all exception
}
	System.out.println("program end ");
	

	}
   }
   
   
   
   
   /**
   complete exception message:
   		Exception in thread "main" java.lang.ArithmeticException: / by zero
   			at day17.exceptionhandling.Example1.main(Example1.java:10)

   only message:
   	/ by zero

   Exception type along with message
   	java.lang.ArithmeticException: / by zero


   */

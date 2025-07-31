package nov20_exception;

   public class example3 {

	public static void main(String[] args) {
    System.out.println("pragram start");
     int num1=10,num2=0,result;
         System.out.println("num1:"+num1);
         System.out.println("num2:"+num2);

// use try and catch statement to handle exception

try {
      result=num1/num2;//abnormal statement, which will terminate the program execution
        System.out.println("result:"+result );
}catch   (ArithmeticException e ) {//when you are  sure about exception type coming from try block use 

	System.out.println("****exception handling *****");
		e.printStackTrace();// print all exception
}
	System.out.println("program end ");
	

	}
   }
   
   
   
   
  
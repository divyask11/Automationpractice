package nov20_exception;

   public class example5 {

	public static void main(String[] args) {
    System.out.println("pragram start");
     int num1=10,num2=0,result;
         System.out.println("num1:"+num1);
         System.out.println("num2:"+num2);

// use try and catch statement to handle exception

try {
      result=num1/num2;//abnormal statement, which will terminate the program execution
        System.out.println("result:"+result );
        
        // we use multiplr catch block
        
}catch   (ArrayIndexOutOfBoundsException e ) {// wrong exceptions catch box cant handle program will be terminatede 
         System.out.println("****exception handling *****");
		e.printStackTrace();// print all exception

}catch   (NumberFormatException e ) {// wrong exceptions catch box cant handle program will be terminatede 
        System.out.println("****exception handling *****");
		e.printStackTrace();// print all exception

}catch   (ArithmeticException e ) {// wrong exceptions catch box cant handle program will be terminatede 
        System.out.println("****exception handling *****");
		e.printStackTrace();// print all exception
}
	System.out.println("program end ");
	

	}
   }
   
   
   /**
   in this case program will be terminated as catch block will not able to handle exception coming from try block
   */
   
   
  
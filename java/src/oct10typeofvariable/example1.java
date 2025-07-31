package oct10typeofvariable;

public class example1 {
// access static global variable
	
	 int num1=10;
	 int num2=20;
	 double result;
	 
	
	    public static void main(String[] args) {
		
	    // first we create a object to access the non static global variable
	    	// class name referance variable =new class name()
	    	// sysntax= example1 ref1= new example1()
	    	
	    	example1 ref1= new example1();
	    	System.out.println("NSGV="+ref1.num1);
	    	System.out.println("NSGV="+ref1.num2);  	
	    	System.out.println("NSGV="+ref1.result);
	    	 
	    	
	  
	    	
	    	
	    }

}










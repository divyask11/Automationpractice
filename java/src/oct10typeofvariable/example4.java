package oct10typeofvariable;

public class example4 {
// access static global variable
	
	 int num1=10;
	 int num2=100;
	static double result;
	 
	
	    public static void main(String[] args) {
		
	    // first we create a object to access the non static global variable
	    	// class name referance variable =new class name()
	    	// sysntax= example1 ref1= new example1()
	    	
	    	example4 ref1= new example4();
	    	System.out.println("NSGV="+ref1.num1);
	    	System.out.println("NSGV="+ref1.num2);  	
	    	System.out.println("NSGV="+result);
	    	
	    	
	    	System.out.println("**************************************");
	    	
	    	ref1.num1=50;
	    	ref1.num2=40;
	    	example4.result=ref1.num1-ref1.num2;
	    	System.out.println("NSGV="+ref1.num1);
	    	System.out.println("NSGV="+ref1.num2);  	
	    	System.out.println("NSGV="+result);
	    	
	    	System.out.println("****************************************");
	    	example4 ref2= new example4();
	    	example4.result=ref1.num2-ref1.num1;
	    	System.out.println("NSGV="+ref2.num1);
	    	System.out.println("NSGV="+ref2.num2);  	
	    	System.out.println("NSGV="+example4.result);
	    	
	    	
	    	
	    	 
	    	
	  
	    	
	    	
	    }

}




/*
b. non-static global variable
* Any global variable declared without static keyword known as non-static global variable
* these variables are also know as instance variable because they will be loaded into the
  memory at time time of execution.
* We can access them from anywhere using following ways
	- directly from any non-static method
	- Standard: always use instance/object of class
		#Instance/Object: Its an real world entity that has its own behavior and state.
		
		 classname referenceVariable;//object declaration
		 referenaceVariable=new classname();//object initialization
		 	//or					 
		classname referenceVariable=new classname();
		
		referenaceVaraible.nonstaticVariable;
		
* for these variable in java we will have multiple memory allocation based on object creation
* these variables will get default value based on datatype in case we don;t initialize them
	byte,short,int,long : 0
	float,double: 0.0
	char: (Single character space)
	boolean: false	
*/




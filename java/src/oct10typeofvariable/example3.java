package oct10typeofvariable;

public class example3 {
// access static global variable
	
	 int num1=10;
	 int num2=20;
	 double num3;
	 
	
	    public static void main(String[] args) {
		
	    // first we create a object to access the non static global variable
	    	// class name referance variable =new class name()
	    	// sysntax= example1 ref1= new example1()
	    	
	    	example3 ref1= new example3();
	    	System.out.println("NSGV="+ref1.num1);
	    	System.out.println("NSGV="+ref1.num2);  	
	    	System.out.println("NSGV="+ref1.num3);
	    	
	    	ref1.num1=50;
	    	ref1.num2=40;
	    	ref1.num3=80;
	    	System.out.println("NSGV="+ref1.num1);
	    	System.out.println("NSGV="+ref1.num2);  	
	    	System.out.println("NSGV="+ref1.num3);
	    	
	    	
	    	System.out.println("*****************************************");
	    	example3 ref2= new example3();
	    	System.out.println("NSGV2="+ref2.num1);
	    	System.out.println("NSGV22="+ref2.num2);  	
	    	System.out.println("NSGV2="+ref2.num3);

	    	 
	    	
	  
	    	
	    	
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




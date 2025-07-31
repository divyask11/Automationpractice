package oct22thistatement;
// we can use this() to called constructor for creating only one obje
public class example5 {

	example5(){
		this(62);
		System.out.println(" i am zero para constructor");
	}
	
	example5(int num){
	this(52.6);
		System.out.println(" i am int para constructor");
	}

	example5(double num){
		
		System.out.println(" i am double para constructor");
	}
	
	
	 
	// we initialize this keyword as 
		/*this double
		 * this 
		 * these int
		 */
	
	
	public static void main(String[] args) {
		// for calling this we create a clss 
		example5 ref=new example5();
		

	}

}

//to called constructor we can create a new obj for all const

/*
this()
	its also know as current class instance
	used only inside constructor body
	it should be the 1st statement inside the constructor body
	its used to call another constructor of current class based on the parameter
*/


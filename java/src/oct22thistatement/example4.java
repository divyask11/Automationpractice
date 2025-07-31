package oct22thistatement;
// we can use this() to called constructor for creating only one obje
public class example4 {

	example4(){
		
		System.out.println(" i am zero para constructor");
	}
	
	example4(int num){
	this(12.4);
		System.out.println(" i am int para constructor");
	}

	example4(double num){
		this();
		System.out.println(" i am double para constructor");
	}
	
	
	 
	// we initialize this keyword as 
		/*this zero
		 * this double
		 * these int
		 */
	
	
	public static void main(String[] args) {
		// for calling this we create a clss 
		example4 ref=new example4(12);
		

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


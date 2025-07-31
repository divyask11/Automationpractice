package oct22thistatement;
// we can use this() to called constructor for creating only one obje
public class example3 {

	example3(){
		this(23.6);
		System.out.println(" i am zero para constructor");
	}
	
	example3(int num){
	
		System.out.println(" i am int para constructor");
	}

	example3(double num){
		this(11);
		System.out.println(" i am double para constructor");
	}
	
	// in these we want to output we can initialize them to opposite 
	// like we want to outpit like
	/*int
	 * double
	 * zero
	 */
	// we initialize this keyword as 
		/*this zero
		 * this double
		 * these int
		 */
	
	
	public static void main(String[] args) {
		// for calling this we create a clss 
		example3 ref=new example3();
		

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


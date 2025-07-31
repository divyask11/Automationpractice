package oct22thistatement;

public class example1 {

	example1(){
		System.out.println(" i am zero para constructor");
	}
	
	example1(int num){
		System.out.println(" i am int para constructor");
	}
	
	example1(double num){
		System.out.println(" i am zero para constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		// for calling this we create a clss 
		example1 ref=new example1();
		example1 ref2=new example1(42);
		example1 ref3=new example1(62.7);

	}

}

//to called constructor we can create a new obj for all const




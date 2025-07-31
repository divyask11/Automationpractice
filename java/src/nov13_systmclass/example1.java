package nov13_systmclass;
class demo{
	void calling() {
		System.out.println("a am calling ");
	}
}



public class example1 {

	void display() {
		System.out.println(" am display example class ");
	}
	
	static demo d2=new demo();
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create ref for example1
		
		example1 ref=new example1();
		ref.display();
		
		demo d1=new demo();
		d1.calling();
		
		example1.d2.calling();
		//classname.staticreferenceVariableOfDemo.nonstaticMethodOfDemoClass
		System.out.println("Program Ends");
		//classname.staticReferenceVariableOfPrintStrem.nonstaticMethodOfPrintStreamclass
				
		
		
		System.err.println("a am error");
	}

}

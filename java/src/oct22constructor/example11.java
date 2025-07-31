package oct22constructor;

public class example11 {
       // we can use two variable /parameter like overloading method 
	
	 int num=123;
	 
	 // create method 
	 void main() {
		 System.out.println("NSGV="+num);
	 }
	 void main(int num) {
		 System.out.println("local variable="+num);
		 example11 ref2 = new example11();
			System.out.println("print value="+ref2.num);
	 }
	
	 
	 
	 
	 
		public static void main(String[] args) {
		System.out.println("Program starts");
		
		example11 ref = new example11();
				ref.main();
			
			example11 ref2 = new example11();
		ref2.main(12);
		//0
		
				System.out.println("Program ends");
	}
}



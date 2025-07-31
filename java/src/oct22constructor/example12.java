package oct22constructor;

public class example12 {
       // we can use two variable /parameter like overloading method 
	
	int num=123;
	void calling() {
		System.out.println("NSGV Number is: "+num);
	}
	void calling(int num) {
		System.out.println("Local Number is: "+num);
	example12 r1=new example12();	//	System.out.println("NSGV Number is: "+r1.num);
			
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		example11 ref=new example11();
		System.out.println("ref value: "+ref);
		ref.main();
		ref.main(25);
		System.out.println("Program ends");
	}

	}




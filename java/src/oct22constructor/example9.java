package oct22constructor;

public class example9 {
       // we can use two variable /parameter like overloading method 
	//create a method 
	int num=123;
	 void calling() {
		 System.out.println("NSGV IS="+num);
	 }
	
	 void calling(int num ) {
		 System.out.println("NSGV IS="+num);
		 example9 ref2=new example9();
		 System.out.println("NSGV is ="+ref2.num);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		example9 ref1=new example9();
		ref1.calling();
	
		
		ref1.calling(35);
	}

}

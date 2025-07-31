package constructor2;

public class example4 {
//user define construuctor  constructor by using one and more constructor 
	//constructor should have class name
	example4(){                                                  //syntax of constructoe 
		 System.out.println("its is a zero param constructor "); //zero param means no arg
	 }
	
	
	 example4(int num){                                                  //syntax of constructoe 
		 System.out.println("its is a param constructor "); //zero param means no arg
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
System.out.println("program start");
example4 ref=new example4();
example4 ref2=new example4(76);   // to initlize constructor we can use ref variable 
System.out.println("program end ");
	}

}

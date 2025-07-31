package constructor2;

public class example5 {
//user define construuctor  constructor
	//constructor should have class name
	 example5(int num){                                                  //syntax of constructoe 
		 System.out.println("its is a zero param constructor "); //zero param means no arg
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
System.out.println("program start");
example5 ref=new example5(76);   // to initlize constructor we can use ref variable 
System.out.println("program end ");
	}

}

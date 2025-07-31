package oct22constructor;

public class example4 {
// user define  constructor 
	// more the one parameter cintructor overloading  define constructor 
	example4(){
		System.out.println("i am zero conso=");
	}
	example4(int num ){
		System.out.println(+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start ");
		example4 ref=new example4(10);
		example4 ref1=new example4();
		System.out.println("program end ");
		
				
		
		
	}

}

package oct22finalstat;

public class blockstatement {
	blockstatement(){
		System.out.println(" i am zero param const");
		
	}
		
		
	public static void main(String[] args) {
// claleed constructor valye by using this state ment and we car create a block tocallded these
		

			// crete ref variable
		System.out.println("program start");
		blockstatement ref=new blockstatement();
		blockstatement ref2=new blockstatement();
		System.out.println("program end ");
	}
	
	// called  constructor value  by using this statment and we can  create a block to callded these

	static {
		System.out.println(" *****************a am static gholbal variable*********** ");
	}
	{
		System.out.println("################### a am non  gholbal variable##################### ");
	}
	
	
	

}

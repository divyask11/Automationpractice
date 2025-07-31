package oct22finalstat;

public class blockstatement2 {
	blockstatement2(){
		System.out.println(" i am zero param const");
		
	}
		
		
	public static void main(String[] args) {
// claleed constructor valye by using this state ment and we car create a block tocallded these
		

			// crete ref variable
		System.out.println("program start");
		blockstatement2 ref=new blockstatement2();
		blockstatement2 ref2=new blockstatement2();
		System.out.println("program end ");
	}
	
	// called  constructor value  by using this statment and we can  create a block to callded these

	static {
		System.out.println(" *****************a am static gholbal variable*********** ");
	}
	{
		System.out.println("################### a am non  gholbal variable##################### ");
	}
	static {
		System.out.println(" **********************a am static 2  gholbal variable ***************");
	}
	{
		System.out.println("###################### a am non  2 gholbal variable #####################");
	}
	
	

}

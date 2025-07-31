package oct22finalstat;

public class blockstatement4 {
	blockstatement4(){
		System.out.println(" i am zero param const");
		 empId=12;
		 
		 
		
	}
		
		
	public static void main(String[] args) {
// claleed constructor valye by using this state ment and we car create a block tocallded these
		

			// crete ref variable
		System.out.println("program start");
		
		System.out.println("sgv="+num);
		blockstatement4 ref=new blockstatement4();
		System.out.println("nsgv empid="+ref.empId);
		System.out.println("nsgv empid="+ref.salary);
		System.out.println("program end ");
	}
	
	// called  constructor value  by using this statment and we can  create a block to callded these

	static {
		System.out.println(" *****************a am static gholbal variable*********** ");
		num=2;
		
	}
	{
		System.out.println("################### a am non  gholbal variable##################### ");
		salary=123.323;
		
	
	
	}
	
	
	static  final int num;
	 final double salary;
	 final int empId;
	 
	

}

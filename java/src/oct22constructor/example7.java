package oct22constructor;

public class example7 {
       
	int age;
	//create contructor 
	example7(int num){
		System.out.println("i am zero param const");
		age= num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start ");
		
		example7 ref1=new example7(15);
		System.out.println("NSGV="+ref1.age);

		example7 ref2=new example7(95);
		System.out.println("NSGV="+ref2.age);
		example7 ref3=new example7(98);
		System.out.println("NSGV="+ref3.age);
		
		System.out.println("program end ");
		
				
		
		
	}

}

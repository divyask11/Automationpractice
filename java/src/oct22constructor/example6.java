package oct22constructor;

public class example6 {
       
	int age;
	//create contructor 
	example6(){
		System.out.println("i am zero param const");
		age= 25;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start ");
		
		example6 ref1=new example6();
		System.out.println("NSGV="+ref1.age);

		
		
		System.out.println("program end ");
		
				
		
		
	}

}

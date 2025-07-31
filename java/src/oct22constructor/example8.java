package oct22constructor;

public class example8 {
       // we can use two variable /parameter like overloading method 
	
	int age;
	double salary;
	
	//create contructor 
	example8(){
		System.out.println("i am zero param const");
		
	}
	example8(int num){
		System.out.println("i am zero param const");
		age= num;
	}
	example8(double num){
		System.out.println("i am zero param const");
		salary=num;
		
	}
	example8(int num, double num2){
		System.out.println("i am zero param const");
		age=num;
		salary=num;
		
	}
	// create a method 
	void display() {
		System.out.println("nsgv,age:"+age+" & salary:"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start ");
		
		example8 ref1=new example8();
         ref1.display();//display is method name 
         
		example8 ref2=new example8(95);
		ref2.display();
		
		example8 ref3=new example8(98.30);
		ref3.display();
		
		example8 ref4=new example8(30,30.5);
		ref4.display();
		
		
		System.out.println("program end ");
		
				
		
		
	}

}

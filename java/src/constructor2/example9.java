package constructor2;

public class example9 {
// param  construuctor  constructor for non static 
	//constructor should have class name
	
	 //create const  param
	int age;
	 example9(int num){
		 System.out.println("its non param const");
		age=num;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
System.out.println("program start");
example9 ref=new example9(14);
System.out.println("NSGV:"+ref.age);//we can store the value in param constru one then more with create ref variable 


example9 ref2=new example9(34);
System.out.println("NSGV:"+ref2.age);
System.out.println("program end ");
	}

}

package constructor2;

public class example8 {
//non param  construuctor  constructor for non static 
	//constructor should have class name
	 int age;
	 //create const non param
	 example8(){
		 System.out.println("its non param const");
		 age=25;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
System.out.println("program start");
example8 ref=new example8(); 
// to initlize constructor we can use ref variable it give 0 value 

System.out.println("NSGV:"+ref.age);//to declare variable store value non param const is 25
System.out.println("program end ");
	}

}

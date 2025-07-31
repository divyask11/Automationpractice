package constructor2;

public class example6 {
//default construuctor  constructor for non static 
	//constructor should have class name
	 int age;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
System.out.println("program start");
example6 ref=new example6(); 
// to initlize constructor we can use ref variable it give 0 value 

System.out.println("NSGV:"+ref.age);//to declare variable 
System.out.println("program end ");
	}

}

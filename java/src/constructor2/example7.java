package constructor2;

public class example7 {
//default construuctor  constructor for non static 
	//constructor should have class name
	 int age=26    ;                  //if we give the value 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		
System.out.println("program start");
example7 ref=new example7(); 
// to initlize constructor we can use ref variable it give 0 value 

System.out.println("NSGV:"+ref.age);//to declare variable 
System.out.println("program end ");
	}

}

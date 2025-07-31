package oct30inheritance;
//parent class
class fourwheeler{
	// default constructor 
	public void wheels() {
		System.out.println(" am  4 wheels ");
	}
}
class  maruti extends fourwheeler{
	// default constructor 
	public void compani() {
		System.out.println(" am  maruti company ");
	}
}
class car   extends maruti{
	// default constructor 
	public void type() {
		System.out.println(" am  type of  wheels ");
	}
}
public class example8 {	

	public static void main(String[] args) {
		
		
		System.out.println("**********************************");
		car c1=new car();
		c1.type();
		c1.compani();
		c1.wheels();
		
		
		
		
		
	}

}
/**
add debug point in the required line
f6---> next line or you want to execute current line
f5---> if you want to go inside the called method
f8---> continue

*/

/*
Only non-static member are participating in inheritance


to achieve inheritance we need constructor chaining
	- when child class constructor calls parent class constructor and parent class constructor calls its parent class constructor
	  that is known as constructor chaining
	- this is possible by using super()
	- super()
		- its known as parent class instance
		- will help you to call immediate parent class constructor based on the parameter
	
Parent class-> super class/base class
child class -> subclass/inherited class

*/

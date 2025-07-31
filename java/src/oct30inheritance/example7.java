package oct30inheritance;
//parent class

class company101{
	

void display() {
	System.out.println(" a am company 101");
            }
	    }

class employee extends company101{
	//override
	void display() {
		System.out.println(" a am emp");
			
		}
	void callme() {
		display(); // employee and 
		super.display();// compny101 
		System.out.println(" a am emp class cal me ()....");
	}
}




public class example7 {	

	public static void main(String[] args) {
		
		
		System.out.println("**********************************");
		employee e1=new employee();
		e1.display();
		e1.callme();
		
		
		System.out.println("************************");
		company101 fc2=new company101();
		fc2.display();
		
		System.out.println("*************************");
		company101 e2=new employee();
		e2.display();
		
		
	}

}

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

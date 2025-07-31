package oct30inheritance;
//parent class
class fruit{
	int fruitage;
	fruit (){
		System.out.println("a am fruit cons ");
		fruitage=1;
	}
	public 	void test() {
			System.out.println(" am test sweet ");
		}
	}

// child class of 
class mango extends fruit{
	int furitage;
	mango(){
		System.out.println(" a am mango  cons ");
		fruitage=5;
	}
//	@override
	public void test() {
		System.out.println("test sweet ");
	}
	public void shape() {
		System.out.println(" a am shape  circle ");
}
}






public class example6 {	

	public static void main(String[] args) {
		////super(); compile will right by default super() due to inheritan
		System.out.println("*****************************");
		
		mango m1=new mango();
		m1.shape();
		m1.test();
		System.out.println("manho age is :"+m1.fruitage);
		
		System.out.println("**********************************");
		fruit f1= new fruit();
		f1.test();
		System.out.println("fruit age is :"+f1.fruitage);
		
		
		System.out.println("************************");
		fruit f2=new mango();
		f2.test();
		System.out.println("age:"+f2.fruitage);
		
		
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

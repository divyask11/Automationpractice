package oct30inheritance;

class Grandfather1{
	// by using constructor 
	Grandfather1(){
		System.out.println(" am zero grandfather cons ");
	}
	void 	myhome() {
		System.out.println(" its may home ");
	}
}
class father1 extends Grandfather1{
	// by using constructor 
	father1(){
		System.out.println(" am zero param father cons ");
	}
	void 	mycar() {
		System.out.println(" its may car ");
	}
}
class child1 extends father1{
	// by using constructor 
	child1(){
		System.out.println(" am zero param child  cons ");
	}
	void 	mybike() {
		System.out.println(" its may home ");
	}
}

public class example3 {	

	public static void main(String[] args) {
		////super(); compile will right by default super() due to inheritan
		// we can crete an obj to name of child bcoz it can acess the all property
		
		child1 c1=new child1();
		c1.mybike();
		c1.mycar();
		c1.myhome();
		System.out.println("*****father***************");
		father1 c2=new father1();
		c2.mycar();
		c2.myhome();
		// c2.mybike(); it cant acess childs property
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

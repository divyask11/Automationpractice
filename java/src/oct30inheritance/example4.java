package oct30inheritance;
class grandfather2{
	grandfather2(){
		System.out.println(" i am zero param const for grandfather ");
	}
		void myhome() {
			System.out.println("my home ");
		
		
	}
}
class father2 extends grandfather2{
	father2(int num ){
		System.out.println(" i am zero param const for father ");
	}
		void mycar() {
			System.out.println("my home ");
		
		
	}
}
class child3 extends father2{
	child3(){
	super(34);// becoz father is param class 
	//super(25); //explicitly super() should be written as Father class doesn;t have default/zero param cons
		System.out.println(" i am zero param const for grandfather ");
	}
		void mybike () {
			System.out.println("my bike  ");
		
		
	}
}
public class example4 {	

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

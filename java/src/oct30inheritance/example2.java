package oct30inheritance;

class grandfather{
	// default constructor 
	void myhome () {
		System.out.println(" i am grandfather property");
	}
}
class father extends grandfather{
	void mycar () {
		System.out.println(" i am father property");
	}
}
class child extends father{
	void mybike () {
		System.out.println(" i am child property");
	}
}





public class example2 {	

	public static void main(String[] args) {
		
		// we can crete an obj to name of child bcoz it can acess the all property
		
		child c1=new child();
		c1.mybike();
		c1.mycar();
		c1.myhome();
		System.out.println("*****father***************");
		father c2=new father();
		c2.mycar();
		c2.myhome();
		// c2.mybike(); it cant acess childs property
	}

}

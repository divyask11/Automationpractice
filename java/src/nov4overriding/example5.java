package nov4overriding;
// parent class 
class parent{
	void show() {
		System.out.println(" prent show ");
	}
}
// child class 
class child extends parent{
	// override @Override
	@Override
	public void show() {
		System.out.println(" child show");
	}
}

// driver clas s
public class example5 {

	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then' Parent's show' is called

		parent p1= new parent();
		p1.show();     // parent show 
		
System.out.println("*****************************************");


//If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.

   parent p2 = new child();
   p2.show();//child show 

	}

}

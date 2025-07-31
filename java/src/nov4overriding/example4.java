package nov4overriding;
 class ABC{
	 void method() {
		 System.out.println(" a am abs method ");
	 }
 }
 
 class override extends ABC {
	 public void method() {
		 super.method();
		 System.out.println(" am override method ");
	 }
	 // we can create a suoer key to acess the variable of the abc 

 }
public class example4 {

	public static void main(String[] args) {
		// if we can call override variable we get both value coz of super keyword 
      override o1=new override();
      o1.method();
	}

}

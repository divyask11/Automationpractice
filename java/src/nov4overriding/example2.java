package nov4overriding;
 class animal{
	 // create constructor 
	 animal(){
		  }
	public  void walk() {
		 System.out.println(" animal can walk");
	 }
 }
 
 class dog extends animal {
	 dog(){
		 super();
	 }
	public  void walk() {
		 System.out.println(" dog can walk ");
		 
	 }
	 
	public  void bark() {
		 System.out.println(" dog can bark");
	 }
 }
 
 
 
public class example2 {

	public static void main(String[] args) {
		animal a1= new animal();
		a1.walk();
		System.out.println("**********************************");

		dog d1= new dog();
		d1.walk();
		d1.bark();
		System.out.println("**************************************");
		
		animal a3= new dog();//animal onj but dog referance 
		a3.walk();
		//a3.bark();//a3compile time error since b's reference type Animal doesn't
	}

}

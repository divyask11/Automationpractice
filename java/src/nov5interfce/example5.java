package nov5interfce;
 interface printable{
	 void print();
 }
 
 interface showable2 extends printable{
	 void show();//---> inherited method/virtual method
 }
 

	 class Interface5 implements showable2 {
		 public void show() {
			 System.out.println(" hellow");
		 }
		 
		 public void print() {
			 System.out.println("welcome");
		 }
 }
 
 
 
 
public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface5 	a1 = new Interface5();
		a1.show();
		a1.print();
		System.out.println("*****************");
		
		printable b1= new Interface5();
		b1.print();
	}

}

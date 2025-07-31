package nov4overriding;
class parent3{
	// final method cant be override 
	final void show() {
		System.out.println(" a am parent show ");
	}
	
}

class child3 extends parent3{
	 void show() {
		 System.out.println(" a am child show ");
	 }
}
public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

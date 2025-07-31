package nov5interfce;
// IF WE HAVE 2 interface

interface drawable {
	
	void draw();
}

interface showable{
	void show();
}

// now create a class 
class print  implements drawable,showable {
	public void draw() {
		int age=30;
		System.out.println(" a am draw ");
	}
	public void show() {
		System.out.println(" a am show ");
	}
}




public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print p1 = new print();
		p1.show();
		p1.draw();
		System.out.println("drawable age:"+drawable.age);
		
		System.out.println("print e age:"+print.age);

	}
	
	
	

}

package nov4abstractclass;  // heirachy inheritance 
abstract class shape{
	abstract void draw();	
}

 class rectangle extends shape{
	protected void draw() {
		System.out.println(" a am rectangle draw");
		
	}
}
 class square   extends shape{
	@Override
	public void draw() {
		System.out.println(" a am circle  draw");
		
	}
}



//In real scenario, method is called by programmer or use
public class example2 {

	public static void main(String[] args) {
	shape s =new square();
	s.draw();
	
	shape s1= new rectangle();
	s1.draw();
		 

	}

}

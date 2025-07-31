package nov4overriding;
class sample1{
	public void addition() {
		System.out.println("addition of two number");
	}
	
}
class sample2 extends sample1{
	//@overring
	// default constructor with default super()
	
	public void addition() {
		System.out.println("addition of three number");
	}
	
	public void multiplication() {
		System.out.println("multiplication  of three number");
	}
	
}


public class example1 {

	public static void main(String[] args) {
		sample1 s1= new sample1();
		s1.addition();
		System.out.println("**********************************");
		
		sample2 s2= new sample2();
		s2.multiplication();
		s2.addition();

		System.out.println("_____________________________________");
		sample1 s3 = new sample2();
		s3.addition();
	}

}

package oct30inheritance;

	

	

class sample1 {
	int age=18;
	void calling(){
		System.out.println(" a am sample1 ");
		
	}
}
class sample2 {
	int empId =1123;
	void calling(){
		System.out.println(" a am sample2 ");
		
	}
}

public class example1 {
		int salary =1622222;
		
	

	
	public static void main(String[] args) {
		// we can create a object to acess them 
		// in this we can create a seperate onje to acees the variable 
		
		sample1 ref=new sample1() ;
		System.out.println("calling sam 1="+ref.age);
		ref.calling();
		sample2 ref2=new sample2() ;
		System.out.println("calling sam 2="+ref2.empId);
		ref.calling();

		example1 ref3=new example1() ;
		System.out.println("calling sam 3="+ref3.salary);
		ref.calling();


	}

}

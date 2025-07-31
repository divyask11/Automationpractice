package nov15stringbuffer_builder;
// clas and data member declare as final
public class immutable2 {

	
	public static void main(String[] args) {
		immutable t1=new immutable(101,"divya");
		// use get method
		System.out.println(t1.getAge());
		System.out.println(t1.getName());
//	t1.age=201;//compile time error as age is declared as final

		
		immutable t2=new immutable(102,"khatodedivya");

		System.out.println(t2.getAge());
System.out.println(t2.getName());
	}
	
	

	}
	
	
	
	
	



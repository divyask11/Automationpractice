package nov11pridefineclass;

public class example2 {
int age=10;

	public static void main(String[] args) {

		example2 ref=new example2();
	//	System.out.println("referance variable:"+ref);// called automatically implicit object 
		System.out.println("to string method for :"+ref.toString());;//day15.predefinedclasses.Example1@23hguy87213
		System.out.println("referance add in integer:"+ref.hashCode());//it give int value 
		
		// crate second ref variable 
		System.out.println("*******");
		example2 ref2=new example2();
		System.out.println("to string method:"+ref2.toString());
		System.out.println("referance variable:"+ref2.hashCode());
		System.out.println("ref and ref2 comparision :"+ref.equals(ref2));
		System.out.println("***********");
		
		
		example2 ref3=ref2;
		System.out.println("to string method:"+ref3.toString());
		System.out.println("referance variable:"+ref3.hashCode());
		System.out.println("ref and ref2 comparision :"+ref3.equals(ref2));
		
	}
	public boolean equals() {
		return true;
	}
	
	
	
	public int hashCode() {
		return 123;
	}
	
	
	public String toString() {
		return "banglore";
	}

}

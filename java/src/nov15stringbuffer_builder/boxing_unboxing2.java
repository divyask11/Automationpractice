package nov15stringbuffer_builder;

public class boxing_unboxing2 {

	public static void main(String[] args) {
		System.out.println("start");
		double salary=12.2;
		char ch='a';
		boolean result=true;
		
		
		//boxing operation
	
		
		Double onj1=salary;
		Character onj2=(Character)ch;
		Boolean onj3=(Boolean)result;
		
		System.out.println("onject1:"+onj1);
		System.out.println("object2:"+onj2);
		System.out.println("onject3:"+onj3);
		
		
		// unboxing 
		double x=onj1.doubleValue();
		char y=onj2.charValue();
		boolean z =onj3.booleanValue();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	
	
	
}

package nov15stringbuffer_builder;

public class boxing_unboxing {

	public static void main(String[] args) {
		System.out.println("start");
		int age =19;
		
		//boxing operation
		
		Integer onj1=age;//implicit operation  boxing 
		Integer obj2=(Integer)age;//explicit boxing 
		System.out.println("age:"+age);
		System.out.println("onj1:"+onj1);
		System.out.println("obj2:"+obj2);
		System.out.println("comparing age and onj :"+(age==obj2));
		
		
		// unboxing 
		int x=obj2.intValue();
		System.out.println("x:"+x);
	}
	
	
	
	
}

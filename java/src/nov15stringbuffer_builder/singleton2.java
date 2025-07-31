package nov15stringbuffer_builder;

public class singleton2 {

		public static void main(String[] args) {
			
		//	singleton s1=new singleton();
			// instance can't be created as its constructor is declared as private
		singleton ref2	= singleton.getinstance();

			System.out.println("age with s1 ref:"+ref2.age);
			ref2.calling();
			ref2.age=27;
			System.out.println("update age :"+ref2.age);
		
			singleton ref3	= singleton.getinstance();
System.out.println("ref3 updated age is :"+ref3.age);
		}




}

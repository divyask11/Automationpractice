package nov15stringbuffer_builder;

public class singleton {

		/*
		 * Create class constructor as private
		 * Create static private instance of current class
		 * Create static method which should returns object of current class
		 */

		
		private singleton() {
			System.out.println("i am zero param cons ");
		}
			static private singleton ref=new singleton() ;
				
			public static singleton getinstance() {
				return ref;
			
		
			}
			int age;
			void calling() {
				System.out.println(" i am calling from singleton class ");
			}

}

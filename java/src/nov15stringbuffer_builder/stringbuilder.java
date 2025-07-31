package nov15stringbuffer_builder;

public class stringbuilder {

	public static void main(String[] args) {
		/**
		 * it is same as string buffer u can acees all method that can be acees in buffer string 
		 * Mutable
		 * not a thread safe ---> multi threading ---> fast
		 * object will be created only by using new keyword
		 * growable
		 */
		
		StringBuilder s1=new StringBuilder("HELLO ");
		s1.append("java");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
		
		
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		
		// now we are compare these 2 string valu and add basis
		
		System.out.println("s1 n s2 compare with addres:"+sb1.equals(sb2));
		// address bases comp
		
		System.out.println("comp as s1 n s2 as add also :"+(sb1==sb2));
		// add base comp
		// in these we dont have to comp value bases comparision
		//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
				//first convert StringBuffer/StringBuilder to String class using toString()
				// dn use equals() of string class
		
		System.out.println("**************");
		
		System.out.println("s1 and s2 comp with value :"+(sb1.toString().equals(sb2.toString())));
		// it can give you value comparision 
		
		
		
	}

}

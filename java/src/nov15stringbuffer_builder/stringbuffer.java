package nov15stringbuffer_builder;

public class stringbuffer {

	public static void main(String[] args) {
	
	//	String str=new String("hellow");
		//str.
		/**
		 * Mutable
		 * Thread safe---> no multi threading ---> slow
		 * Object created only using new keyword
		 * size is growable
		 */
		
		// createing string buffer class 
		StringBuffer sb=new StringBuffer("hellow");
		System.out.println("original value :"+sb);
		
		sb.append("java");
		System.out.println(sb);// original string change and add as hellow java
		
		
		sb.insert(5,"pune");
		System.out.println(sb);////HelloPune Java 
		
		sb.replace(1, 3, "aaa");
		System.out.println(sb);
		
		sb.delete(1,4 );
		System.out.println(sb);
		
		
		StringBuffer sb1 =new StringBuffer("banglore is known for it ");
System.out.println(sb1);
sb1.reverse();//it get reverse string
System.out.println(sb1);

System.out.println("*********************");
StringBuffer s2 =new StringBuffer();
System.out.println(s2.capacity());

s2.append("hellow");
System.out.println(s2);
System.out.println(s2.capacity());

s2.append("java is may fav language ");
System.out.println(s2);
System.out.println(s2.capacity());


s2.append("and it become automation ");
System.out.println(s2);
System.out.println(s2.capacity());

	}

}

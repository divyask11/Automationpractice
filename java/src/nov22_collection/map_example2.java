package nov22_collection;

import java.util.HashMap;
import java.util.Map;

public class map_example2 {

	public static void main(String[] args) {

		Map m1=new HashMap();
		m1.put("key"," admit1");
		m1.put("key2"," admit1");
		m1.put("null"," admit123");
		
		System.out.println("print value:"+m1);
		System.out.println("size:"+m1.size());
		
		Map m2=new HashMap();
		m2.put("A1", 123);
		m2.put("A2", 345);
		m2.put("A3", 789);
		m2.put("Key2", 252);
		
		System.out.println("print value:"+m2);
		System.out.println("size:"+m2.size());
		

		m1.putAll(m2);
		System.out.println("print value:"+m1);
		System.out.println("size:"+m1.size());
		
	}

}

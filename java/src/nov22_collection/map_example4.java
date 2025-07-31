package nov22_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class map_example4 {

	public static void main(String[] args) {

		TreeMap m1=new TreeMap();

		m1.put("key1","admin");
		m1.put("key5","admin2");
		m1.put("key3","admin321");
		m1.put("key0","admin31");


		System.out.println("print element :"+m1);
		System.out.println("size of element :"+m1.size());
		
		System.out.println("**********");
		m1.putIfAbsent("key4", "divya");
		System.out.println("size of element :"+m1.size());
				System.out.println("print element :"+m1);

		System.out.println("************");
		
		SortedMap m2=m1.subMap("key0", "key3");
		System.out.println("size of element :"+m2.size());
		System.out.println("print element :"+m2);
		
	}

}

package nov22_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map_example3 {

	public static void main(String[] args) {

		Map<String,String> m1=new HashMap<String,String>();

		m1.put("key1","admin");
		m1.put("key2","admin2");
		m1.put("key3","admin321");

		System.out.println("print element :"+m1);
		System.out.println("size of element :"+m1.size());
		
		System.out.println("**********");
		for(Entry pair:m1.entrySet()) {
			System.out.println("entry set:"+pair);
			System.out.println(pair.getKey()+":"+pair.getValue());
		}
	}

}

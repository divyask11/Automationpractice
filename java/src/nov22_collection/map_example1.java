package nov22_collection;

import java.util.HashMap;
import java.util.Map;

public class map_example1 {

	public static void main(String[] args) {

		Map m1=new HashMap();
		m1.put("key"," admit1");
		m1.put("key2"," admit1");
		m1.put("null"," admit123");
		
		System.out.println("print value:"+m1);
		System.out.println("size:"+m1.size());
		
		m1.put("key2", "manager");
		m1.put(123, "divya");
		m1.put("null", 678);
		
		System.out.println("map element:"+m1);
		System.out.println("size:"+m1.size());
		System.out.println("get key value:"+m1.get("key2"));
		System.out.println("key set of map:"+m1.keySet());
		System.out.println("value of map:"+m1.values());
	}

}


/**
 * to add any element in Map we need use put(key,value) , key and Value both should be Object
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from Map use values()
 * if you want get a particular Key value dn use get(key)
 */ 

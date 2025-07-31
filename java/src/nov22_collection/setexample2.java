package nov22_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setexample2 {

	public static void main(String[] args) {
		// creating set 
		
		// in set if you try to add duplicate element dn it will neglect 
		//that element instead of throwing an error
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ravi");
		list.add("divya");
		list.add("omkar");
		list.add("divya");// it don't get added in set

		list.add("kalyani");
		
		
		System.out.println("after invoking remove object method :"+list);
		System.out.println("set size :"+list.size());
		
		// Traversing elements in set method 
		
	 //  HashSet <String> set=new HashSet <String>();
	  // set.addAll(list);
	
		//we can also write this directly in constructor 

		HashSet <String> set=new HashSet <String>(list);
		System.out.println("initiate set element:"+set);
		
		set.add("niki");
		System.out.println("initiate set element:"+set);

		//print by interator 
		
	Iterator<String> str =	set.iterator();
	while(str.hasNext()) {
		System.out.println(str.next());
	}
	
	System.out.println("*********************");
	set.forEach(s1 -> {
		System.out.println(s1);
	}
	
			);
	System.out.println("********************");
	
	set.removeIf(s1 ->s1.contains("divya"));
	System.out.println("set element:"+set);
		
	}
			
	}



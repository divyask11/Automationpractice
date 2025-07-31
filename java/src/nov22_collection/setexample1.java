package nov22_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setexample1 {

	public static void main(String[] args) {
		// creating set 
		
		// in set if you try to add duplicate element dn it will neglect 
		//that element instead of throwing an error
		Set<String> set = new HashSet<String>();
		
		set.add("ravi");
		set.add("divya");
		set.add("omkar");
		set.add("divya");// it don't get added in set

		set.add("kalyani");
		
		System.out.println("after invoking remove object method :"+set);
		System.out.println("set size :"+set.size());
		
		// Traversing elements
		
	Iterator<String> itr =	set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("remove ravi from set:"+set.remove("ravi"));
	System.out.println("after invoking remove object method :"+set);

	// creating other set
	HashSet <String> set1=new HashSet<String>();
	set1.add("nikita");
	set1.add("kalyani");
	System.out.println("after invoking object method :"+set1);

	set.addAll(set1);
	System.out.println("after updating  object method :"+set);
	
	// Removing all the new elements from HashSet

	set.removeAll(set1);
	System.out.println("after remove set1   object method :"+set);

	
	// Removing elements on the basis of specified condition

	set.removeIf(str ->str.contains("divya"));
	System.out.println("afeter removeif method:"+set);
	
	// Removing all the elements available in the set
set.clear();
System.out.println("afeter clear these:"+set);
	

	}

}

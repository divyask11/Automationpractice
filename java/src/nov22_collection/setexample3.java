package nov22_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setexample3 {

	public static void main(String[] args) {
	// tree set 
		
		TreeSet <String>t1=new 	TreeSet <String>();
		/*
		 * add method overrided here, before adding any new element it will compare with existing elements 
		 * and store them in sorted order
		 */
		
		t1.add("divya");
		t1.add("niki");
		t1.add("kalyani");
		t1.add("om");
		System.out.println("print element:"+t1);
		
		// traversing the element 
		
		Iterator<String> str =t1.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		System.out.println("Traversing element through Iterator in descending order");

		
		Iterator i=t1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		TreeSet<Integer> set = new TreeSet<Integer>();
    set.add(10);
    set.add(26);
    set.add(5);
    set.add(20);
    System.out.println("print element of tree:"+set);
		System.out.println("first element of set:"+set.pollFirst());
		System.out.println("after these three set element are :"+set);
		
		System.out.println("set poll last:"+set.pollLast());
		System.out.println("afeter these the  element are:"+set);
		
		
		
		

		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		set2.add("e");
		
		System.out.println("initial set:"+set2);
		
		System.out.println("reverse set:"+set2.descendingSet());//high to low 
		System.out.println("head set:"+set2.headSet("c"));
		System.out.println("head set:"+set2.headSet("c", true));
		
		
		System.out.println("initial set:"+set2);

		System.out.println("subset :"+set2.subSet("a", "e"));
		System.out.println("subs set:"+set2.subSet("a", false, "d", true));
		
		
		System.out.println("tail set:"+set2.tailSet("c"));
		System.out.println("tail set :"+set2.tailSet("c", false));
	}
			
	}



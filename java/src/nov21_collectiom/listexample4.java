package nov21_collectiom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listexample4 {

	public static void main(String[] args) {
		System.out.println("program start");
		//create an array list
		//Generic concept in collection
		// when we have to store same object type 
		List<String> ref1=new ArrayList<String>();
		ref1.add("pune");
		ref1.add("123");
		ref1.add("apple");
		ref1.add(null);
		System.out.println("list element are:"+ref1);
		System.out.println("list element size:"+ref1.size());
		
		// create  one more list
		
		List<Boolean> ref2=new ArrayList<Boolean>();
		ref2.add(true);
		ref2.add(false);
		
		System.out.println("list2 element are:"+ref2);
		System.out.println("list2 element size:"+ref2.size());
		
	
		System.out.println("program end ");
		
	}

}

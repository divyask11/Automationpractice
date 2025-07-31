package nov21_collectiom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listexample3 {

	public static void main(String[] args) {
		System.out.println("program start");
		//create an array list
		ArrayList l1=new ArrayList();
		//or
		
		List ref1=new ArrayList();
		ref1.add("pune");
		ref1.add(123);
		ref1.add(true);
		ref1.add("apple");
		ref1.add(null);
		System.out.println("list element are:"+ref1);
		System.out.println("list element size:"+ref1.size());
		
		// create  one more list
		
		List ref2=new ArrayList();
		ref2.add("apple ");
		ref2.add("grapes");
		ref2.add("mango");
		System.out.println("list2 element are:"+ref2);
		System.out.println("list2 element size:"+ref2.size());
		
		 ref1.retainAll(ref2);
			System.out.println("list2 common element in 2 list:"+ref1);

			ref1.clear();
			System.out.println("after clearing:"+ref1);
		System.out.println("program end ");
		
	}

}

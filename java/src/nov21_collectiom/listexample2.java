package nov21_collectiom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listexample2 {

	public static void main(String[] args) {		
		System.out.println("program start");
		//create an array list
		ArrayList l1=new ArrayList();
		//or
		
		List ref=new ArrayList();
		ref.add("pune");
		ref.add(123);
		ref.add(true);
		ref.add("pune");
		ref.add(null);
		System.out.println("list element are:"+ref);
		System.out.println("list element size:"+ref.size());
		
		// create  one more list
		
		List ref2=new ArrayList();
		ref2.add("red");
		ref2.add("yellow");
		ref2.add("green");
		System.out.println("list2 element are:"+ref);
		System.out.println("list2 element size:"+ref.size());
		
		// adding al element of list1 in list 2
		ref2.addAll(ref);
		System.out.println("after adding ref1 in ref2:"+ref2);
		System.out.println("list2 element size:"+ref2.size());

		
		ref2.removeAll(ref);
		System.out.println("after remove ref1 in ref2:"+ref2);

		
		ref2.addAll(1, ref);
		System.out.println("after adding ref1 in ref2 in index no 3:"+ref2);
        ref2.removeAll(ref);
		System.out.println("after remove ref1 in ref2:"+ref2);

		
		System.out.println("program end ");
		
	}

}

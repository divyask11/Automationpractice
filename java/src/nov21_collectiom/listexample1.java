package nov21_collectiom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listexample1 {

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
		
		// adding one more elemnt of thise list
		ref.add("divya");
		System.out.println("list element are:"+ref);
		System.out.println("list element size:"+ref.size());
		
		ref.add(3, "sangamner");
		System.out.println("list element are:"+ref);
		System.out.println("list element size:"+ref.size());
		
		ref.set(2, false);
		System.out.println("list element are:"+ref);
		System.out.println("list element size:"+ref.size());
		
		
		System.out.println("element predent at index no 3:"+ref.get(3));
		
		
		System.out.println("****************interate one by one element ************");
		for(int i=0;i<ref.size();i++) {
			System.out.println(ref.get(i));
		}
		
		
		System.out.println("*****interate by foreach loop****");
		for(Object obj:ref) {
			System.out.println(obj);
			
		}
		
	
		System.out.println("****Iterate one by one element of list using Iterator Interface each****");
		Iterator itr =ref.iterator();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());// no such element exception eroor 

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//its only one tym only u can create second itr obj to print 
		System.out.println("***************Already used Iterator instance******************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("creste second itr object ");
		Iterator itr2 =ref.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("program end ");
		
	}

}
/*
Iterator:
	will help you to iterate one by one element of collection without using index
	its has some useful methods like
		hasNext(): boolean 
				   true: mean collection has next element
				   false: mean no next element in collection
		next():	it will give next element of collection,if there are not next element in collection dn it will return an exception
				like: NoSuchElementException
		remove(): it will help you to remove element from collection
	NOTE: Iterator interface instance can be used only once, for 2nd iteration you have to create new instance
*/
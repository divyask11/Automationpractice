package nov21_collectiom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class listexample5 {

	

		public static void main(String[] args) {
			System.out.println("Program Starts");
			List<Integer> list=new ArrayList<Integer>();
			list.add(25);
			list.add(15);
			list.add(30);
			list.add(25);
			list.add(15);
			list.add(25);
			System.out.println("List Elememts are: "+list);
			System.out.println("in List total occurance of 25 is: "+Collections.frequency(list, 25));
			Set<Integer> set=new HashSet<Integer>(list);
			System.out.println("Set elements are: "+set);
			Iterator<Integer> itr=set.iterator();
//			for(int i=0;i<set.size();i++) {
//				int num=itr.next();
//				System.out.println("in List total occurance of "+num+" is: "+Collections.frequency(list, num));
//			}
			
			while(itr.hasNext()) {
				int num=itr.next();
				System.out.println("in List total occurance of "+num+" is: "+Collections.frequency(list, num));
			}
			System.out.println("Program Ends");
		}
	
	

}

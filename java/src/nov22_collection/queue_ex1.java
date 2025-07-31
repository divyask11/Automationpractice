package nov22_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_ex1 {

	public static void main(String[] args) {
		// queue object creation
       Queue<Integer> que=new PriorityQueue<Integer>();
		// while adding element in Queue, it will always keep smallest
       //element on the top

       que.add(123);
       que.add(30);
       que.add(1);
       que.add(40);
       que.add(100);
       que.add(120);
       
       System.out.println("size:"+que.size());
       System.out.println("element:"+que);
     
       //element() returns top most element of the queue, if the queue if empty dn it
		 //will throw an exception by name 'NoSuchElementException'
       
       System.out.println("head elemen of que by using element():"+que.element());
    // peek() returns top most element of the queue, if the queue if empty dn it
    		// will return 'null' instead of throwing exception
       System.out.println("head elemen of que by using element():"+que.peek());

       
		System.out.println("iterating the queue elements using for-each loop:");
      
		for(Object obj:que) {
			System.out.println(obj);
		}
        
		
		
		System.out.println("iterating the queue elements using Iterator:");
         
		
		Iterator itr=que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
		
		System.out.println("element of queue:"+que);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will throw an exception by name 'NoSuchElementException
		System.out.println("remove element by using remove():"+que.remove());
		System.out.println("element of queue:"+que);
 
		
		// it will remove top most element of the Queue, if the queue is empty dn it
				// will return 'null' value
		System.out.println("remove element by using poll():"+que.poll());
		System.out.println("element of queue:"+que);
		
		//after remove 2 element
		
		Iterator itr2= 	que.iterator();
	 while(itr2.hasNext()) {
		 System.out.println(itr2.next());
	 }
		System.out.println("*******lambda expression ***********");
		// using method=foreach
		//syntax
		
		que.forEach(obj ->{
			System.out.println(obj);
		} );
	}
	}
	



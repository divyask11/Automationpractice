package nov22_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_ex2 {

	public static void main(String[] args) {
		// queue object creation
		
		
       Queue  que=new PriorityQueue();
		
       
       System.out.println("size:"+que.size());
       System.out.println("element:"+que);
       
       System.out.println("head element of queue peek ():"+que.peek());
       System.out.println("element:"+que);

    // peek() returns top most element of the queue, if the queue if empty dn it
    		// will return 'null' instead of throwing exception
       
       
       System.out.println("head element of que by element method :"+que.element());
    // element() returns top most element of the queue, if the queue if empty dn it
    		// will throw an exception by name 'NoSuchElementException'
	}
	}
	



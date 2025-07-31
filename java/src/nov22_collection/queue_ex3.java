package nov22_collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_ex3 {

	public static void main(String[] args) {
		// queue object creation
		
		
       Queue  que=new PriorityQueue();
		
       
       System.out.println("size:"+que.size());
       System.out.println("element:"+que);
       
       System.out.println("remove top element of queue poll():"+que.poll());
       System.out.println("element:"+que);

    // it will remove top most element of the Queue, if the queue is empty dn it
    		// will return 'null' value
       
       
       System.out.println("remove top element of que by remove  method :"+que.remove());
       System.out.println("element:"+que);

    // it will remove top most element of the Queue, if the queue is empty dn it
    		// will throw an exception by name 'NoSuchElementException'
	}
	}
	



package Collections;

import java.util.*;

public class QueueBasic {

	public static void main(String[] args) throws NullPointerException {

		// Queue interface maintains the first-in-first-out order.
		// It can be defined as an ordered list that is used to hold the
		// elements which are about to be processed

		// holds the elements or objects which are to be processed by their
		// priorities
		// PriorityQueue doesn't allow null values to be stored in the queue
		Queue<Integer> q1 = new PriorityQueue();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Priority Queue : ");
		System.out.println("Head : " + q1.peek());
		System.out.println("Head : " + q1.element());

		//q1.poll();
		Iterator<Integer> itr1 = q1.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");

		}
		q1.poll();

		// ArrayDeque class implements the Deque interface
		// It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
		// ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
		Queue<Integer> q2 = new ArrayDeque();
		q2.add(10);
		q2.add(20);
		q2.add(30);
		
		System.out.println();
		System.out.println("Dequeue Queue : ");
		Iterator<Integer> itr2 = q2.iterator();
		while(itr2.hasNext()){
			System.out.print(itr2.next()+ " ");
		}
		
		System.out.println();
		System.out.println("Dequeue Queue : ");
		for(Integer i : q2){
			System.out.print(i + " ");
		}
	}

}

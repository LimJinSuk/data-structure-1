package tree.test;

import tree.PriorityQueue;

public class PriorityQueueTest02 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(10);
		
		pq.offer( "A" );
		pq.peek();
		
		pq.offer( "abc" );
		pq.peek();
		
		pq.offer( "abdqwdwq" );
		pq.peek();

		pq.offer( "m2" );
		pq.peek();
		
		System.out.println( pq.poll() );
		pq.peek();
		
		System.out.println( pq.poll() );
		pq.peek();
		
		System.out.println( pq.poll() );
		pq.peek();
		
		
		System.out.println( pq.poll() );
		pq.peek();	
		

	}

}

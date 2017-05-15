package tree.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest01 {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<String>(10, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		pq.offer( "Hello World" );
		pq.offer( "We Are the World" );
		pq.offer( "World Wide Web" );
		pq.offer( "Heal the World " );
		
		while( pq.isEmpty() == false ) {
			System.out.println( pq.poll() );
		}
		
	}

}

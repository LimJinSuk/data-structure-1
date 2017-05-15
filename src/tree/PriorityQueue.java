package tree;

import java.util.Arrays;

public class PriorityQueue {
	private int size;
	private String[] arrayHeap;
	
	public PriorityQueue( int capacity ) {
		size = 0;
		resize( capacity );
	}
	

	private void resize( int capacity ) {
		String[] temp = new String[ capacity  ];
		
		for( int i = 0; i < size; i++ ) {
			temp[ i ] = arrayHeap[ i ];
		}
		
		arrayHeap = temp;
	}

	public void offer(String item) {
		
		if( arrayHeap.length <= size ) {
			resize( arrayHeap.length * 2 );
		}
		
		int index = size + 1;
		
		while( index != 1 ) {
			int parentIndex = index / 2;
			if( arrayHeap[ parentIndex ].length() - item.length() < 0  ) {
				break;
			}
			
			arrayHeap[ index ] = arrayHeap[ parentIndex ];
			index = parentIndex;
		}
		
		arrayHeap[ index ] = item;
		size++;
	}

	public String poll() {
		if( size == 0 ) {
			throw new IndexOutOfBoundsException( "Index: 0" +  ", size:" + size );
		}
		
		String data = arrayHeap[ 1 ];
		String lastItem = arrayHeap[ size ];
		
		int parentIndex = 1;
		
		while( true ) {
			int childIndex = 0;
			
			int leftChildIndex = parentIndex * 2;
			if( leftChildIndex > size) {
				break;
			}

			if( leftChildIndex == size) {
				childIndex = leftChildIndex;
			} else {
				int rightChildIndex = parentIndex * 2 + 1;
				if( arrayHeap[ leftChildIndex ].length() - arrayHeap[ rightChildIndex ].length() < 0  ) {
					childIndex = leftChildIndex;
				} else {
					childIndex = rightChildIndex;
				}
			}

			if( lastItem.length()  - arrayHeap[ childIndex ].length() < 0  ) {
				break;
			}
			
			arrayHeap[ parentIndex ] = arrayHeap[ childIndex ];
			parentIndex = childIndex;
		}
		
		arrayHeap[ parentIndex ] = lastItem;
		size--;
		
		return data;
	}


	public String peek() {
		System.out.println( Arrays.toString( arrayHeap ));
		if( size == 0 ) {
			return null;
		}
		return arrayHeap[ 1 ];
	}
}

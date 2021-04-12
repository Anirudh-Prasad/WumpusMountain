/*
 * This class was made to demonstrate a first-in-first-out list system. The Queue class stores
 * objects and primitives in an array-like formats, retrieves the first item in the list, and 
 * shifts the array to the left to place the next element in the array in a position to be
 * retrieved next.
 * 
 * Author: Anirudh Prasad
 * Date: 4/29/2019
 */
public class Queue {
	
	private Object[] data = new Object[100];
	private int numElements;
	
	/*
	 * Default constructor
	 */
	public Queue() {
		numElements = 0;
	}
	
	/*
	 * Copy constructor for the Queue class that copies another Queue's data without creating 
	 * a privacy leak
	 */
	public Queue(Queue other) {
		this.numElements = other.numElements;
		Object temp;
		for(int i = 0; i < other.data.length; i++) {
			temp = other.data[i];
			this.data[i] = temp;
		}
	}
	
	/*
	 * returns the item that entered the queue first (index 0), and then shifts the queue to the left
	 * to remove the item. Decrements numElements to account for it
	 */
	public Object dequeue() {
		if(size() == 0) {
			throw new RuntimeException("Cannot dequeue from empty queue");
		}
		Object retVal = data[0];
		shiftLeft(0);
		--numElements;
		return retVal;
	}
	
	/*
	 * Adds an item to the end of the queue and increments numElemnts to account for it
	 */
	public void enqueue(Object item) {
		data[numElements++] = item;
	}
	
	/*
	 * Shifts the entire queue to the left 
	 */
	public void shiftLeft(int end) {
		for(int i = end; i < numElements; i++) {
			data[i] = data[i + 1];
		}
	}
	
	/*
	 * Returns the amount of elements in the queue
	 */
	public int size() {
		return numElements;
	}
	
	/*
	 * Returns a boolean value signifying whether or not the queue has any values in it
	 * If it has no values, returns true. If it has at least one value, returns false
	 */
	public boolean isEmpty() {
		if(numElements == 0) {
			return true;
		}
		return false;
	}
	
	/*
	 * Returns a String that represents all the values in the queue
	 */
	@Override
	public String toString() {
		String total = "";
		for(int i = 0; i < numElements; i++) {
			total += data[i];
		}
		return total;
	}
	
	/*
	 * Tests to see if two Queue objects are equal to each other
	 */
	@Override
	public boolean equals(Object other) {
		if((other == null) || !(other instanceof Queue)) {
			return false;
		}
		Queue that = (Queue) other;
		boolean listBool = true;
		for(int i = 0; i < data.length; i++) {
			if(this.data[i] != that.data[i]) {
				listBool = false;
			}
		}
		return (listBool) && (this.size() == that.size());
	}
}

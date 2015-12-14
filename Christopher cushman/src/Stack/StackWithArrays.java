package Stack;

import java.util.Arrays;


public class StackWithArrays {
	Object[] stuff = new Object[10];
	int front = 0;
	
	public Object push(Object item) {
		if(front + 1 >= stuff.length)
			doubleArray();
		stuff[front] = item;
		front++;
		return item;
	}

	public Object pop() {
		front--;
		if(isEmpty())
			return null;
		Object wow =  stuff[front];
		stuff[front] = null;
		
		return wow;

	}

	public Object peek() {
		if(!isEmpty())
		return stuff[front - 1];
		else
			return null;
	} 

	public boolean isEmpty() {
		return front <= 0 &&stuff[0] == null;
	} 

	public int size() {
		return front;
	}

	public int search(Object a) {
		int x = front;
		for (Object b : stuff) {
			if (b != null && b.equals(a))
				return x;
			x--;
		}
		return -1;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("| ");
		for (int x = front - 1; x >= 0; x--)
			s.append(stuff[x] + " | ");

		return s.toString();
	}
	
	private void doubleArray() {
		int size = stuff.length;
		Object[] newStuff = new Object[size * 2];
		newStuff = Arrays.copyOf(stuff, front);
	}
}

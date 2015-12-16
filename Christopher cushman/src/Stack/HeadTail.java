package Stack;

import java.util.Arrays;
import java.util.Collections;

public class HeadTail {

	Object[] stuff = new Object[5];
	public int head = 0;
	public int tail = 0;
	public int size = 0;
	
	public HeadTail() {
		
	}
	
	public Object add(Object arg) {
		if(tail >= stuff.length)
			tail = 0;
		if(tail == head && size != 0)
			doubleArray();
		stuff[tail] = arg;
		tail++;
		size++;
		return arg;
	}
	
	public Object next() {
		Object next = stuff[head];
		stuff[head] = null;
		head++;
		if(head == stuff.length)
			head = 0;
		size--;
		return next;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("| ");
		for (int x = 0 ; x < stuff.length;  x++)
			s.append(stuff[x] + " | ");
		return s.toString();
	}
	
	public void doubleArray() {
		int size = stuff.length;
		Object[] newStuff = new Object[size * 2];
		System.arraycopy(stuff, 0, newStuff, 0, stuff.length);
		stuff = newStuff;
	}

	public static void main(String[] args) {
		HeadTail h = new HeadTail();
		h.add("a");
		h.add("b");
		h.add("c");
		System.out.println(h);
		System.out.println(h.next());
		System.out.println(h);
		System.out.println(h.next());
		System.out.println(h);
		System.out.println(h.next());
		System.out.println(h);
		h.add("a");
		h.add("b");
		h.add("c");
		System.out.println(h + "," + h.head);
		h.add("d");
		h.add("e");
		h.add("f");
		System.out.println(h);

	}

}

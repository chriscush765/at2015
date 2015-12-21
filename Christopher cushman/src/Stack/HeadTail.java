package Stack;

import java.util.Arrays;
import java.util.Collections;

public class HeadTail {

	Object[] stuff;
	public int head = 0;
	public int tail = 0;
	public int size = 0;
	
	public HeadTail() {
		stuff = new Object[5];
	}
	public HeadTail(int size) {
		stuff=new Object[size];
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
	
	public Object remove() {
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
			s.append((stuff[x] != null ? stuff[x] : "empty") + " | ");
		return s.toString();
	}
	
	public void doubleArray() {
		int size = stuff.length;
		Object[] newStuff = new Object[size * 2];
		System.arraycopy(stuff, 0, newStuff, 0, stuff.length);
		stuff = newStuff;
	}

	public static void main(String[] args) {
		HeadTail a = new HeadTail(10);

		 a.add(1);

		 a.add(2);

		 a.add(3);

		 a.add(4);

		 a.add(5);

		 a.add(6);

		 a.add(7);

		 a.add(8);

		 a.add(9);

		 System.out.println(a);

		 System.out.println("NEXT: " +a.remove());

		 System.out.println("NEXT: "+a.remove());

		 System.out.println("NEXT: "+a.remove());

		 System.out.println(a);

		 a.add(10);

		 System.out.println(a);

		 a.add(11);

		 System.out.println(a);

		 a.add(12);

		 System.out.println(a);

		 System.out.println("NEXT: "+a.remove());

		 System.out.println(a);

		 a.add(13);

		 System.out.println(a);

		 a.add(14);

		 System.out.println(a);

		 a.add(15);

		 System.out.println(a);

		 System.out.println("NEXT: "+a.remove());
		 
		System.out.println(a);
		

	}

}

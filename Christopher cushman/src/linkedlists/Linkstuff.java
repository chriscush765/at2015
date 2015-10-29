package linkedlists;

import java.util.*;

public class Linkstuff {
	
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.addLast("a");
		a.addLast("b");
		a.addLast("c");
		a.addLast("d");
		System.out.println("original: abcd");
		System.out.println("--- reverse ---");
		reverse(a);
		System.out.println("--- duplicate ---");
		duplicate(a);
		System.out.println("--- repeat ---");
		repeat(a);
		System.out.println("--- insert a ---");
		insert(a, "bob");
		System.out.println("--- delete d ---");
		delete(a,"d");
		
	}

	public static void reverse(LinkedList staff)
	{
		ListIterator i = staff.listIterator();
		
		LinkedList a = new LinkedList();
		
		while(i.hasNext()){
			a.addFirst(i.next());
		}
		print(a);
	}
	
	public static void duplicate(LinkedList staff)
	{
		ListIterator i = staff.listIterator();
		
		LinkedList a = new LinkedList();
		
		while(i.hasNext()){
			Object o = i.next();
			a.addLast(o);
			a.addLast(o);
		}
		print(a);
	}
	
	public static void repeat(LinkedList staff)
	{
		
		LinkedList a = new LinkedList();
		
		ListIterator i = staff.listIterator();
		while(i.hasNext()){
			a.addLast(i.next());
		}
		i = staff.listIterator();
		while(i.hasNext()){
			a.addLast(i.next());
		}
		
		print(a);
	}
	
	public static void delete(LinkedList staff, String delete)
	{
		LinkedList a = staff;
		
		ListIterator i = a.listIterator();
		while(i.hasNext()){
			if(i.next().equals(delete)){
				i.remove();
			}
		}
		
		print(a);
	}
	
	private static void print(LinkedList staff) {
		ListIterator i = staff.listIterator();
		
		while(i.hasNext()){
			System.out.print(i.next());
		}
		System.out.println();

	}
	
	public static void insert(LinkedList staff, Object o)
	{
		LinkedList a = staff;
		a.addLast(o);
		Collections.sort(a);
		print(a);
	}
}

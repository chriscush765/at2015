package Stack;

import java.util.LinkedList;
import java.util.Stack;


	public class MyQueue{
		private final LinkedList list;
		
		public MyQueue() {
			list=new LinkedList();
		}
		public MyQueue(String[] arg) {
			list=new LinkedList();
			for(String a : arg)
				list.add(a);
		}	
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		public Object offer(Object arg) {
			list.add(arg);
			return arg;
		}
		
		public Object peek() {
			return list.getFirst();
		}
		
		public Object poll() {
			return list.removeFirst();
		}

		public int search(Object arg) {
			if (list.indexOf(arg) == -1)
					return -1;
			else
				return list.indexOf(arg)+1;
		}
		
		public int size() {
			return list.size();
		}

		public String toString() {
				System.out.print("| ");
				for(Object a : list) 
					System.out.print((String)a +" | ");
				System.out.println();
				return "";
		}
		
		public static void main(String[] args) {
			MyQueue tc= new MyQueue();
			tc.offer("quarter");
			tc.offer("dime");
			tc.offer("nickle");
			tc.offer("penny");
			System.out.println("toString() "+tc);
			System.out.println("peek() "+tc.peek());
			System.out.println("search for dime "+tc.search("dime"));
			System.out.println("search for euro "+tc.search("euro"));
			System.out.println("Size "+tc.size());
			System.out.println("pop() and isEmpty()");
			while(!tc.isEmpty()) System.out.println(tc.poll());
		}

}
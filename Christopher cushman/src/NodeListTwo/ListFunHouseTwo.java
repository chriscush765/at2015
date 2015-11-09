package NodeListTwo;

import static java.lang.System.*;
import NodeList.ListNode;



public class ListFunHouseTwo {
	private ListNode current = null;

	// this method will print the entire list on the screen
	public String toString() {
		StringBuilder s = new StringBuilder();
		ListNode first = current;
		while(first.getNext() != current){
			s.append(first.getValue() + ",");
			first = first.getNext();
		}
		s.append(first.getValue());
		return s.toString();
	}

	// this method will return the number of nodes present in list
	public int nodeCount() {
		int count = 1;
		ListNode mine = current;
		while(mine.getNext() != current){
			count++;
			mine = mine.getNext();
		}
		return count;
	}

	// this method will create a new node with the same value as the first node
	// and add this
	// new node to the list. Once finished, the first node will occur twice.
	public void doubleFirst() {
		current.setNext(new ListNode(current.getValue(),current.getNext()));
	}

	// this method will create a new node with the same value as the last node
	// and add this
	// new node at the end. Once finished, the last node will occur twice.
	public void doubleLast() {
			ListNode head = current;
			ListNode last = current;
			head = head.getNext();
			while(head != current){
				last = head;
				head = head.getNext();
			}
			last.setNext(new ListNode(last.getValue(),current));
	}
	
	// method skipEveryOther will remove every other node
	public void skipEveryOther() {
		removeXthNode(2);
	}

	// this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value) {
		 int count=0;
	        ListNode temp = current.getNext();
	        while(temp != current)
	        {
	            if(count % x == 0)
	                temp.setValue(value);
	            temp = temp.getNext();
	            count++;
	        }
			
	}

	// this method will remove every xth node in the list
	public void removeXthNode(int x) {
		   int count = 1;
	        ListNode prev = null;
	        ListNode temp = current.getNext();
	        while(temp != current)
	        {
	            if(count % x == 0)
	            {
	                prev.setNext(temp.getNext());
	            }
	            prev = temp;
	            temp = temp.getNext();
	            count++;
	        }
		
	}

	public void add(String string) {
	
		if(current == null){
			current = new ListNode(string, null);
			current.setNext(current);
		}
		else{
			ListNode head = current;
			ListNode last = current;
			current = current.getNext();
			while(current != head){
				last = current;
				current = current.getNext();
			}
			last.setNext(new ListNode(string, head));
		}
	}
}

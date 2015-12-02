package Stack;

import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

public class CDStack {
	Stack<String> myStack;

	public CDStack() {
		myStack = new Stack<String>();
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		myStack.push("E");
		myStack.push("F");
		myStack.push("G");
		myStack.push("H");
		myStack.push("I");
		myStack.push("J");
	}

	public String nextCD() {
		return myStack.peek();
	}

	public String playNextCD() {
		return myStack.pop();
	}

	public void reverse(){
		Stack<String> boo = new Stack<String>();
		while(!myStack.empty())
			boo.push(myStack.pop());
		myStack = boo;
	}
	public void print() {
		String yo = myStack.peek();
		while (!myStack.empty() && myStack.peek() != null) {
			System.out.println(yo);
			yo = myStack.pop();
		}
	}

	public void printWithIterator(){
		Iterator<String> i = myStack.iterator();
		while(i.hasNext())
			System.out.println(i.next());

	}

	public void printIteratively() {
		String yo = myStack.elementAt(0);
		for (int x = 1; x < myStack.size(); x++) {
			System.out.println(yo);
			yo = myStack.elementAt(x);
		}
	}
	
	public void print3rd(){
		for(String s : myStack)
			System.out.println(s);
			
	}
	
	public void printRec(){
		printRec(myStack);
	}
	public void printRec(Stack s){
		System.out.println(s.pop());
		if(!s.isEmpty()) printRec(s);
	}

	public static void main(String[] args) {
		reverseTest();
	}
	
	public static void printTest(){
		CDStack cd = new CDStack();
		cd.print();
		cd = new CDStack();
		System.out.println("======== iterative ========");
		cd.printWithIterator();
		cd = new CDStack();
		System.out.println("========= foreach =========");
		cd.print3rd();
		cd = new CDStack();
		System.out.println("======== recursive ========");
		cd.printRec();
	}
	
	public static void reverseTest(){
		CDStack cd = new CDStack();
		cd.print3rd();
		System.out.println("======== reverse ========");
		cd.reverse();
		cd.print3rd();
	}
}

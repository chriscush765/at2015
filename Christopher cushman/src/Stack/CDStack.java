package Stack;

import java.util.Stack;

public class CDStack {
	Stack<String> myStack;
	
	public CDStack(){
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
	
	public String nextCD(){
		return myStack.peek();
	}
	
	public String playNextCD(){
		return myStack.pop();
	}
	
	public static void main(String[] args) {
		CDStack cd = new CDStack();
		String yo = cd.nextCD();
		while(yo != null){
			System.out.println(yo);
			yo = cd.nextCD();
		}
	}
}

package Stack;

import java.util.Stack;

public class StackMethods {

	public static double getAverage(Stack<Integer> one) {
		double sum = 0;
		int size = one.size();
		for(int a : one)
			sum += a;
		return sum/size;
	}

	public static Stack<String> alternateStack(Stack<String> one,Stack<String> two) {
		Stack<String> c = new Stack<String>();
		while(!one.isEmpty() || !two.isEmpty()) {
			if(!one.isEmpty())
			c.push(one.pop());
			if(!two.isEmpty())
			c.push(two.pop());
		}
		return c;
	}

	// Good Question: For alternating stacks, are they the same size??…Do they
	// have to be???

	public static Stack<String> removeEveryOther(Stack<String> one) {
		Stack<String> c = new Stack<String>();
		int x = 0;
		for(String a : one) {
			if(x%2==0)
				c.push(a);
			x++;
		}
		return c;
	}

	// Removes every other element in the stack – but the order of others
	// shouldn’t change.

	public static void display(Stack<String> one) {
		System.out.print("| ");
		for(String a : one) 
			System.out.print(a +" | ");
		System.out.println();
	}
	public static void main(String[] args){
	Stack<Integer> a = new Stack<Integer>();

	a.push(5); 

	a.push(2);

	a.push(7);

	Stack<String> b = new Stack<String>();

	b.push("one"); 

	b.push("two");

	Stack<String> c = new Stack<String>();

	             c.push("three");

	             c.push("four");

	             c.push("five");

	             display(alternateStack(b,c));

	System.out.println();

	Stack<String> d = new Stack<String>(); 

	d.push("six"); 

	d.push("seven");

	d.push("eight"); 

	d.push("nine"); 

	d.push("ten"); 

	display(removeEveryOther(d));
	System.out.println(getAverage(a));
	}
}
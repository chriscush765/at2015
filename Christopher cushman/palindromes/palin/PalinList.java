package palin;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		this("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue=new LinkedList<String>();
		stack=new Stack<String>();
		for(String obj : list.replaceAll("\\s+","").split("")) {
			queue.offer(obj);
			stack.push(obj);
		}
	}

	public boolean isPalin()
	{
		while(!queue.isEmpty())
			if(!queue.poll().equals(stack.pop()))
					return false;
		return true;
			
		
	}


	public String toString() {
		return queue.toString();
	}
}
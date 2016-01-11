package monsters;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MonsterPQ  
{
	private Queue<Monster> pq;

	public MonsterPQ()
	{
		pq = new PriorityQueue<Monster>();
	}

	public void add(Monster obj)
	{
		pq.offer(obj);
	}
	
	public Object getMin()
	{
		return pq.stream().sorted().toArray()[0];
	}
	
	public Object removeMin()
	{
		return pq.remove(getMin());
	}
	
	public String getNaturalOrder()
	{
		return Arrays.toString(pq.stream().sorted().toArray());	
	}

	//write a toString method
}
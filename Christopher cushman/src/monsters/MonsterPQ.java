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
		return "";
	}
	
	public Object removeMin()
	{
		return "";
	}
	
	public String getNaturalOrder()
	{
		String output="";
		return output;		
	}

	//write a toString method
}
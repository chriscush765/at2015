package morelinkedlists;

import java.util.LinkedList;

import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		return (double) list.stream().mapToInt(Integer::intValue).sum();
	}

	public double getAvg(  )
	{
		return getSum() / list.size();
	}

	public int getLargest()
	{
		return list.stream().max(Integer::compare).get();
	}

	public int getSmallest()
	{
		return list.stream().min(Integer::compare).get();
	}

	public String toString()
	{
		StringBuilder yolo = new StringBuilder();
		yolo.append("sum: "+getSum()+"\n");
		yolo.append("avg: "+getAvg()+"\n");
		yolo.append("max: "+getLargest()+"\n");
		yolo.append("min: "+getSmallest()+"\n");
		return yolo.toString();
		
	}
}
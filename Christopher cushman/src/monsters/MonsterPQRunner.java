package monsters;

import java.util.Scanner;

public class MonsterPQRunner
{
	public static void main ( String[] args )
	{

		MonsterPQ pq = new MonsterPQ();
		pq.add(new Monster(1, 1, 1));
		pq.add(new Monster(2, 2, 2));
		pq.add(new Monster(1, 2, 3));
		pq.add(new Monster(3, 2, 1));
		pq.add(new Monster(2, 1, 3));
		pq.add(new Monster(2, 3, 1));
		pq.add(new Monster(3, 1, 2));
		pq.add(new Monster(3, 3, 3));
		
		System.out.println(pq);
		System.out.println(pq.getMin());
		System.out.println(pq.removeMin());
		System.out.println(pq);
		System.out.println(pq.getMin());
		System.out.println(pq.removeMin());
		
		
		
	}
}
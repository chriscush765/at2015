package monsters;
public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		MonsterPQ pq = new MonsterPQ();
		pq.add(new Monster(5, 100, 5));
		pq.add(new Monster(5, 50, 6));
		pq.add(new Monster(5, 200, 7));
		System.out.println(pq.getMin());
		
		
	}
}
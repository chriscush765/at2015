//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  
package priorityQueues;

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		PQTester pq=new PQTester();
		
		pq.setPQ("i h g f e d c b a");
		System.out.println(pq+"\n"+pq.getNaturalOrder()+"\n"+pq.getMin()+"\n");	
		pq.setPQ("one two three four five six seven");
		System.out.println(pq+"\n"+pq.getNaturalOrder()+"\n"+pq.getMin()+"\n");
		pq.setPQ("1 2 3 4 5 one two three four five");
		System.out.println(pq+"\n"+pq.getNaturalOrder()+"\n"+pq.getMin()+"\n");
	}
}
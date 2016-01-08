package priorityQueues;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class PQTester {
	
	private Queue<String> pq;

	public PQTester() {
		this("");
	}

	public PQTester(String list) {
		setPQ(list);

	}

	public void setPQ(String list) {
		pq = Arrays.stream(list.split(" ")).collect((Collectors.toCollection(PriorityQueue::new)));
	}

	public Object getMin() {
		return pq.peek();

	} 

	public String getNaturalOrder() {
		return Arrays.toString(pq.stream().sorted().toArray());
	}

	@Override
	public String toString() {
		return pq.toString();
	}
}
//Arrays.stream(list.split(" ")).map(Integer::parseInt).forEach(pq::add);
//pq=pq.stream().sorted().collect(Collectors.toCollection(PriorityQueue::new));
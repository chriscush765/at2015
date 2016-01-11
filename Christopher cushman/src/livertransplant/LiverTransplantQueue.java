package livertransplant;

import java.util.ArrayList;
import java.util.List;

public class LiverTransplantQueue implements PriorityQueue {

	ArrayList<Patient> p = new ArrayList<Patient>();

	public boolean isEmpty() {
		return p.isEmpty();
	}

	public void add(Object x) {
		p.add((Patient) x);
	}

	public Object poll() {
		Patient a = p.remove(0);
		arrange();
		return a;
	}

	public Object peek() {
		return p.stream().sorted().findFirst().get();
	}

	public int size() {
		return p.size();
	}

	private void arrange() {
		if (size() > 1) {
			int min = 0;
			for (int i = 1; i < p.size(); i++) {
				if (p.get(i).compareTo(p.get(min)) < 0)
					min = i;
			}
			p.add(0, p.remove(min));
		}
	}

	public String toString() {
		arrange();
		return p.toString();
	}

}

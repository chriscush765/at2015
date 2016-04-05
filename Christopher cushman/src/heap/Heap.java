package heap;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap {
	private List<Integer> list;

	public Heap() {
		list = new ArrayList<Integer>();
	}

	public void add(int value) {
		list.add(value);
		swapUp(list.size() - 1);
	}

	public void swapUp(int bot) {
		while (bot > 0) {
			int parent = bot / 2;
			if (list.get(parent) > list.get(bot)) {
				int temp = list.get(parent);
				list.set(parent, list.get(bot));
				list.set(bot, temp);
			} else
				break;

		}
	}

	public void remove() {
		list.set(1, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		swapDown(list.size());
	}

	public void swapDown(int top) {
		while (top < list.size()) {
			int child = Math.min(top / 2, (top / 2) + 1);
			if (list.get(child) < list.get(top)) {
				int temp = list.get(child);
				list.set(child, list.get(top));
				list.set(top, temp);
			} else
				break;

		}
	}

	public void print() {
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println();
		int col = 1;
		for (int x : list) {

			int instance = col;
			if (instance > 0) {
				System.out.println(x + " ");
				instance--;
			} if(instance == 0) {
				col = col * 2;
				System.out.println();
			}

		}
	}

	public String toString() {
		return list.toString();
	}
}
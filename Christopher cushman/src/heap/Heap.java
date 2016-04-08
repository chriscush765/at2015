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
		if (bot > 0) {
			int parent = (bot - 1) / 2;
			if (list.get(parent) < list.get(bot)) {
				swap(parent, bot);
				swapUp(parent);
			}
		}
	}

	public void remove() {
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		swapDown(list.size());
	}

	public void swapDown(int top) {
		int root = 0;
		while (root < list.size()) {
			int left = root * 2 + 1, right = root * 2 + 2;
			int max = root;
			if (left < list.size())
				if (list.get(left) > list.get(max))
					max = left;
			if (right < list.size())
				if (list.get(right) > list.get(max))
					max = right;

			if (max > root) {
				swap(max, root);
				root = max;
			}
			else
			root++;
		}
	}

	public void print() {
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println();
		int col = 1;
		int instance = col;
		for (int x : list) {

			if (instance > 0) {
				if (col == 1)
					System.out.print("     " + x + " ");
				else if (col == 2)
					System.out.print("   " + x + " ");
				else if (col == 4)
					System.out.print(" " + x + " ");
				else
					System.out.print(x + " ");

				instance--;
			}
			if (instance == 0) {
				col = col * 2;
				instance = col;
				System.out.println();
			}

		}
	}

	private void swap(int parent, int child) {
		final int temp = list.get(parent);
		list.set(parent, list.get(child));
		list.set(child, temp);
	}

	public String toString() {
		return list.toString();
	}
}
package bianaryPhone;

import java.util.Arrays;

public class HistoTree<T extends Comparable<T>> {
	private HistoNode<T> head;

	public void add(T t) {
		final HistoNode<T> temp = search(t);
		if (null != temp)
			temp.increment();
		else
			head = add(t, head);
	}

	public void clear() {
		head = null;
	}

	public HistoNode<T> search(T t) {
		return search(t, head);
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 1; i <= getHeight(head); i++)
			str += toString(head, i);
		return str + "\n";
	}

	private HistoNode<T> add(T t, HistoNode<T> node) {
		if (null == node)
			return node = new HistoNode<T>(t);
		if (t.compareTo(node.getData()) < 0)
			node.setLeft(add(t, node.getLeft()));
		else if (t.compareTo(node.getData()) > 0)
			node.setRight(add(t, node.getRight()));
		return node;
	}

	private int getHeight(HistoNode<T> node) {
		if (null == node)
			return 0;
		else if (getHeight(node.getLeft()) > getHeight(node.getRight()))
			return 1 + getHeight(node.getLeft());
		else
			return 1 + getHeight(node.getRight());
	}

	private HistoNode<T> search(T t, HistoNode<T> node) {
		if (null == node || t.compareTo(node.getData()) == 0)
			return node;
		return search(t, t.compareTo(node.getData()) > 0 ? node.getRight()
				: node.getLeft());
	}

	private String toString(HistoNode<T> node, int level) {
		if (null == node)
			return "";
		if (level == 1)
			return node + "   ";
		return toString(node.getLeft(), level - 1)
				+ toString(node.getRight(), level - 1);
	}

	@SuppressWarnings("hiding")
	private class HistoNode<T extends Comparable<? super T>> {
		private int dataCount;
		private HistoNode<T> left, right;
		private T t;

		public HistoNode(T t) {
			dataCount = 1;
			left = null;
			right = null;
			this.t = t;
		}

		public HistoNode(T t, int dataCount, HistoNode<T> left,
				HistoNode<T> right) {
			this.dataCount = dataCount;
			this.left = left;
			this.right = right;
			this.t = t;
		}

		public T getData() {
			return t;
		}

		public int getDataCount() {
			return dataCount;
		}

		public HistoNode<T> getLeft() {
			return left;
		}

		public HistoNode<T> getRight() {
			return right;
		}

		public HistoNode<T> increment() {
			dataCount++;
			return this;
		}

		public void setData(T t) {
			this.t = t;
		}

		public void setLeft(HistoNode<T> left) {
			this.left = left;
		}

		public void setRight(HistoNode<T> right) {
			this.right = right;
		}

		@Override
		public String toString() {
			return t + " - " + dataCount;
		}
	}

	public static void main(String[] args) {
		HistoTree<String> ht = new HistoTree<String>();
		HistoTree<Integer> it = new HistoTree<Integer>();
		Arrays.stream("A A A A B V S E A S A A V S E A".split(" ")).forEach(
				ht::add);
		System.out.println(ht);
		ht.clear();
		System.out.println();
		Arrays.stream("1 2 3 11 22 32 1 22 13".split(" "))
		.map(Integer::parseInt).forEach(it::add);
		System.out.println(it);
		it.clear();
		System.out.println();
		Arrays.stream("abc ead xyz xyz abc ead 2342 z2y2z".split(" ")).forEach(
				ht::add);
		System.out.println(ht);
		ht.clear();
	}
}
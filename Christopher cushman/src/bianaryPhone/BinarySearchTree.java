package bianaryPhone;


import java.util.LinkedList;

import nodes.*;

public class BinarySearchTree {
	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(Comparable val) {
		root = add(val, root);
	}

	public TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null) {
			tree = new TreeNode(val);
			return tree;
		}

		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);

		if (dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if (dirTest > 0)
			tree.setRight(add(val, tree.getRight()));

		return tree;
	}

	public void inOrder() {
		inOrder(root);
		System.out.println("\n\n");
	}

	public void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	public void preOrder(TreeNode tree) {
		if (tree != null) {
			System.out.println(tree.getValue() + "\n");
			inOrder(tree.getLeft());
			inOrder(tree.getRight());

		}

	}

	public void postOrder() {
		preOrder(root);
	}

	public void postOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			inOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}

	}

	public void revOrder() {
		revOrder(root);
		System.out.println("\n");
	}

	private void revOrder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
			inOrder(tree.getLeft());
		}
	}

	public int getNumLevels() {
		return getNumLevels(root);
	}

	public int getNumLevels(TreeNode tree) {
		if (tree == null)
			return 0;
		else if (getNumLevels(tree.getLeft()) > getNumLevels(tree.getRight()))
			return 1 + getNumLevels(tree.getLeft());
		else
			return 1 + getNumLevels(tree.getRight());
	}

	public int getNumLeaves() {
		return getNumLeaves(root, 1);
	}

	public int getNumLeaves(TreeNode tree, int count) {
		if (tree.getLeft() != null)
			return getNumLeaves(tree.getLeft(), count);
		else if (tree.getRight() != null)
			return getNumLeaves(tree.getRight(), count);
		else
			return count++;

	}

	public int getNumNodes() {
		return getNumNodes(root, 1);
	}

	public int getNumNodes(TreeNode tree, int count) {
		if (tree.getLeft() != null)
			return getNumNodes(tree.getLeft(), count) + 1;
		else if (tree.getRight() != null)
			return getNumNodes(tree.getRight(), count) + 1;
		else
			return count++;

	}

	// getWidth, getHeight, , and isFull

	public int getHeight() {
		int ret = getNumLevels();
		if (ret == 0)
			return ret;
		else
			return ret - 1;
	}

	public int getWidth() {
		int count = 0;
		TreeNode x = root;
		while (x != null) {
			x = root.getLeft();
			count++;
		}
		x = root;
		while (x != null) {
			x = root.getRight();
			count++;
		}
		return count;

	}

	public int getSize() {
		return getSize(root, 0);
	}

	public int getSize(TreeNode tree, int count) {
		if (tree == null)
			return 0;
		count++;
		return getSize(tree.getLeft(), count) + getSize(tree.getRight(), count);

	}

	public boolean isFull() {
		return isFull(root);
	}

	public boolean isFull(TreeNode tree) {
		if (tree.getValue() == null)
			return true;
		if (tree.getLeft() != null)
			return isFull(tree.getLeft());
		else if (tree.getRight() != null)
			return isFull(tree.getRight());
		return false;

	}
	
	public String lookup(String number) {
		return lookup("-1", root, number);
	}

	private String lookup(String name, TreeNode tree, String number) {
		if (tree != null)
			if ((tree.getLeft() != null && ((PhoneEntry) tree.getLeft().getValue()).number.equals(number)))
				return ((PhoneEntry) tree.getLeft().getValue()).name;
			else if (tree.getRight() != null && ((PhoneEntry) tree.getRight().getValue()).number.equals(number))
				return ((PhoneEntry) tree.getRight().getValue()).name;
			else {
				if (!lookup(name, tree.getLeft(), number).equals("-1"))
					return lookup(name, tree.getLeft(), number);
				else if (!lookup(name, tree.getRight(), number).equals("-1"))
					return lookup(name, tree.getRight(), number);
			}

		return "-1";
	}

	public String lookupNumber(String lookForName) {
		return lookupNumber(lookForName, root);
	}

	public String lookupNumber(String name, TreeNode tree) {
		if (tree != null) {
			if (((PhoneEntry) tree.getValue()).name.equals(name))
				return ((PhoneEntry) tree.getValue()).number;
			else if (((PhoneEntry) tree.getValue()).name.compareTo(name) > 0)
				return lookupNumber(name, tree.getLeft());
			else
				return lookupNumber(name, tree.getRight());
		}
		return "-1";
	}

	public void changeNumber(String name, String number) {
		changeNumber(root, name, number);
	}

	public PhoneEntry changeNumber(TreeNode tree, String name, String number) {
		if (((PhoneEntry) tree.getValue()).name.equals(name)) {
			tree.setValue(new PhoneEntry(name, number));
		}
		if (((PhoneEntry) tree.getValue()).name.compareTo(name) > 0) {
			if (tree.getRight() != null)
				return changeNumber(tree.getRight(), name, number);
		} else if (((PhoneEntry) tree.getValue()).name.compareTo(name) < 0)
			if (tree.getLeft() != null)
				return changeNumber(tree.getLeft(), name, number);
		return null;

	}

	public Comparable maxNode() {
		return maxNode(root);
	}

	public Comparable maxNode(TreeNode tree) {
		Comparable max = tree.getValue();
		if (tree.getLeft() != null) {
			Comparable newMax = maxNode(tree.getLeft());
			max = max.compareTo(newMax) < 0 ? newMax : max;

		}
		if (tree.getRight() != null) {
			Comparable newMax = maxNode(tree.getRight());
			max = max.compareTo(newMax) < 0 ? newMax : max;
		}
		return max;
	}

	public TreeNode remove(String val) {
		root = remove(val, root);
		return root;
	}

	public TreeNode remove(String val, TreeNode tree){
		
		if(tree != null){
			int dirTest = val.compareTo(((PhoneEntry)tree.getValue()).name);
			
			if(dirTest < 0){
				tree.setLeft(remove(val, tree.getLeft()));
			}
			else if(dirTest > 0){
				tree.setRight(remove(val, tree.getRight()));
			}
			else{
				if(tree.getRight() == null)
					tree = tree.getLeft();
				else{
					TreeNode successor = (TreeNode) minNode(tree.getRight());
					tree.setValue((PhoneEntry) successor.getValue());
					tree.setRight(remove(((PhoneEntry)successor.getValue()).name, tree.getRight()));
				}
			}
		}
		return tree;
	}

	public Comparable minNode(TreeNode tree) {
		Comparable min = tree.getValue();
		if (tree.getLeft() != null) {
			Comparable newMin = minNode(tree.getLeft());
			min = min.compareTo(newMin) > 0 ? newMin : min;

		}
		if (tree.getRight() != null) {
			Comparable newMin = minNode(tree.getRight());
			min = min.compareTo(newMin) > 0 ? newMin : min;
		}
		return min;

	}

	// level order

	public void display() {
		System.out.print("inOrder\t");
		inOrder();
		System.out.print("preOrder\t");
		preOrder();
		System.out.print("postOrder\t");
		postOrder();
		System.out.print("revOrder\t");
		revOrder();
		System.out.print("levelOrder\t");
	}

	// remove

	public String toString() {
		return "";
	}

	private String toString(TreeNode tree) {
		return "";
	}
}
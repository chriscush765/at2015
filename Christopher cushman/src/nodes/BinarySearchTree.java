package nodes;

import static java.lang.System.*;
import java.util.LinkedList;

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
		if(tree == null)
			return;
		if(tree.getLeft() == null) {
			System.out.println(tree.getValue());
			preOrder(tree.getRight());
		}
		preOrder(tree.getLeft());
			
			
	}

	public void postOrder() {
		preOrder(root);
	}
	public void postOrder(TreeNode tree) {
		if(tree == null)
			return;
		if(tree.getLeft() == null) {
			System.out.println(tree.getValue());
			preOrder(tree.getRight());
		}
		preOrder(tree.getLeft());
			
			
	}
	// add preOrder, postOrder, and revOrder

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

	// add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull

	public boolean search(Comparable value) {
		return search(root, value);
	}
	public boolean search(TreeNode tree, Comparable value) {
		if(tree.getValue().equals(value))
			return true;
		if(tree.getLeft() == null)
			return search(tree.getRight(),value);
		return search(tree.getLeft(),value);
			
	}


	public Comparable maxNode(TreeNode tree, Comparable value) {
		if(tree.getValue().compareTo(value) < 0)
			return true;
		if(tree.getLeft() == null)
			return search(tree.getRight());
		return search(tree.getLeft());
			
			
	}

	// minNode

	// level order

	// display like a tree

	// remove

	public String toString() {
		return "";
	}

	private String toString(TreeNode tree) {
		return "";
	}
}
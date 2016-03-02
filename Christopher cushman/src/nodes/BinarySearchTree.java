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
		if(tree != null){
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getLeft());
			inOrder(tree.getRight());

		}
			
	}

	public void postOrder() {
		preOrder(root);
	}
	public void postOrder(TreeNode tree) {
		if(tree != null){
			inOrder(tree.getLeft());
			inOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
			
			
	}
	
	public void revOrder()
	{
		revOrder(root);
		System.out.println("\n");
	}
	
	private void revOrder (TreeNode tree){
		if(tree != null){
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
		if(tree.getLeft() != null)
			return getNumLeaves(tree.getLeft(),count);
		else if(tree.getRight() != null )
			return getNumLeaves(tree.getRight(),count);
		else
			return count++;
			
	}
	
	public int getNumNodes() {
		return getNumNodes(root, 1);
	}
	public int getNumNodes(TreeNode tree, int count) {
		if(tree.getLeft() != null)
			return getNumNodes(tree.getLeft(),count) + 1;
		else if(tree.getRight() != null )
			return getNumNodes(tree.getRight(),count) + 1 ;
		else
			return count++;
			
	}
	// getWidth, getHeight, , and isFull

	public int getHeight(){
		int ret = getNumLevels();
		if(ret == 0)
			return ret;
		else	
			return  ret - 1;
	}
	
	public boolean isFull() {
		return isFull(root);
	}
	public boolean isFull(TreeNode tree) {
		if(tree.getValue() == null)
			return true;
		if(tree.getLeft() != null)
			return isFull(tree.getLeft());
		else if(tree.getRight() != null )
			return isFull(tree.getRight());
		return false;
			
	} 
	public boolean search(Comparable value) {
		return search(root, value);
	}
	public boolean search(TreeNode tree, Comparable value) {
		if(tree.getValue().equals(value))
			return true;
		if(tree.getLeft() != null)
			return search(tree.getLeft(),value);
		else if(tree.getRight() != null )
			return search(tree.getRight(),value);
		return false;
			
	}

	public Comparable maxNode() {
		return maxNode(root);
	}

	public Comparable maxNode(TreeNode tree) {
		 Comparable max = tree.getValue();
		    if(tree.getLeft() != null) {
		        Comparable newMax = maxNode(tree.getLeft());
		       max = max.compareTo(newMax) < 0 ? newMax : max;
		        
		    }
		    if(tree.getRight() != null) {
		    	 Comparable newMax = maxNode(tree.getRight());
			       max = max.compareTo(newMax) < 0 ? newMax : max;
		    }
		    return max;
			
			
			
			
			
	}

	public Comparable minNode() {
		return minNode(root);
	}

	public Comparable minNode(TreeNode tree) {
		 Comparable min = tree.getValue();
		    if(tree.getLeft() != null) {
		        Comparable newMin = minNode(tree.getLeft());
		        min = min.compareTo(newMin) > 0 ? newMin : min;
		        
		    }
		    if(tree.getRight() != null) {
		    	 Comparable newMin = minNode(tree.getRight());
		    	 min = min.compareTo(newMin) > 0 ? newMin : min;
		    }
		    return min;
			
			
			
			
			
	}

	// level order

	public void display()
	{
		System.out.print("inOrder\t");
		inOrder();
		System.out.print("preOrder\t");
		preOrder();
		System.out.print("postOrder\t");
		postOrder();
		System.out.print("revOrder\t");
		revOrder();
		System.out.print("levelOrder\t");
		levelOrder();
	}

	// remove

	public String toString() {
		return "";
	}

	private String toString(TreeNode tree) {
		return "";
	}
}
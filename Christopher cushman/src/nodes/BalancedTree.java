package nodes;

public class BalancedTree {

	private TreeNode root;
	
	public BalancedTree(int[] data) {
		balance(data);
	}
	
	public void balance(int[] data) {
		if(data.length == 1) 
			add(data[0]);
		else {
			if(data.length %2 == 0) {
				int middle = (data.length / 2) - 1;
				int[] left = new int[middle];
				int[] right = new int[middle];
				System.arraycopy(data, 0, left, 0, middle);
				System.arraycopy(data, middle, right, middle, middle);
				balance(right);
				balance(left);
			}
			else
			{
				int middle = (data.length / 2);
				add(data[middle]);
				int[] left = new int[middle];
				int[] right = new int[middle];
				System.arraycopy(data, 0, left, 0, middle);
				System.arraycopy(data, middle + 1, right, 0, middle);
				balance(right);
				balance(left);
			}
				
		}
		
	}

	public static void main(String[] args) {
		int[] data = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		BalancedTree x = new BalancedTree(data);
		System.out.println("inorder");
		x.preOrder();
	}
	
	public void preOrder() {
		preOrder(root);
	}

	public void preOrder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());

		}

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

}

package HistoTree;


public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		final HistoNode temp = search(data);
		if (null != temp)
			temp.setDataCount(temp.getDataCount() + 1);
		else
			root = add(data, root);
	}

	private HistoNode add(Comparable data, HistoNode tree)
	{
		if (tree == null)
			return tree = new HistoNode(data,0, null,null);
		if (data.compareTo(tree.getData()) < 0)
			tree.setLeft(add(data, tree.getLeft()));
		else if (data.compareTo(tree.getData()) > 0)
			tree.setRight(add(data, tree.getRight()));
		return tree;
	}

	public HistoNode search(Comparable data)
	{
		return search(data, root);
	}

	private HistoNode search(Comparable data, HistoNode tree)
	{
		if (tree == null || data.compareTo(tree.getData()) == 0)
			return tree;
		return search(data, data.compareTo(tree.getData()) > 0 ? tree.getRight() : tree.getLeft());
	}

	public String toString()
	{
		return toString(root);
	}
	
	public String toString(HistoNode yo) {
		if (yo != null) {
			System.out.println(yo.toString() + "\n");
			toString(yo.getLeft());
			toString(yo.getRight());

		}
		return "";
	}
	
	
}
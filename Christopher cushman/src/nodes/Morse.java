package nodes;

import java.rmi.UnexpectedException;

public class Morse {

	public TreeNode left;
	public TreeNode right;
	private TreeNode current;
	
	
	public Morse (){
		left = new TreeNode();
		right = new TreeNode();
		
		
	}
	
	public void buildTree(String letter, String code) {
		if(current == null)
			current = new TreeNode();
		if(code.length() == 0)
			current.setValue(letter);
		else if(code.charAt(0)=='.') {
			current = left;
			buildTree(letter, code.substring(1, code.length()));
		}
		else if(code.charAt(0)=='-') {
			current = right;
			buildTree(letter, code.substring(1, code.length()));
		}
		else
			System.err.println("unexpected code");
			
	}
}

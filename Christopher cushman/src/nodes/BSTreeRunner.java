package nodes;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		BinarySearchTree bs = new BinarySearchTree();
 		bs.add(90);
 		bs.add(80);
 		bs.add(100);
 		bs.add(70);
 		bs.add(85);
 		bs.add(98);
 		bs.add(120);

 		System.out.println(" --------- preorder --------- ");
 		bs.preOrder();
 		System.out.println("\n\n --------- post order --------- ");
 		bs.postOrder();
 		System.out.println("\n\n --------- inOrder --------- ");
 		bs.inOrder();
 		System.out.println("\n\n --------- revOrder --------- ");
 		bs.revOrder();
 		System.out.println("\n");
 		System.out.println("the max is " +bs.maxNode());
 		System.out.println("the min is " +bs.minNode());
 		System.out.println("Leaves "+ bs.getNumLeaves());
 		System.out.println("num Levels "+ bs.getNumLevels());
 		System.out.println("is full "+ bs.isFull());
 		System.out.println("width "+bs.getWidth());
 		System.out.println("height "+ bs.getHeight());
 		if(bs.search(70))
 			System.out.println("The tree contains 70");
 		System.out.println("remove 70");
 		bs.remove(70);
 		System.out.println(" --------- inOrder --------- ");
 		bs.inOrder();
 		
 		
 		
 		
 		
 
   }
}
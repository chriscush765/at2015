package nodes;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		BinarySearchTree bs = new BinarySearchTree();
 		bs.add(5);
 		bs.add(4);
 		bs.add(6);
 		bs.add(3);
 		bs.add(7);
 		bs.add(2);
 		System.out.println(bs.search(3));
 		System.out.println("kay we gonna print it left to right");
 		bs.preOrder();
 		System.out.println("the max is " +bs.maxNode());
 		System.out.println("the min is " +bs.minNode());
 		System.out.println("Leaves "+ bs.getNumLeaves());
 		System.out.println("num Levels "+ bs.getNumLevels());
 		System.out.println("is full "+ bs.isFull());
 	
 		
 		
 		
 		
 		
 
   }
}
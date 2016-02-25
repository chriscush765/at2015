package nodes;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		BinarySearchTree bs = new BinarySearchTree();
 		bs.add(1);
 		bs.add(2);
 		bs.add(3);
 		bs.add(4);
 		bs.add(5);
 		bs.add(6);
 		System.out.println(bs.search(3));
 		System.out.println("kay we gonna print it left to right");
 		bs.preOrder();
 	
 		
 		
 		
 		
 		
 
   }
}
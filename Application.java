/**
 * Application class for Generic Linked List application
 * @author jcfarese
 * @version 9/7/2022
 * original code is from @author njohnson3 and edited to include generic types 
 * Fall 2022
 */

public class Application {

	//Main method
	public static void main(String[] args) {
		
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		Node<Integer> aNode=new Node<Integer>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node<Integer> tempnode=myList.getList();
			do {
				System.out.println(tempnode.getData());
				tempnode=tempnode.getNextNode();
			} 
			
			while (tempnode!=null);
			

	}//end main method
	
}//end class

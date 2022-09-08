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
		
		//creates a new linked list with type Integer
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		//creates a node with type integer
		Node<Integer> aNode=new Node<Integer>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		//returns the linked list with the node type integer and prints it while the nodes are null
		Node<Integer> tempnode=myList.getList();
			do {
				System.out.println(tempnode.getData());
				tempnode=tempnode.getNextNode();
			} 
			
			while (tempnode!=null);
			

	}//end main method
	
}//end Application Class

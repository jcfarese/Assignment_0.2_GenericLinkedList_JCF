/**
 * Linked list class for Generic Linked List application
 * @author jcfarese
 * @version 9/7/2022
 * original code is from @author njohnson3 and edited to include generic types 
 * Fall 2022
 */

public class LinkedList<T> {
	
	//Instance of variables
	private Node<T> head;
	private Integer length;
	private Node<T> tail;
	
	//Constructors
	public LinkedList(){
		head=null;
		length=0;
		tail=head;
	}//end Constructors
	
	
	//creates method to check if the list is empty or not
	public boolean isEmpty(){
		if (head==null) { 
			return true;
		}
		else return false;
	}//end isEmpty
	
	//Accessor for getList
	public Node<T> getList(){
		return head;
	}//end getList
	
	
	//method that creates a Node for the list
	public void addNode(Node<T> aNode){
		//checks to see if the node is empty
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}//end check
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode

}//end LinkedList Class
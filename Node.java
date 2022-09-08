/**
 * Node Class for Generic Linked List application
 * @author jcfarese
 * @version 9/7/2022
 * original code is from @author njohnson3 and edited to include generic types 
 * Fall 2022
 */

class Node <T> {
	
	//Instance of Variables
	private T data;
	private Node<T> nextNode;
	
	//Constructors
	public Node() {
		
		nextNode=null;
		data=null;
	}//end constructor
	
	
	//Sets data of variable T
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	
	//Accessor for getData
	public T getData(){
		return data;
	}//end getData
	
	//Accessor for getNode
	public Node<T> getNode() {
		return this;
	}//end getNode
	
	//Sets nextNode of variable Node
	public void setNextNode(Node<T> nextNode) {
		this.nextNode=nextNode;
	}//end setNextNode
	
	//Accessor for getNextNode
	public Node<T> getNextNode() {
		return nextNode;
	}//end getNextNode
	
	
}//end Node class
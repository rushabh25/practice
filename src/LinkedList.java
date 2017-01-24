
public class LinkedList {

	private int size;
	private Node head;
	
	public LinkedList(){
		size = 0;
		head = null;
	}
	
	// O(1) insert at top is constant 
	public void insertAtTop(Object dataToInsert){
		Node newNode = new Node(dataToInsert);
		size ++;
		if (head == null) {
			head = newNode;
		} else {
			newNode.nextNode = head;
			head = newNode;
		}
	}
	
	// O(n) complexity
	public void insertAtEnd(Object dataToInsert) {
		Node newNode = new Node(dataToInsert);
		Node temp = head;
		while (head.getNextNode() != null) {
			head = head.getNextNode();
		}
		head.setNextNode(newNode);
		size++;
		head = temp;
	}
	
	public void removeFromTop() {
		size--;
		Node nodeToRemove = head;
		head = head.getNextNode();
		nodeToRemove = null;
	}
	
	public String ToString(){
		String str = "";
		while(head != null) {
			str = str + head.getData().toString() + " ";
			head = head.getNextNode();
		}
		return str;
	}
	
	public int getSize()
	{
		return size;
	}
	
	private class Node {
		private Object data;
		private Node nextNode;
		
		public Node()
		{
			this.nextNode = null;
			this.data = null;
		}
		
		public Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
		
		public void setData(Object data){
			this.data = data;
		}
		
		public Object getData() {
			return data;
		}
		
		public void setNextNode(Node node) {
			this.nextNode = node;
		}
		
		public Node getNextNode() {
			return nextNode;
		}
	}
	
	
	
}

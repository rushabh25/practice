
public class Node {
	private Node nextNode;
	private int data;
	
	public Node(int data) {
		this.data = data;
		nextNode = null;
	}
	
	public int getData() {
		return data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}
}

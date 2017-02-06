import java.util.HashMap;
import java.util.Map;


public class RemoveDupsFromLinkedList {

	//Example input  = [1,2,2,6,4,4,2] 

	///Example output = [1,2,6,4]
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public Node head;
	
	public void insert(int input) {
		Node newNode = new Node(input);
		if(head == null) {
			head = newNode;
		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
		
	}
	
	public void RemoveDups(){
		Node current = head;
		Node nextNode = head;
		while(current != null) {
			//System.out.println(current.getData());
			try {
			while(nextNode.getNextNode() != null) {
				if(current.getData() == nextNode.getNextNode().getData()) {
					Node nodeToReplace = null;
					if (nextNode.getNextNode().getNextNode() != null) nodeToReplace = nextNode.getNextNode().getNextNode();
					nextNode.getNextNode().setNextNode(null);
					nextNode.setNextNode(nodeToReplace);
				}
				if(nextNode.getNextNode() != null) nextNode = nextNode.getNextNode();
			}
			} catch(Exception e) {
				System.out.println("nextNode: " + nextNode.getData());
			}
			
			current = current.getNextNode();
			nextNode = current;
		}
	}
	
	@Override
	public String toString() {
		Node current = head;
		String str = "";
		while(current != null) {
			str += current.getData() + " ";
			current = current.getNextNode();
		}
		return str;
	}
	
}

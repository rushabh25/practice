import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDupsFromLinkedList linkedList = new RemoveDupsFromLinkedList();
		linkedList.insert(2);
		linkedList.insert(4);
		linkedList.insert(4);
		linkedList.insert(6);
		linkedList.insert(2);
		linkedList.insert(2);
		linkedList.insert(1);
		System.out.println(linkedList);
		linkedList.RemoveDups();
		
		System.out.println(linkedList);
	}

}

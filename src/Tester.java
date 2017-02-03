import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree tree = new BinarySearchTree(10);
		tree.insert(100);
		tree.insert(150);
		tree.insert(50);
		tree.insert(5);
		tree.insert(15);
		tree.insert(35);
		tree.insert(2);
		tree.PreOrderTraversal();
		System.out.println();
		System.out.println("===========");
		tree.InOrderTraversal();
		System.out.println();
		System.out.println("===========");
		tree.PostOrderTraversal();
		System.out.println("===========");

		
		
	}

}

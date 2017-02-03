
public class BinarySearchTree {

	private TreeNode root;
	private int size;
	public BinarySearchTree(Integer data){
		TreeNode newNode = new TreeNode(data);
		root = newNode;
		size++;
	}
	
	public boolean find(Integer data){
		TreeNode current = root;
		while(current != null) {
			if(data == current.data) {
				return true;
			}
			else if(data > current.getData()){
				if(current.right != null) {
					current = current.right;
				} else {
					return false;
				}
			}
			else if(data < current.getData()) {
				if(current.left != null){
					current = current.left;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	public void insert(Integer data){
		TreeNode newNode = new TreeNode(data);
		TreeNode current = root;
		setSize(getSize() + 1);
		
		while(current != null) {
			if(data > current.getData()){
				if(current.right != null) {
					current = current.right;
				} else {
					current.setRight(newNode);
					return;
				}
			} else {
				if(current.left != null){
					current = current.left;
				} else {
					current.setLeft(newNode);
					return;
				}
			}
				
		}
		
	}
	
	public Integer Max(){
		TreeNode current = root;
		while(true) {
			if(current.getRight() == null) {
				return current.getData();
			}
			else current = current.getRight();
		}
	}
	
	public Integer Min(){
		TreeNode current = root;
		while(true) {
			if(current.getLeft() == null) {
				return current.getData();
			}
			else current = current.getLeft();
		}
	}
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void PreOrderTraversal() {
		this.root.PreOrderTraversal();
	}
	
	public void InOrderTraversal() {
		this.root.InOrderTraversal();
	}
	
	public void PostOrderTraversal() {
		this.root.PostOrderTraversal();
	}



	class TreeNode{
		private Integer data;
		private TreeNode left;
		private TreeNode right;
		
		
		public TreeNode(Integer data){
			this.data = data;
			left = null;
			right = null;
		}
		
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		public void setRight(TreeNode right) {
			this.right = right;
		}
		public Integer getData() {
			return data;
		}
		public TreeNode getLeft() {
			return left;
		}
		public TreeNode getRight() {
			return right;
		}
		
		public void PreOrderTraversal(){
			System.out.print(this + " ");
			if(this.left != null) {
				this.left.PreOrderTraversal();
			}
			if(this.right != null) {
				this.right.PreOrderTraversal();
			}
		}
		
		public void InOrderTraversal(){
			
			if(this.left != null) {
				this.left.InOrderTraversal();
			}
			System.out.print(this + " ");
			if(this.right != null) {
				this.right.InOrderTraversal();
			}
		}
		
		public void PostOrderTraversal(){
			
			if(this.left != null) {
				this.left.PostOrderTraversal();
			}
			
			if(this.right != null) {
				this.right.PostOrderTraversal();
			}
			
			System.out.print(this + " ");
		}
		
		@Override
		public String toString(){
			return this.data.toString();
		}
	}
	
	
}

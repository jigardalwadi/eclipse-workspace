package New_BST;

public class BST {
	Node root;
	
	public void add(int data) {
		root = insert(root,data);
	}
	
	private Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		if(root.data < data) {
			root.right = insert(root.right,data);
		}
		if(root.data > data) {
			root.left = insert(root.left,data);
		}
		return root;
	}


	void printIN() {
		inorder(root); 
	}
	void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
		
	}
	int depth() {
		return MaxDepth(root);
	}
	
	int MaxDepth(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		if(root.left == null) {
			return MaxDepth(root.right)+1;
		}
		
		if(root.right == null) {
			return MaxDepth(root.left)+1;
		}
		
		return Math.min(MaxDepth(root.left), MaxDepth(root.right))+1;

	}
	
	
	public void Delete(int i) {
		root = DeleteNode(root,i);
	}
		

	private Node DeleteNode(Node root, int i) {
		if(root==null) {
			return null;
		}
		if(root.data == i) {
			//if node has no child
			if(root.left == null & root.right == null) {
				return null;
			}
			//if only one chile is there
			if (root.right == null) {
			    return root.left;
			}
			 
			if (root.left == null) {
			    return root.right;
			}
			//if there are both children are there
			//find the smallest
			int smallestValue = findSmallestValue(root.right);
			root.data = smallestValue;
			root.right = DeleteNode(root.right, smallestValue);
			return root;
			
		}
		if(i<root.data) {
			root.left = DeleteNode(root.left,i);
			return root;
		}else {
			root.right = DeleteNode(root.right, i);
			return root;
		}
	}
	private int findSmallestValue(Node root) {
	    return root.left == null ? root.data : findSmallestValue(root.left);
	}
	
	
	
	
	public static void main(String[] args) {
		BST bt = new BST();
		bt.add(2);
		bt.add(1);
		bt.add(3);
		bt.add(4);
		bt.add(5);
		bt.printIN();
		
		System.out.println("  ");
		
		bt.Delete(3);
		bt.printIN();
		
	}
	
}

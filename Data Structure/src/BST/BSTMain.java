package BST;
import java.util.*;
//import java.io.*;
public class BSTMain {
	// create a node named root to start with
	static Node root;
	
	private Node insertnode(Node current, int value) {
		if(current == null) {
			return new Node(value);
		}
		
		if(value < current.data) {
			current.left = insertnode(current.left,value); 
		}
		else {
			current.right = insertnode(current.right, value);
		}
		
		return current;
	}
	public void add(int value) {
		root = insertnode(root, value);
	}
	
	
	private boolean containsnode(Node current, int value) {
		if(current == null) {
			return false;
		}
		if(value == current.data) {
			return true;
		}
		
		return value< current.data ? containsnode(current.left , value) : containsnode(current.right , value);
	}
	public boolean contains(int value) {
		return containsnode(root,value);
	}
	
	
	public Node deletenode(Node current, int value) {
		if(current == null) {
			return null;
		}
		
		
		if(value == current.data) {
			// no nodes in the tree
			if(current.left == null && current.right == null) {
				return null;
			}
			// no left or right is null
			if(current.right == null) {
				return current.left;
			}
			if(current.left == null) {
				return current.right;
			}
			
		// finding a smallest child
		int smallestValue = findSmallestValue(current.right);
		current.data = smallestValue;
		current.right = deletenode(current.right, smallestValue);
		return current;
		}
		
		
		
		if(value < current.data) {
			current.left = deletenode(current.left, value);
				return current;
		}
		else {
			current.right = deletenode(current.right, value);
			return current;
		}
		
	}
	private int findSmallestValue(Node root) {
	    return root.left == null ? root.data : findSmallestValue(root.left);
	}
	public void delete(int value) {
		root = deletenode(root,value);
	}
	
	public void traversinorder(Node node) {
		if(node != null) {
			traversinorder(node.left);
			System.out.println(" "+ node.data);
			traversinorder(node.right);
		}
	}
	
	public void traversepreorder(Node node) {
		if(node !=null) {
			System.out.println(" "+ node.data);
			traversepreorder(node.left);
			traversepreorder(node.right);
		}
	}
	
	public void traversepostorder(Node node) {
		if(node !=null) {
			traversepreorder(node.left);
			traversepreorder(node.right);
			System.out.println(" "+ node.data);
		}
	}
	
	
	
	public int depth(Node node) {
		
		if (node == null) {
			return 0;
		}
		int rightdepth=1;
		int leftdepth = 1;
		while(node.left != null) {
			rightdepth++;
			node = node.left;
		}
		while(node.right != null) {
			leftdepth++;
			node = node.right;
		}
		return Math.max(leftdepth, rightdepth);
		
	}
	
	
	
	
	
	
	public void Bfs() {
		if(root == null) {
			return;
		}
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		// while queue is not empty
		while(!nodes.isEmpty()) {
			Node node = nodes.remove();
			System.out.println(" "+ node.data);
			
			if(node.left != null) {
				nodes.add(node.left);
			}
			if(node.right != null) {
				nodes.add(node.right);
			}
		}
		
	}
	
	
	public static void main(String[] ags) {
		BSTMain bt = new BSTMain();
		StringBuffer str = new StringBuffer();
		str.capacity();
		bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    


		//bt.traversinorder(root);
		//System.out.println(str.capacity());
		//bt.traversepreorder(root);
		bt.Bfs();
		bt.depth(root);
		//bt.traversepostorder(root);
	}
}



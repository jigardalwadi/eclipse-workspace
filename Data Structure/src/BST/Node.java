package BST;

public class Node {
	Node left;
	Node right;
	int data;
	//constuctor which takes data and asigns it ti the node. // default constutor
	Node(int item){
		this.data = item;
		left = right = null;
	}
}

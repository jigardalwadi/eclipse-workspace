package Linkedlist;

public class intlinkedlist {
	protected Node head;
	class Node{
		public int value;
		public Node link;	
	}
	public intlinkedlist() {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public intlinkedlist(int item) {
		head = new Node();
		head.value = item;
		head.link = null;
	}
	
	
	
	public boolean insert(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean delete(int item) {
		if(head.value == item) {
			head = head.link;
			return true;
		}
		else {
			Node x = head;
			Node y = head.link;
			while(true) {
				if(y == null || y.value == item) {
					break;
				}
				else {
					x = y;
					y = y.link;
				}
			}
			if(y != null) {
				x.link = y.link;
				return true;
			}
			else {
				return false;
			}
			
		}
	}
	
	
	public void printall() {
		Node z = head;
		while(z != null) {
			System.out.println(z.value);
			z = z.link;
		}
	}

	public void sort() {
		int c = 0;
		Node a = head.link;
		while(a.link != null) {
			Node ab = head.link;
			while(ab.link != null) {
				if(ab.value < ab.link.value) {
					c = ab.value;
					ab.value = ab.link.value;
					ab.link.value = c;
				}
				ab = ab.link;
			}
			a = a.link;
		}
		
	}

}
	


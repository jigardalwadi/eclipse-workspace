package Doublylinkedlist;

public class dlist {
	public Node head;
	class Node{
		private Node prev;
		private int value;
		private Node next;
	}
	public dlist(int item) {
		head = new Node();
		head.value = item;
		head.next = null;
		head.prev = null;
	}
	
	public boolean insert(int item) {
		Node n = new Node();
		n.value = item;
		n.prev = head;
		n.next = null;
		head.next = n;
		
		return true;
	}
	
	public boolean delete(int item) {
		if(head.value == item) {
			head = head.next;
			return true;
		}
		else {
			Node x = head;
			Node y = head.next;
			while(true) {
				if(y == null || y.value == item) {
					break;
				}
				else {
					x = y;
					y = y.next;
				}
			}
			if(y != null) {
				x.next = y.next;
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
			z = z.next;
		}
	}

	public void sort() {
		int c = 0;
		Node a = head.next;
		while(a.next != null) {
			Node ab = head.next;
			while(ab.next != null) {
				if(ab.value < ab.next.value) {
					c = ab.value;
					ab.value = ab.next.value;
					ab.next.value = c;
				}
				ab = ab.next;
			}
			a = a.next;
		}
		
	}

}
	


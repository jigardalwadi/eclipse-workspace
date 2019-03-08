package Linkedlist;

//import java.util.LinkedList;

public class linkedlist {
	Node head;
	
	static class Node{
		int data;
		Node next;
		// constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	
	public void push(int d) {
		Node newnode = new Node(d);
		newnode.next = head;
		head = newnode;
	}
	public void pop(int pos) {
		if(head == null) {
			return;
		}
		Node temp = head;
		if(pos == 0) {
			head = temp.next;
			return;
		}
		
		for(int i=0; temp != null && i< pos; i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null) {
			return;
		}
		
		Node next = temp.next.next;
		temp.next = next;
	}
	
	public void insertafter(Node prevnode, int newdata) {
		
		if(prevnode == null) {
			System.out.println("The prev node can not be null");
			return;
		}
		else {
			Node newnode = new Node(newdata);
			newnode.next = prevnode.next;
			prevnode.next = newnode;
		}
	}
	
	public void append(int newdata) {
		Node newnode = new Node(newdata);
		if(head == null) {
			head = new Node(newdata);
			return;			
		}
		newnode.next = null;
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
			last.next = newnode;
			return;
		}
	}
	
	public void print() {
		Node tnode = head;
		while(tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	
	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		
		list.append(2);
		list.push(5);
		list.push(4);
		list.pop(1);
		list.print();
		
	}
	
}

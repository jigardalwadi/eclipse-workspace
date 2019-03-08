package Linkedlist;

public class personlinkedlist {
		protected Node head;
		class Node{
			public person person;
			public Node link;	
		}
		
		public personlinkedlist(person item) {
			head = new Node();
			head.person = item;
			head.link = null;
		}
		
		
		
		public boolean insert(person item) {
			Node n = new Node();
			Node newnode;
			newnode = head;
			while(newnode.link !=null) {
				newnode = newnode.link;
			}
			n.person = item;
			n.link = null;
			newnode.link = n;
			return true;
		}
		
		public boolean delete(String name) {
			if(name.equals(head.person.getName())) {
				head = head.link;
				return true;
			}
			else {
				Node x = head;
				Node y = head.link;
				while(y != null && !(y.person.getName().equals(name))) {
					x = y;
					y = y.link;
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
				System.out.println(z.person.toString());
				z = z.link;
			}
		}

//		public void sort() {
//			int c = 0;
//			Node a = head.link;
//			while(a.link != null) {
//				Node ab = head.link;
//				while(ab.link != null) {
//					if(ab.value < ab.link.value) {
//						c = ab.value;
//						ab.value = ab.link.value;
//						ab.link.value = c;
//					}
//					ab = ab.link;
//				}
//				a = a.link;
//			}
//			
//		}

	}
		


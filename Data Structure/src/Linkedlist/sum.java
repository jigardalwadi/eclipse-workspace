package Linkedlist;

import Linkedlist.intlinkedlist.Node;

public class sum extends intlinkedlist {
	public sum(intlinkedlist l1, intlinkedlist l2) {
		intlinkedlist n1= l1;
		intlinkedlist m1= l2;
		

		intlinkedlist sum = new intlinkedlist();
		int x1 = 0;
		int y1 = 0;
		int s1 = 0;
		
		while(n1 != null || m1 != null) {
			 
				Node h1 = n1.head;
				x1 = (h1 != null) ? h1.value : 0;

				Node h2 = m1.head;
				y1 = (h2 != null )? h2.value : 0;

				s1 = s1 + x1 + y1 ;
				int nv = s1 % 10 ;  
				sum.insert(nv);
				s1 = s1/10;
				
				if (h1 != null) h1 = h1.link;
		        if (h2 != null) h2 = h2.link;
			
		}
		sum.printall();	
		}
		
		
	}
	

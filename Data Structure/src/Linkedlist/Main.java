package Linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		intlinkedlist list = new intlinkedlist();
//		intlinkedlist list1 = new intlinkedlist();
//		list.insert(5);
//		list.insert(4);
//		list.insert(9);
//		list.insert(6);
//		//list.insert(7);
//		list.sort();
//		
//		list1.insert(6);
//		list1.insert(7);
//		list1.insert(1);
//		list.printall();
//		//intlinkedlist list11 = new intlinkedlist();
//		
//		//new sum(list, list1);
		
		person p1 = new person("Jigar",10);
		person p2 = new person("Jfdar",30);
		
		personlinkedlist  list = new personlinkedlist(p1);
		list.insert(p2);
		list.printall();
		
		
		
	}

}

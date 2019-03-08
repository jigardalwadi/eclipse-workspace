package Linkedlist;

public class person {
	private String name;
	private int no;
	
	public person (String name , int no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return this.name;
	}
	
	public String toString(){
		return "Name " + this.name +"  " + "Rollno " + this.no ;
		
	}
}

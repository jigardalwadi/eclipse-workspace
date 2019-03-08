package Hashset;
import java.util.*;
public class Hashset {
		private int data;
		private String name;
		
		Hashset(int item, String n){
			data = item;
			name = n;
		}
		
		public String toString()
	    {
	         return String.valueOf(this.data)+" "+String.valueOf(this.name);
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Hashset> hs = new HashSet<Hashset>();
		System.out.println(hs.hashCode());
		Hashset r = new Hashset(5,"Jigar");
		hs.add(r);
		hs.add(r);
		hs.add(new Hashset(6,"Jigr"));
		hs.add(new Hashset(6,"Jig"));
		hs.add(new Hashset(6,"Jgr"));
		hs.add(new Hashset(6,"Ji"));
		System.out.println(hs.toString());
		System.out.println(hs.hashCode());
	}
}

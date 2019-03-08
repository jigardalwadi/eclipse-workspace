import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingString {
	
	static int i;
	
	static{
		//System.out.println("static block is called");
//		i=0;
//		System.out.println(i);
//		i++;
		
	}
	
	{
		//System.out.println("non-static block is called");
		i=1;
		System.out.println(i);
		i++;
	}
	
	private static void removeDuplicate(ArrayList<String> al, String[] st1) {
		
		for(String s : st1) {
			if(al.contains(s)) {
				int index = al.indexOf(s);
				al.remove(index);
			}
		}
		//al.forEach(i -> System.out.print(i + " "));
		al.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		String testString1 = "The quick The brown fox jumps";
		String testString2 = "The brown fox";
		
		String[] st2 = testString2.split(" ");
		
		
		ComparingString comapre  =new ComparingString();
		ComparingString comapre1  =new ComparingString();
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(testString1.split(" ")));
		
		ComparingString.removeDuplicate(al,st2);
		//System.out.println(sb);
		
		
		
		
	}

	

}

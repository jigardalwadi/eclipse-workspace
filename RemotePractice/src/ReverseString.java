

public class ReverseString {

	public static void main(String[] args) {
		String st = "Reverse this string please";
		System.out.println("By words");
		String[] words = st.split(" ");
		
		String reversed = "";
		for(int i=words.length-1; i>=0;i--) {
			if(i-1>=0) {
				reversed = reversed + words[i] + " ";
			}else {	
				reversed = reversed + words[i];
			}
			
		}
		System.out.println(reversed);
		System.out.println(st.compareTo(reversed));
		System.out.println("By Characters");
		
		String[] words1 = st.split("");
		
		String reversed1 = "";
		for(int i=words1.length-1;i>=0;i--) {
			reversed1 = reversed1 + words1[i];
			
		}
		System.out.println(reversed1);
	}

}

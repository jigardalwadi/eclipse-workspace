

public class StringArrayAssignment {

	public static void main(String[] args) {

		String[] st = new String[] {"Jigar","Dalwadi","Yash","Bhatt", "Remote"};
		int stringLength = st.length;
		for(int i = 0; i< stringLength; i++) {
			System.out.print(st[i] + " ");
		}
		int start = 0;
		int end = stringLength-1;
		while(start<end) {
			String tempstring = st[start];
			st[start] = st[end];
			st[end] = tempstring;
			start++;
			end--;			
		}
		System.out.println(st.length);
		for(int i = 0; i< st.length; i++) {
			System.out.println(st[i]);
		}
		
		int[] numbers = new int[] {1,2,5,4,9,10};
		for(int i=0; i<numbers.length;i++) {
			if(i%2 == 0) {
				System.out.println(numbers[i]);
			}
		}
		
	}

}

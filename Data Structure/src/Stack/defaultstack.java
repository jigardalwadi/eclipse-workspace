package Stack;
import java.util.*;
public class defaultstack {

//	static void stackpush(Stack<Integer> stack) {
//		for(int i = 0 ; i< 5 ; i++) {
//			stack.push(i);
//		}
//	}
//	static void stackpop(Stack<Integer> stack) {
//		
//		
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(2);
		stack.push(1);
		stack.push(6);
		System.out.println("stack = "+ "  " +stack);
		stack.pop();
		System.out.println(stack+"   " +stack.search(10));
		
	}

}

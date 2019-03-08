package Stack;

public class Main {
	public static void main(String[] args) {
//		intStack intStack = new intStack();
//
//		if(!intStack.isfull()) {
//			intStack.push(2);
//			intStack.push(5);
//			intStack.push(1);
//			intStack.push(7);
//
//		}
//		System.out.println(intStack.pop());	
//		System.out.println(intStack.pop());
//			
		person person1 = new person("jigar",20);
		person person2 = new person("jigarr",10);
		
		personstack  stack = new personstack(2);
		
		stack.push(person2);
		stack.push(person1);
		
		//System.out.println(stack.pop().toString());
		System.out.println(stack.peek());
		
	}
}

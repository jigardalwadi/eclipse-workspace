package Stack;

public class intStack {
	private int[] stack;
	private int top;
	private int size; 
	
	public intStack() {
		top = -1;
		size = 50;
		stack = new int [50];
	}
	
	public intStack(int size) {
		top = -1;
		this.size = size;
		stack = new int [this.size];
	}
	
	public boolean push(int item) {
		if(!isfull()) {
			top++;
			stack[top] = item;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isfull() {
		return (top == stack.length - 1);
		
	}
	

	public int pop() {
		return stack[top--];
	}
	public boolean isempty() {
		return (top == -1);
	}
	
}

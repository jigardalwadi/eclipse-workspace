package Stack;

public class personstack {
	private person[] stack;
	private int top;
	private int size; 
	
	public personstack() {
		top = -1;
		size = 50;
		stack = new person [50];
	}
	
	public personstack(int size) {
		top = -1;
		this.size = size;
		stack = new person [this.size];
	}
	
	public boolean push(person item) {
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
	

	public person pop() {
		return stack[top--];
	}
	public person peek() {
		return stack[top];
	}
	
	public boolean isempty() {
		return (top == -1);
	}
	
}

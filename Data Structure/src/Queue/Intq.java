package Queue;

public class Intq {
	private int[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public Intq() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[size];
	}
	
	public Intq(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}
	
	public int enterq(int item) {
		if(!isfull()) {
			return item;
		}
		else {
			total++;
			q[rear] = item;
			rear++;
			return item;
		}
	}
	
	public int dequeue() {
		int item = q[front];
		total--;
		front++;
		return item;
	}
	
	
	
	public boolean isfull() {
		if(size == total) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void show() {
		int f = front;
		if(total != 0) {
			for(int i = 0; i < total; i++) {
				System.out.println(" "+ q[f]);
				f = (f+1) % size;
			}
		}
		
	}
	
	
	
}

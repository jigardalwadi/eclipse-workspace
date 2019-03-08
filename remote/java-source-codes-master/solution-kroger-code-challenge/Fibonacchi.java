
public class Fibonacchi {
	
	public static void main(String[] args) {
		System.out.println(fibanacchi(11));
	}

	static int fibanacchi(int n) {
		int[] fibonacchiNumbers = new int[n+1];
		fibonacchiNumbers[0] = 0;
		fibonacchiNumbers[1] = 1;
		for (int i = 2; i < n + 1; i++) {
			fibonacchiNumbers[i] = fibonacchiNumbers[i - 1] + fibonacchiNumbers[i - 2];
		}

		return fibonacchiNumbers[n];
	}
}

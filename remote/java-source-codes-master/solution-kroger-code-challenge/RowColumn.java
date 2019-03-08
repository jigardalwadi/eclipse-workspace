import java.util.Scanner;

public class RowColumn {

	public static void main(String[] args) {
		String[] operation = { "setcol", "setrow", "querycol", "queryrow" };

		RowColumn rc = new RowColumn(256);
		Scanner sc = new Scanner(System.in);

		try {
			while (sc.hasNextLine()) {

				String input = sc.nextLine();
				String[] params = input.split(" ");

				if (params[0].equalsIgnoreCase(operation[0]) 
						&& params.length == 3 
						&& Integer.parseInt(params[1]) < 256
						&& Integer.parseInt(params[1]) > -1 
						&& Integer.parseInt(params[2]) < 32
						&& Integer.parseInt(params[2]) > -1

				) {
					rc.setCol(Integer.parseInt(params[1]), Integer.parseInt(params[2]));
				} else if (params[0].equalsIgnoreCase(operation[1]) 
						&& params.length == 3
						&& Integer.parseInt(params[1]) < 256 
						&& Integer.parseInt(params[1]) > -1
						&& Integer.parseInt(params[2]) < 32 
						&& Integer.parseInt(params[2]) > -1) {
					rc.setRow(Integer.parseInt(params[1]), Integer.parseInt(params[2]));
				} else if (params[0].equalsIgnoreCase(operation[2]) 
						&& params.length == 2
						&& Integer.parseInt(params[1]) < 256 
						&& Integer.parseInt(params[1]) > -1) {
					System.out.println(rc.queryCol(Integer.parseInt(params[1])));
				} else if (params[0].equalsIgnoreCase(operation[3]) 
						&& params.length == 2
						&& Integer.parseInt(params[1]) < 256 
						&& Integer.parseInt(params[1]) > -1) {
					System.out.println(rc.queryRow(Integer.parseInt(params[1])));
				} else {
					System.out.println("Unsupported operation and / or arguments");
				}
			}
		} finally {
			sc.close();
		}
	}

	private int[][] ixj;
	private int dimension;

	public RowColumn(int dimension) {
		this.dimension = dimension;
		ixj = new int[dimension][dimension];
	}

	public void setRow(int rowNum, int value) {
		for (int n = 0; n < dimension; n++) {
			this.ixj[rowNum][n] = value;
		}
	}

	public void setCol(int colNum, int value) {
		for (int n = 0; n < dimension; n++) {
			this.ixj[n][colNum] = value;
		}
	}

	public int queryRow(int rowNum) {
		int temp = 0;
		for (int n = 0; n < dimension; n++) {
			temp = temp + ixj[rowNum][n];
		}
		return temp;
	}

	public int queryCol(int colNum) {
		int temp = 0;
		for (int n = 0; n < dimension; n++) {
			temp = temp + ixj[n][colNum];
		}
		return temp;
	}
}

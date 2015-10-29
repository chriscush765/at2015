package do_what;
public class Knights {

	static int steps = 1;
	static int steps2 = -1;
	int[][] board;
	int size;
	int x = 0;
	int y = 0;
	int prevX = 0;
	int prevY = 0;

	public Knights(int size) {
		board = new int[size][size];

		this.size = size;
	}

	public int[][] getBoard() {
		return board;
	}

	public void displayBoard() {
		for (int[] row : board) {
			for (int col : row)
				System.out.printf("%,3d", col);
			System.out.println();
		}
	}

	private boolean next(int i, int j) {
		prevX = i;
		prevY = j;
		int[] myHorizMove = { 0, 1, 1, -1, -1, 2, 2, -2, -2 };
		int[] myVertMove = { 0, -2, 2, -2, 2, 1, -1, -1, 1 };
		for (int c = 1; c <= 8; c++)
			if (move(i + myHorizMove[c], j + myVertMove[c]))
				return true;

		board[prevX][prevY] = 0;
		return false;
	}

	private boolean move(int i, int j) {

		// off the board
		if (i < 0 || j < 0 || i >= size || j >= size)
			return false;
		// not empty
		if (board[i][j] > 0)
			return false;
		// full
		if (steps == 64)
			return false;

		board[i][j] = steps;
		steps++;
		System.out.println(i + ", " + j + "  " + prevX + "    " + prevY + ", "
				+ steps + "  " + steps2);

		return (next(i, j));

	}

	private boolean isSafe(int x, int y) {
		if (x >= 0 && x < size && y >= 0 && y < size && board[x][y] <= 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Knights one = new Knights(8);
		one.move(0, 0);
		one.displayBoard();
	}

}

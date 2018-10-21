package oct6;

public class Client {
	public static void main(String[] args) {
		boolean[][] board = new boolean[3][3];
		long start = System.currentTimeMillis();
		// printNQueensPA(board, 1, 0, "");
//		printNQueensSS(board, 1, 1, "");
		printNKnightsSS(board, 1, 1, "");
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	static int counter = 0;

	public static void printNQueens(boolean[][] board, int cq, int lqb, String asf) {
		if (cq > board.length) {
			if (isTheBoardValid(board) == true) {
				System.out.println(++counter + ". " + asf);
			}
			return;
		}

		for (int i = lqb + 1; i <= board.length * board.length; i++) {
			int row = (i - 1) / board.length;
			int col = (i - 1) % board.length;
			if (board[row][col] == false) {
				board[row][col] = true;
				printNQueens(board, cq + 1, i, asf + i + " ");
				board[row][col] = false;
			}
		}
	}

	public static void printNQueensPA(boolean[][] board, int cq, int lqb, String asf) {
		if (cq > board.length) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int i = lqb + 1; i <= board.length * board.length; i++) {
			int row = (i - 1) / board.length;
			int col = (i - 1) % board.length;
			if (board[row][col] == false && isTheQueenSafe(board, row, col) == true) {
				board[row][col] = true;
				printNQueensPA(board, cq + 1, i, asf + i + " ");
				board[row][col] = false;
			}
		}
	}

	public static void printNQueensSS(boolean[][] board, int cq, int cb, String asf) {
		if (cq > board.length) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		if (cb > board.length * board.length) {
			return;
		}

		printNQueensSS(board, cq, cb + 1, asf); // box said no queen

		int row = (cb - 1) / board.length;
		int col = (cb - 1) % board.length;
		if (board[row][col] == false && isTheQueenSafe(board, row, col)) {
			board[row][col] = true;
			printNQueensSS(board, cq + 1, cb + 1, asf + cb + " ");
			board[row][col] = false;
		}
	}

	private static boolean isTheBoardValid(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == true) {
					if (isTheQueenSafe(board, row, col) == false) {
						return false;
					}
				}
			}
		}

		return true;
	}

	private static boolean isTheQueenSafe(boolean[][] board, int row, int col) {
		// radius
		int[][] dirs = { { -1, 0 }, // north
				{ -1, +1 }, // ne
				{ 0, +1 }, // e
				{ +1, +1 }, // se
				{ +1, 0 }, // s
				{ +1, -1 }, // sw
				{ 0, -1 }, // w
				{ -1, -1 }, // nw
		};

		for (int rad = 1; rad < board.length; rad++) {
			for (int[] dir : dirs) {
				int renemy = row + rad * dir[0];
				int cenemy = col + rad * dir[1];

				if (renemy >= 0 && renemy < board.length && cenemy >= 0 && cenemy < board.length
						&& board[renemy][cenemy] == true) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean isTheKnightSafe(boolean[][] board, int row, int col) {
		// radius
		int[][] dirs = { { -2, -1 }, // north
				{ -2, +1 }, // ne
				{ -1, -2 }, // e
				{ -1, +2 }, // se
				{ +1, -2 }, // s
				{ +1, +2 }, // sw
				{ +2, -1 }, // w
				{ +2, +1 }, // nw
		};

		for (int[] dir : dirs) {
			int renemy = row + dir[0];
			int cenemy = col + dir[1];

			if (renemy >= 0 && renemy < board.length && cenemy >= 0 && cenemy < board.length
					&& board[renemy][cenemy] == true) {
				return false;
			}
		}

		return true;
	}

	public static void printNKnightsSS(boolean[][] board, int cq, int cb, String asf) {
		if (cq > board.length) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		if (cb > board.length * board.length) {
			return;
		}

		printNKnightsSS(board, cq, cb + 1, asf); // box said no queen

		int row = (cb - 1) / board.length;
		int col = (cb - 1) % board.length;
		if (board[row][col] == false && isTheKnightSafe(board, row, col)) {
			board[row][col] = true;
			printNKnightsSS(board, cq + 1, cb + 1, asf + cb + " ");
			board[row][col] = false;
		}
	}

}

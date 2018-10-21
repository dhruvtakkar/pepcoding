package oct8;

public class Recursion {

	public static void main(String[] args) {
		// printMultiMoves(0, 0, 3, 3, "");
		// int[][] graph = {
		// {0,1,0,0,0,0,0,0},
		// {0,1,0,1,1,1,1,0},
		// {0,0,0,1,1,0,0,0},
		// {0,1,0,0,0,0,1,1},
		// {0,1,0,1,1,0,1,1},
		// {0,1,0,0,0,0,0,0},
		// };
		// boolean[][] visited = new boolean[6][8];
		// floodfill(graph, visited, 0, 0, "");
		// printPermutations(new boolean[4], 2, 0, "");
		// printPermutations(0, 4, 2, 0, "");
		// boolean[] boxes = new boolean[4];
		// printCombinations(boxes, 2, 0, -1, "");
		// printCombinations2(boxes, 2, 0, 0, "");
		boolean[][] chess = new boolean[7][7];
		long start = System.currentTimeMillis();
		printNQueens(chess, 0, 1, "");
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		// printNKnights(chess, 0, 1, "");
	}

	static int counter = 0;

	public static void printMultiMoves(int sr, int sc, int dr, int dc, String asf) {
		if (sr == dr && sc == dc) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int i = 1; i <= dc - sc; i++) {
			printMultiMoves(sr, sc + i, dr, dc, asf + "h" + i);
		}

		for (int i = 1; i <= dr - sr; i++) {
			printMultiMoves(sr + i, sc, dr, dc, asf + "v" + i);
		}

		for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
			printMultiMoves(sr + i, sc + i, dr, dc, asf + "d" + i);
		}
	}

	public static void floodfill(int[][] arr, boolean[][] visited, int sr, int sc, String asf) {
		if (sr == arr.length - 1 && sc == arr[0].length - 1) {
			System.out.println(asf);
			return;
		}

		if (IsThisAnInvalidSpot(arr, visited, sr, sc) == true) {
			return;
		}

		visited[sr][sc] = true;
		floodfill(arr, visited, sr - 1, sc, asf + "t");
		floodfill(arr, visited, sr, sc + 1, asf + "r");
		floodfill(arr, visited, sr + 1, sc, asf + "d");
		floodfill(arr, visited, sr, sc - 1, asf + "l");
		visited[sr][sc] = false;
	}

	private static boolean IsThisAnInvalidSpot(int[][] arr, boolean[][] visited, int sr, int sc) {
		if (sr < 0 || sr >= arr.length || sc < 0 || sc >= arr[0].length) {
			return true;
		} else if (arr[sr][sc] == 1) {
			return true;
		} else if (visited[sr][sc] == true) {
			return true;
		}

		return false;
	}

	public static void printPermutations(boolean[] boxes, int tq, int q, String asf) {
		if (q == tq) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int b = 0; b < boxes.length; b++) {
			if (boxes[b] == false) {
				boxes[b] = true;
				printPermutations(boxes, tq, q + 1, asf + "q" + q + "b" + b + " ");
				boxes[b] = false;
			}
		}
	}

	public static void printPermutations(int boxbm, int tb, int tq, int q, String asf) {
		if (q == tq) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int b = 0; b < tb; b++) {
			if ((boxbm & (1 << b)) == 0) {
				boxbm ^= (1 << b);
				printPermutations(boxbm, tb, tq, q + 1, asf + "q" + q + "b" + b + " ");
				boxbm ^= (1 << b);
			}
		}
	}

	public static void printCombinations(boolean[] boxes, int tq, int q, int pqb, String asf) {
		if (q == tq) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int b = pqb + 1; b < boxes.length; b++) {
			if (boxes[b] == false) {
				boxes[b] = true;
				printCombinations(boxes, tq, q + 1, b, asf + "q" + q + "b" + b + " ");
				boxes[b] = false;
			}
		}
	}

	public static void printCombinations2(boolean[] boxes, int tq, int cq, int cb, String asf) {
		if (cq == tq) {
			System.out.println(asf);
			return;
		}
		if (cb == boxes.length) {
			return;
		}

		printCombinations2(boxes, tq, cq, cb + 1, asf);
		if (boxes[cb] == false) {
			boxes[cb] = true;
			printCombinations2(boxes, tq, cq + 1, cb + 1, asf + "q" + cq + "b" + cb + " ");
			boxes[cb] = false;
		}
	}

	public static void printNQueens(boolean[][] chess, int cq, int bno, String asf) {
		if (cq == chess.length) {
			System.out.println(asf);
			return;
		}

		if (bno == chess.length * chess.length + 1) {
			return;
		}

		printNQueens(chess, cq, bno + 1, asf);
		int row = (bno - 1) / chess.length;
		int col = (bno - 1) % chess.length;
		if (chess[row][col] == false && isQueenSafe(chess, row, col)) {
			chess[row][col] = true;
			printNQueens(chess, cq + 1, bno + 1, asf + bno + "-");
			chess[row][col] = false;
		}
	}

	public static boolean isBoardValid(boolean[][] chess) {
		for (int row = 0; row < chess.length; row++) {
			for (int col = 0; col < chess.length; col++) {
				if (chess[row][col] == true && isQueenSafe(chess, row, col) == false) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isQueenSafe(boolean[][] chess, int row, int col) {
		int[][] dirs = { { -1, 0 }, // north
				{ -1, +1 }, // ne
				{ 0, +1 }, // e
				{ +1, +1 }, // se
				{ +1, 0 }, // s
				{ +1, -1 }, // sw
				{ 0, -1 }, // w
				{ -1, -1 } // nw
		};

		for (int rad = 1; rad < chess.length; rad++) {
			for (int[] dir : dirs) {
				int renm = row + rad * dir[0];
				int cenm = col + rad * dir[1];

				if (renm >= 0 && renm < chess.length && cenm >= 0 && cenm < chess.length && chess[renm][cenm] == true) {
					return false;
				}
			}
		}

		return true;
	}

	public static void printNKnights(boolean[][] chess, int cq, int bno, String asf) {
		if (cq == chess.length) {
			if (isBoardValidForKnight(chess) == true) {
				System.out.println(++counter + ". " + asf);
			}
			return;
		}

		if (bno == chess.length * chess.length + 1) {
			return;
		}

		printNKnights(chess, cq, bno + 1, asf);
		int row = (bno - 1) / chess.length;
		int col = (bno - 1) % chess.length;
		if (chess[row][col] == false) {
			chess[row][col] = true;
			printNKnights(chess, cq + 1, bno + 1, asf + bno + "-");
			chess[row][col] = false;
		}
	}

	public static boolean isBoardValidForKnight(boolean[][] chess) {
		for (int row = 0; row < chess.length; row++) {
			for (int col = 0; col < chess.length; col++) {
				if (chess[row][col] == true && isKnightSafe(chess, row, col) == false) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isKnightSafe(boolean[][] chess, int row, int col) {
		int[][] dirs = { { -2, -1 }, // north
				{ -2, +1 }, // ne
				{ -1, -2 }, // e
				{ -1, +2 }, // se
				{ +1, -2 }, // s
				{ +1, +2 }, // sw
				{ +2, -1 }, // w
				{ +2, +1 } // nw
		};

		for (int[] dir : dirs) {
			int renm = row + dir[0];
			int cenm = col + dir[1];

			if (renm >= 0 && renm < chess.length && cenm >= 0 && cenm < chess.length && chess[renm][cenm] == true) {
				return false;
			}
		}

		return true;
	}

}

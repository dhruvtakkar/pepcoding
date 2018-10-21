package sep23;

public class RecursionQstionAnswer {

	public static void main(String[] args) {
//		printSSWAscii("ab", "");
//		printMazePath(0, 0, 3, 3, "");
//		printBoardPath(0, 10, "");
//		printMultiMoves(0, 0, 2, 2, "");
		int[][] maze = new int[6][7];
		maze[0][1] = 1;
		maze[1][1] = 1;
		maze[3][1] = 1;
		maze[4][1] = 1;
		maze[5][1] = 1;
		maze[1][3] = 1;
		maze[3][3] = 1;
		maze[4][3] = 1;
		maze[1][4] = 1;
		maze[4][4] = 1;
		maze[1][5] = 1;
		maze[2][5] = 1;
		maze[4][5] = 1;
		floodfill(maze, new boolean[6][7], 0, 0, "");
	}

	public static void printSS(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSS(roq, asf + ch);
		printSS(roq, asf + "");
	}

	public static void printSSWAscii(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSSWAscii(roq, asf + ch);
		printSSWAscii(roq, asf + "");
		printSSWAscii(roq, asf + (int) ch);
	}

	public static void printKPC(String ques, String asf) {

	}

	public static void printBoardPath(int src, int dest, String psf) {
		if(src == dest){
			System.out.println(++counter + ". " + psf);
			return;
		}
		
		for(int dice = 1; dice <= 6 && src + dice <= dest; dice++){
			printBoardPath(src + dice, dest, psf + dice);
		}
	}

	static int counter = 0;
	public static void printMazePath(int sr, int sc, int dr, int dc, String psf) {
		if(sr == dr && sc == dc){
			System.out.println(++counter + ". " + psf);
			return;
		}
		
		if (sr < dr)
			printMazePath(sr + 1, sc, dr, dc, psf + "V");

		if (sc < dc)
			printMazePath(sr, sc + 1, dr, dc, psf + "H");
	}
	
	public static void printMultiMoves(int sr, int sc,
									   int dr, int dc, String psf){
		if(sr == dr && sc == dc){
			System.out.println(++counter + ". " + psf);
			return;
		}
		
		for(int i = 1; i <= dc - sc; i++){
			printMultiMoves(sr, sc + i, dr, dc, psf + "h" + i);
		}
	
		for(int i = 1; i <= dr - sr; i++){
			printMultiMoves(sr + i, sc, dr, dc, psf + "v" + i);
		}
		
		for(int i = 1; i <= dr - sr && i <= dc - sc; i++){
			printMultiMoves(sr + i, sc + i, dr, dc, psf + "d" + i);
		}
	}

	public static void floodfill(int[][] maze, boolean[][] visited, 
								 int sr, int sc, 
								 String psf){
		if(sr == maze.length - 1 && sc == maze[0].length - 1){
			System.out.println(psf);
			return;
		}		
		if(isThisAnInvalidSpot(maze, visited, sr, sc) == true){
			return;
		}		
		visited[sr][sc] = true;
		floodfill(maze, visited, sr - 1, sc, psf + "T");
		floodfill(maze, visited, sr, sc + 1, psf + "R");
		floodfill(maze, visited, sr + 1, sc, psf + "D");
		floodfill(maze, visited, sr, sc - 1, psf + "L");
		visited[sr][sc] = false;
	}
	
	private static boolean isThisAnInvalidSpot(int[][] maze, 
											   boolean[][] visited, 
											   int sr, int sc){
		return sr < 0 || 
			   sc < 0 || 
			   sr >= maze.length || 
			   sc >= maze[0].length || 
			   maze[sr][sc] == 1 || 
			   visited[sr][sc] == true;
	}
	
	public static void lexico(int currr, int limit){
		
	}
	
	
	
	
	
	
	
	
	
}

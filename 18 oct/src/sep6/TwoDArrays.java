package sep6;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] twod = {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34},
				{41, 42, 43, 44}
		};
		rotate90(twod);
		
//		int[][] m1 = {
//				{5, 0, 1},
//				{2, 4, 2}
//		};
//		
//		int[][] m2 = {
//				{1, 0, 1, 0},
//				{0, 1, 1, 1},
//				{0, 0, 1, 1}
//		};
//
//		matrixmultiply(m1, m2);
		
//		int[][] ep = {
//				{0, 0, 1, 0},
//				{1, 0, 0, 0},
//				{0, 0, 0, 0},
//				{1, 0, 1, 0}
//		};
//		exitPoint(ep);
	}

	private static void display(int[][] twod) {
		// rows = arr.length;
		// cols = arr[0].length
		for(int row = 0; row < twod.length; row++){
			for(int col = 0; col < twod[0].length; col++){
				System.out.print(twod[row][col] + " ");
			}
			System.out.println(".");
		}
	}

	private static void matrixmultiply(int[][] one, int[][] two){
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;
		
		if(c1 != r2){
			System.out.println("Not possible");
			return;
		}
		
		int[][] prd = new int[r1][c2];
		
		for(int row = 0; row < prd.length; row++){
			for(int col = 0; col < prd[row].length; col++){
				for(int k = 0; k < r2; k++){
					prd[row][col] += one[row][k] * two[k][col];
				}
			}
		}
		
		display(prd);
	}

	public static void exitPoint(int[][] arr){
		int dir = 0; // 0 is for east, 1 for s, 2 for w, 3 for n
		int r = 0;
		int c = 0;
		
		while(r >= 0 && r < arr.length && c >= 0 && c < arr[0].length){
			dir = (dir + arr[r][c]) % 4;
			if(dir == 0) { // east
				c++;
			} else if(dir == 1){ // south
				r++;
			} else if(dir == 2){ // west
				c--;
			} else { // north
				r--;
			}
		}
		
		if(dir == 0){
			c--;
		} else if(dir == 1){
			r--;
		} else if(dir == 2){
			c++;
		} else if(dir == 3){
			r++;
		}
		System.out.println(r + " " + c);
	}

	public static void rotate90(int[][] arr){
		// transpose
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr[i].length; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			int left = 0;
			int right = arr[i].length - 1;
			
			while(left < right){
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				
				left++;
				right--;
			}
		}
		
		display(arr);
	}
	
	
}

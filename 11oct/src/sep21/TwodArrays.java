package sep21;

public class TwodArrays {

	public static void main(String[] args) {
//		int[][] arr = new int[3][4];
//		
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		// rows, cols
//		System.out.println(arr.length); // rows
//		System.out.println(arr[0].length); // cols

//		int[][] mat1 = {
//				{10, 0, 1},
//				{1, 5, 0},
//		};
//		int[][] mat2 = {
//				{1, 0, 1, 0},
//				{0, 1, 1, 0},
//				{1, 1, 1, 1}
//		};
//		matrixmult(mat1, mat2);
//		int[][] mat = {
//				{0, 0, 1, 0},
//				{1, 0, 0, 0},
//				{0, 0, 0, 0},
//				{1, 0, 1, 0}
//		};
//		exitpoint(mat);
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		rotate90(arr);
	}
	
	private static void matrixmult(int[][] mat1, int[][] mat2){
		int r1 = mat1.length;
		int c1 = mat1[0].length;
		int r2 = mat2.length;
		int c2 = mat2[0].length;
		
		if(c1 != r2){
			System.out.println("Invalid");
			return;
		}
		
		int[][] res = new int[r1][c2];
		
		for(int i = 0; i < res.length; i++){
			for(int j = 0; j < res[0].length; j++){
				for(int k = 0; k < c1; k++){
					res[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		display(res);
	}
	
	public static void exitpoint(int[][] arr){
		int dir = 0; // 0123 is eswn
		int i = 0;
		int j = 0;
		
		while(i >= 0 && i < arr.length && j >= 0 && j < arr[0].length){
			dir = (dir + arr[i][j]) % 4;
			
			if(dir == 0){
				j++;
			} else if(dir == 1){
				i++;
			} else if(dir == 2){
				j--;
			} else {
				i--;
			}
		}
		
		if(i == -1){
			i++;
		} else if(i == arr.length){
			i--;
		} else if(j == -1){
			j++;
		} else if(j == arr[0].length){
			j--;
		}
		
		System.out.println(i + " " + j);
	}
	
	private static void display(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rotate90(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr[0].length; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for(int i = 0; i < arr.length; i++){
			int l = 0;
			int r = arr[i].length - 1;
			
			while(l < r){
				int temp = arr[i][l];
				arr[i][l] = arr[i][r];
				arr[i][r] = temp;
				
				l++;
				r--;
			}
		}
		
		display(arr);
	}
}

package sep2;

public class TwoD {

	public static void main(String[] args) {
		int[][] arr = {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34}
		};
		
//		System.out.println(arr.length); // rows
//		System.out.println(arr[0].length); // cols
//		System.out.println(arr[2][1]);
		display(arr);
	}
	
	public static void display(int[][] arr){
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++){
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void matrixMultiply(int[][] mat1, int[][] mat2){
		int[][] prd = new int[?][?];
		
		// check if they can be multiplied
		
		// fill prd
		
		// display mat1, mat2 and prd
	}

	
	
	
	
	
	
	
	
	
}

package sep8;

public class Client {

	public static void main(String[] args) {
		int[][] arr = {
				{11, 12, 13, 14, 15},
				{21, 22, 23, 24, 25},
				{31, 32, 33, 34, 35},
//				{41, 42, 43, 44, 45},
//				{51, 52, 53, 54, 55},
		};
		spiralD(arr);
	}
	
	public static void waveD(int[][] arr){
		for(int col = 0; col < arr[0].length; col++){
			if(col % 2 == 0){
				for(int row = 0; row < arr.length; row++){
					System.out.println(arr[row][col]);
				}
			} else {
				for(int row = arr.length - 1; row >= 0; row--){
					System.out.println(arr[row][col]);
				}
			}
		}
	}
	
	public static void spiralD(int[][] arr){
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		
		int cntr = 1;
		int tne = arr.length * arr[0].length;
		
		while(cntr <= tne){
			for(int row = minr; cntr <= tne && row <= maxr; row++){
				System.out.println(arr[row][minc]);
				cntr++;
			}
			minc++;
			
			for(int col = minc; cntr <= tne && col <= maxc; col++){
				System.out.println(arr[maxr][col]);
				cntr++;
			}
			maxr--;
			
			for(int row = maxr; cntr <= tne && row >= minr; row--){
				System.out.println(arr[row][maxc]);
				cntr++;
			}
			maxc--;
			
			for(int col = maxc; cntr <= tne && col >= minc; col--){
				System.out.println(arr[minr][col]);
				cntr++;
			}
			minr++;
		}
	}

}

package sep2;

public class rotate {

	public static void main(String[] args) {
//		int[] arr = {5, 7, 9, 12, 4, 6, 2, 18, 3};
//		int r = 3;
//		
//		reverse(arr, 0, arr.length - 1 - r);
//		reverse(arr, arr.length - r, arr.length - 1);
//		reverse(arr, 0, arr.length - 1);
//		display(arr);
//		int[] arr = {10, 20, 30};
//		printAllSubArrays(arr);
//		printAllSubsets(arr);
		
//		int[] arr = {4, 5, -12, 3, 6, -2, 5, -20, 1, 2, 8};
//		kadanes(arr);
		
		int[] board = new int[25];
		board[2] = 18;
		board[13] = 22;
		board[21] = 9;
		board[23] = 4;
		int[] dice = {2, 3, 6, 4, 1, 3, 2, 5, 4, 1, 6, 2, 3, 6, 5, 3};
		snakesAndLadders(board, dice);
		
		
		
		
		
		
		
		
		
	}
	
	public static void display(int[] arr){
		for(int val: arr){
			System.out.print(val + " ");
		}
		System.out.println(".");
	}
	
	public static void reverse(int[] arr, int lo, int hi){
		while(lo < hi){
			swap(arr, lo, hi);
			lo++;
			hi--;
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printAllSubArrays(int[] arr){
		for(int start = 0; start < arr.length; start++){
			for(int end = start; end < arr.length; end++){
				printASubArray(arr, start, end);
			}
		}
	}
	
	public static void printASubArray(int[] arr, int start, int end){
		for(int i = start; i <= end; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(".");
	}
	
	public static void printAllSubsets(int[] arr){
		for(int i = 0; i < (1 << arr.length); i++){
			for(int j = 0; j < arr.length; j++){
				int b2c = arr.length - 1 - j;
				int bm = 1 << b2c;
				if((i & (bm)) != 0){
					System.out.print(arr[j] + " ");
				}
			}
			System.out.println(".");
		}
	}
	
	public static void kadanes(int[] arr){
		int cmax = arr[0];
		int cstart = 0;
		int cend = 0;
		int omax = arr[0];
		int ostart = 0;
		int oend = 0;
		
		for(int i = 1; i < arr.length; i++){
			if(cmax >= 0){ // grow the old sequence
				cmax += arr[i];
				cend++;
			} else {
				cmax = arr[i];
				cstart = i;
				cend = i;
			}
			
			if(cmax > omax){
				omax = cmax;
				ostart = cstart;
				oend = cend;
			}
		}
		
		System.out.println(omax + " from " + ostart + " to " + oend);
	}
	
	public static void snakesAndLadders(int[] board, int[] dice){
		int pos = 0;
		
		for(int i = 0; i < dice.length; i++){
			if(pos == 0){
				if(dice[i] == 1 || dice[i] == 6){
					pos = 1;
				}
			} else {
				if(pos + dice[i] < board.length){
					pos = pos + dice[i];
					if(board[pos] != 0){
						pos = board[pos];
					}
				}
			}
		}
		
		System.out.println(pos);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

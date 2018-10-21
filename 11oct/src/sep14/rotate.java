package sep14;

public class rotate {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int d = 3;

		reverse(arr, 0, arr.length - 1 - d);
		reverse(arr, arr.length - d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
		
		for(int val: arr){
			System.out.print(val + " ");
		}
		System.out.println(".");
	}
	
	public static void reverse(int[] arr, int lo, int hi){
		while(lo < hi){
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}
}

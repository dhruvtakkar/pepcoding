package sep20;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 20, 2, 8, 76, 3, 9 };

		display(arr);
		selectionsort(arr);
		display(arr);
	}

	private static void insertionsort(int[] arr){
		for(int i = 1; i <= arr.length - 1; i++){
			for(int j = i; j > 0; j--){
				if(arr[j] < arr[j - 1]){
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}
	
	private static void selectionsort(int[] arr){
		for(int i = 1; i <= arr.length - 1; i++){
			for(int j = i; j < arr.length; j++){
				if(arr[i - 1] > arr[j]){
					swap(arr, i - 1, j);
				}
			}
		}
	}
	
	private static void bubblesort(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(".");
	}

	
}

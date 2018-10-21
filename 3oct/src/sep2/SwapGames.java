package sep2;

public class SwapGames {

	public static void main(String[] args) {
//		int one = 10;
//		int two = 20;
//		
//		System.out.println(one + " " + two);
//		swap(one, two);
//		System.out.println(one + " " + two);
		
//		int[] arr = {10, 20, 30, 40, 50};
//		System.out.println(arr[0] + " " + arr[4]);
//		swap(arr, 0, 4);
//		System.out.println(arr[0] + " " + arr[4]);
		
		
//		int[] one = {10, 20, 30};
//		int[] two = {100, 200, 300};
//		System.out.println(one[0] + " " + two[0]);
//		swap(one, two);
//		System.out.println(one[0] + " " + two[0]);
		
		
		int[] arr = {10, 20, 30};
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	
	public static void swap(int one, int two){
		System.out.println(one + " " + two);
		int temp = one;
		one = two;
		two = temp;
		System.out.println(one + " " + two);
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println(arr[i] + " " + arr[j]);
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		System.out.println(arr[i] + " " + arr[j]);
	}
	
	public static void swap(int[] one, int[] two){
		int[] temp = one;
		one = two;
		two = temp;
	}
}

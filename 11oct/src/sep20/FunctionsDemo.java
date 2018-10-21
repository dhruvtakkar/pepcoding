package sep20;

import java.net.StandardSocketOptions;

public class FunctionsDemo {

	public static void main(String[] args) {
//		int one = 10;
//		int two = 20;
//		
//		System.out.println(one + " " + two);
//		swap1(one, two);
//		System.out.println(one + " " + two);
//		int[] arr = {10, 20, 30, 40, 50};
//		int i = 0;
//		int j = 4;
//		
//		System.out.println(arr[i] + " " + arr[j]);
//		swap2(arr, i, j);
//		System.out.println(arr[i] + " " + arr[j]);
		
//		int[] one = {10, 20, 30};
//		int[] two = {100, 200, 300};
//		
//		System.out.println(one[0] + " " + two[0]);
//		swap3(one, two);
//		System.out.println(one[0] + " " + two[0]);
		
		int[] arr = {10, 20, 30};
		System.out.println(arr[0] + " " + arr[2]);
		swap1(arr[0], arr[2]);
		System.out.println(arr[0] + " " + arr[2]);
	} 

	private static void swap1(int one, int two){
		int temp = one;
		one = two;
		two = temp;
	}
	
	private static void swap3(int[] one, int[] two){
		int[] temp = one;
		one = two;
		two = temp;
	}
	
	private static void swap2(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	

	
	

}

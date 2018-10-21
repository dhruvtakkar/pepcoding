package sep14;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		
		System.out.println(arr.length);
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i]);
//		}
		
		for(int val: arr){
			System.out.println(val);
		}
	}

}

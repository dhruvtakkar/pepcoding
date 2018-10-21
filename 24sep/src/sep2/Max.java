package sep2;

public class Max {

	public static void main(String[] args) {
		int[] arr = {10, 50, 100, 20, 99, 33, 66};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}

}

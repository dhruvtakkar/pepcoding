package sep14;

public class max {

	public static void main(String[] args) {
		int[] arr = {55, 1, 11, 57, 22, 29, 43};
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}

}

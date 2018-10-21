package sep2;

public class inverse {

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 0, 1};
		int[] inv = new int[arr.length];
		
		// fil inv
		for(int i = 0; i < arr.length; i++){
			int val = arr[i];
			inv[val] = i;
		}
		
		for(int val: inv){
			System.out.print(val + " ");
		}
	}

}

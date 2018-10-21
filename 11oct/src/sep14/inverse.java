package sep14;

public class inverse {

	public static void main(String[] args) {
		int[] arr = {2, 3, 1, 0, 4};
		int[] inv = new int[arr.length];
		
		for(int a = 0; a < arr.length; a++){
			inv[arr[a]] = a;
		}
		
		for(int val: inv){
			System.out.println(val);
		}
	}

}

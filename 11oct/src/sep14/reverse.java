package sep14;

public class reverse {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

		int lo = 0;
		int hi = arr.length - 1;
		while(lo < hi){
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			
			lo++;
			hi--;
		}
		
		for(int val: arr){
			System.out.println(val);
		}
	}

}

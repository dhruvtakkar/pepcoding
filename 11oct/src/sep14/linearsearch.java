package sep14;

public class linearsearch {

	public static void main(String[] args) {
		int[] arr = {55, 1, 11, 57, 22, 29, 43};
		int data = 22;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == data){
				System.out.println(i);
				return;
			}
		}
		
		System.out.println("-1");
	}

}

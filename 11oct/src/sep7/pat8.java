package sep7;

public class pat8 {

	public static void main(String[] args) {
		int n = 4;

		int spaces = 2 * n - 2;
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= stars; j++){
				System.out.print("*");
			}
			
			for(int j = 1; j <= spaces; j++){
				System.out.print(" ");
			}
			
			for(int j = 1; j <= stars; j++){
				System.out.print("*");
			}
			
			stars++;
			spaces -= 2;
			System.out.println();
		}
	}

}

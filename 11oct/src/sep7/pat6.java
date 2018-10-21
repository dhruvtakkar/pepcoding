package sep7;

public class pat6 {

	public static void main(String[] args) {
		int n = 7;

		int csp = (n - 1) / 2;
		int cst = 1;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= csp; j++){
				System.out.print(" ");
			}
			
			for(int j = 1; j <= cst; j++){
				System.out.print("*");
			}
			
			if(i <= n / 2){
				csp--;
				cst += 2;
			} else {
				csp++;
				cst -= 2;
			}
			System.out.println();
		}
	}

}

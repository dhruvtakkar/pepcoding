package sep7;

public class pat1 {

	public static void main(String[] args) {
		int n = 5;
		
		int row = 1;
		while(row <= n){
			int col = 1;
			while(col <= row){
				System.out.print("*");
				col++;
			}
			
			System.out.println();
			row++;
		}
	}

}

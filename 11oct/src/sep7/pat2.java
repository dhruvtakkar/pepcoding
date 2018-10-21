package sep7;

public class pat2 {

	public static void main(String[] args) {
		int n = 5;
		
		int val = 1;
		
		int row = 1;
		while(row <= n){
			int col = 1;
			while(col <= row){
				System.out.print(val + "\t");
				val++;
				col++;
			}
			
			System.out.println();
			row++;
		}
	}

}

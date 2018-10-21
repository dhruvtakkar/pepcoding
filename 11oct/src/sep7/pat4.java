package sep7;

public class pat4 {

	public static void main(String[] args) {
		int n = 6;
		
		int row = 0;
		while(row < n){
			int nck = 1;
			
			int col = 0;
			while(col <= row){
				System.out.print(nck + " ");
				nck = nck * (row - col) / (col + 1); 
				col++;
			}
			
			System.out.println();
			row++;
		}
	}

}

package sep7;

public class pat3 {

	public static void main(String[] args) {
		int n = 5;

		int a = 0;
		int b = 1;
		
		int row = 1;
		while(row <= n){
			int col = 1;
			while(col <= row){
				System.out.print(a + " ");
				
				int c = a + b;
				a = b;
				b = c;
				
				col++;
			}
			
			System.out.println();
			row++;
		}
	}

}

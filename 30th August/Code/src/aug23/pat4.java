package aug23;

import java.util.Scanner;

public class pat4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int cntr = 0;
		
		while(cntr < n){
			int col = 0;
			int val = 1;
			
			while(col <= cntr){
				System.out.print(val + "  ");
				val = val * (cntr - col) / (col + 1);
				col++;
			}
			
			System.out.println();
			cntr++;
		}
	}

}

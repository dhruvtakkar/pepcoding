package aug23;

import java.util.Scanner;

public class pat5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = scn.nextInt();

		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= n) {
				if (row == col || row + col == n + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

				col++;
			}

			System.out.println();
			row++;
		}
	}

}

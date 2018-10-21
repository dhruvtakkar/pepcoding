package sep12;

import java.util.Scanner;

public class Unique {

	// 9 18 2 19 7 19 2 18 6 6
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of numbers ");
		int n = scn.nextInt();
		
		int unique = 0;
		for(int i = 0; i < n; i++){
			System.out.println("Enter the " + i + "th number ");
			int num = scn.nextInt();
			unique = unique ^ num;
		}
		
		System.out.println(unique);
	}

}

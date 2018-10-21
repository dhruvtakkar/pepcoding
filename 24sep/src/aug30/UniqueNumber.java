package aug30;

import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the count of number ");
		int n = scn.nextInt();
		
		int unique = 0;
		for(int i = 1; i <= n; i++){
			System.out.println("ENter " + i + "th number ");
			int num = scn.nextInt();
			
			unique = unique ^ num;
		}
		
		System.out.println(unique);
		
	}

}

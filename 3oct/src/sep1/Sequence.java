package sep1;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the count of numbers");
		int n = scn.nextInt();

		System.out.println("Enter the first number ");
		int prev = scn.nextInt();
		
		System.out.println("Enter the second number ");
		int curr = scn.nextInt();
		
		boolean goingDown = curr < prev;
		
		for(int i = 3; i <= n; i++){
			prev = curr;
			System.out.println("Enter the " + i + "th number ");
			curr = scn.nextInt();
			
			// area
			if(goingDown == true){
				if(curr > prev){
					goingDown = false;
				}
			} else {
				if(curr < prev){
					System.out.println("Invalid");
					return;
				}
			}
			// area
		}
		
		System.out.println("Valid");
	}

	
	
	
	
	
	
}

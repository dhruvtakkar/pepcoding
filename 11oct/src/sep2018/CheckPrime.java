package sep2018;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int div = 2;
		while(div * div <= n){
			if(n % div == 0){
				System.out.println("Not prime");
				return;
			} 
			div++;
		}
		
		System.out.println("Prime");
	}

}

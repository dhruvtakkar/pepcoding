package sep2018;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		int n = scn.nextInt();
		
		int counter = 1;
		
		while(counter <= n){
			System.out.println(counter);
			counter++;
		}
		
		System.out.println("done");
	}

}

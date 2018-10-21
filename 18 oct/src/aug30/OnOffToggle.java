package aug30;

import java.util.Scanner;

public class OnOffToggle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = scn.nextInt();
		
		System.out.println("Enter the bit number");
		int k = scn.nextInt();
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		int bm = 1 << k;
		int on = n | bm; // 1 sets, 0 ineffective
		int off = n & (~bm); // 0 resets, 1 ineffective
		int toggle = n ^ bm; // 1 toggles, 0 ineffective
		
		System.out.println(on + " = " + Integer.toBinaryString(on));
		System.out.println(off + " = " + Integer.toBinaryString(off));
		System.out.println(toggle + " = " + Integer.toBinaryString(toggle));
	}

}

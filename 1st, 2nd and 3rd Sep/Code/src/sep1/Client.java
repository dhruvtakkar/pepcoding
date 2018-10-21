package sep1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
//		char ch = 'a';
//		int i = ch;
//		System.out.println(i);
//		
//		
//		ch++;
//		System.out.println(ch);
//		
//		
//		i = ch + 2;
//		System.out.println(i);
//		
//		ch = (char)(ch + 1);
//		System.out.println(ch);
//		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scn.nextLine().charAt(0);
		char nch = ' ';
		
		// print case without using asciis
		if(ch >= 'a' && ch <= 'z'){
			System.out.println("lower");
			nch = (char)(ch - 'a' + 'A');
		} else if(ch >= 'A' && ch <= 'Z'){
			System.out.println("upper");
			nch = (char)(ch - 'A' + 'a');
		} else {
			System.out.println("invalid");
		}
		
		System.out.println(nch);
	}
	


}

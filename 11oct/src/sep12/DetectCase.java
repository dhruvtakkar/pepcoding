package sep12;

import java.util.Scanner;

public class DetectCase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.nextLine().charAt(0);
		
		if(ch >= 'a' && ch <= 'z'){
			System.out.println("lower case");
			char uc = (char)(ch - 'a' + 'A');
			System.out.println(uc);
		} else if(ch >= 'A' && ch <= 'Z'){
			System.out.println("upper case");
			char lc = (char)(ch - 'A' + 'a');
			System.out.println(lc);
		} else {
			System.out.println("invalid");
		}
	}

}

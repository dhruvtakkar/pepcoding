package sep12;

public class BitOps {

	public static void main(String[] args) {
		int n = -400;
		int k = 7; // 0 to 31
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		int bm = 1 << k;
		int n1 = n | bm;
		int n2 = n & (~bm);
		int n3 = n ^ bm;
		
		System.out.println(n1 + " = " + Integer.toBinaryString(n1));
		System.out.println(n2 + " = " + Integer.toBinaryString(n2));
		System.out.println(n3 + " = " + Integer.toBinaryString(n3));
	}

}

package sep12;

public class CheckBit {

	public static void main(String[] args) {
		int n = -400;
		int k = 6; // 0 to 31
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
		int bm = 1 << k;
		if((n & bm) == bm){
			System.out.println("On");
		} else {
			System.out.println("Off");
		}
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
	}

}

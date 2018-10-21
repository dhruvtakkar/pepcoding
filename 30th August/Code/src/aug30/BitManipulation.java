package aug30;

public class BitManipulation {

	public static void main(String[] args) {
		int n = -56;
		System.out.println(n + " = " + Integer.toBinaryString(n));
		int k = 5;
		
		int bitmask = 1 << k;
		if((n & bitmask) == bitmask){
			System.out.println("On");
		} else {
			System.out.println("Off");
		}
		
		System.out.println(n + " = " + Integer.toBinaryString(n));
		
	}

}

package aug30;

public class FunWithDataTypes {

	public static void main(String[] args) {
		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;
		
//		by = sh;
//		by = in;
//		by = lo;
		
		by = 10; // 10 is an integer, auto - type cast
		by = 127;
		by = (byte)-250;

		System.out.println(by);
		
	
	}

}

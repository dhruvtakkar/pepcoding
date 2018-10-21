package sep10;

public class d2b {

	public static void main(String[] args) {
		int dec = 57;
		int bin = 0;
		int pow = 1;
		
		while(dec != 0){
			int rem = dec % 2;
			dec = dec / 2;
			bin = bin + rem * pow;
			pow = pow * 10;
		}
		
		System.out.println(bin);
	}

}

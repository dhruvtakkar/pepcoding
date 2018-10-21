package aug25;

public class Bin2Dec {

	public static void main(String[] args) {
		int dec = 111001;
		int bin = 0;
		int power = 1; // 10 raise to power 0
		
		while(dec != 0){
			int rem = dec % 10;
			dec = dec / 10;
			bin = bin + (rem * power);
			power = power * 2;
		}
		
		System.out.println(bin);
	}

}

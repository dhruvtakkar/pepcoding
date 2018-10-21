package aug25;

public class Client {

	public static void main(String[] args) {
		int dec = 57;
		int bin = 0;
		int power = 1; // 10 raise to power 0
		
		while(dec != 0){
			int rem = dec % 2;
			dec = dec / 2;
			bin = bin + (rem * power);
			power = power * 10;
		}
		
		System.out.println(bin);
	}

}

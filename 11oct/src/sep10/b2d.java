package sep10;

public class b2d {

	public static void main(String[] args) {
		int bin = 111001;
		int dec = 0;
		int pow = 1;
		
		while(bin != 0){
			int rem = bin % 10;
			bin = bin / 10;
			dec = dec + rem * pow;
			pow = pow * 2;
		}
		
		System.out.println(dec);
	}

}

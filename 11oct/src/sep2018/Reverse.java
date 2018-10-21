package sep2018;

public class Reverse {

	public static void main(String[] args) {
		int n = 92785463;
		
		while(n != 0){
			int q = n / 10;
			int r = n % 10;
			
			System.out.print(r);
			n = q;
		}
	}

}

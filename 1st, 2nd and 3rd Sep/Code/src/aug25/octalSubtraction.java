package aug25;

public class octalSubtraction {

	public static void main(String[] args) {
		int n1 = 1110;
		int n2 = 111;
		
		int borrow = 0;
		int sum = 0;
		int power = 1;
		
		while(n1 != 0 || n2 != 0){
			int d1 = n1 % 10;
			n1 = n1 / 10;
			
			int d2 = n2 % 10;
			n2 = n2 / 10;
			
			d1 = d1 - borrow;
			if(d1 >= d2){
				borrow = 0;
			} else {
				borrow = 1;
				d1 = d1 + 8;
			}
			int d = d1 - d2;
		
			sum = sum + d * power;
			power = power * 10;
		}
		
		System.out.println(sum);
	}

}

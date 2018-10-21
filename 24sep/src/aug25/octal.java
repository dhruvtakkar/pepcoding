package aug25;

public class octal {

	public static void main(String[] args) {
		int n1 = 777;
		int n2 = 111;
		
		int carry = 0;
		int sum = 0;
		int power = 1;
		
		while(n1 != 0 || n2 != 0 || carry != 0){
			int d1 = n1 % 10;
			n1 = n1 / 10;
			
			int d2 = n2 % 10;
			n2 = n2 / 10;
			
			int d = d1 + d2 + carry;
			carry = d / 8;
			d = d % 8;
		
			sum = sum + d * power;
			power = power * 10;
		}
		
		System.out.println(sum);
	}

}

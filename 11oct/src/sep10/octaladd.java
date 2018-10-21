package sep10;

public class octaladd {

	public static void main(String[] args) {
		int o1 = 5762;
		int o2 = 777;
		
		int c = 0;
		int p = 1;
		int s = 0;
		while(o1 != 0 || o2 != 0 || c != 0){
			int r1 = o1 % 10;
			int r2 = o2 % 10;
			o1 = o1 / 10;
			o2 = o2 / 10;
			
			int r = r1 + r2 + c;
			int d = r % 8;
			c = r / 8;
			
			s = s + d * p;
			p = p * 10;
		}
		
		System.out.println(s);
	}

}

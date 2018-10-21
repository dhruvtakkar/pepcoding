package sep10;

public class octalsub {

	public static void main(String[] args) {
		int o1 = 5762;
		int o2 = 777;
		
		int c = 0;
		int p = 1;
		int diff = 0;
		while(o1 != 0 || o2 != 0){
			int r1 = o1 % 10;
			int r2 = o2 % 10;
			o1 = o1 / 10;
			o2 = o2 / 10;
			
			int r = r1 - r2 - c;
			int d = r < 0? r + 8: r;
			c = r < 0? 1: 0;
			
			diff = diff + d * p;
			p = p * 10;
		}
		
		System.out.println(diff);
	}

}

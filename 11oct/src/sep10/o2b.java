package sep10;

public class o2b {

	public static void main(String[] args) {
		int b = 111101110;
		int o = 0;
		int p = 1;
		
		while(b != 0){
			int r = b % 1000;
			b = b / 1000;
			
			if(r == 0){
				r = 0;
			} else if(r == 1){
				r = 1;
			} else if(r == 10){
				r = 2;
			} else if(r == 11){
				r = 3;
			} else if(r == 100){
				r = 4;
			} else if(r == 101){
				r = 5;
			} else if(r == 110){
				r = 6;
			} else if(r == 111){
				r = 7;
			}
			
			o = o + r * p;
			p = p * 10;
		}
		
		System.out.println(o);
	}

}

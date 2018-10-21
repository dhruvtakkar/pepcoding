package sep10;

public class b2o {

	public static void main(String[] args) {
		int o = 756;
		int b = 0;
		int p = 1;
		
		while(o != 0){
			int r = o % 10;
			o = o / 10;
			
			if(r == 0){
				r = 0;
			} else if(r == 1){
				r = 1;
			} else if(r == 2){
				r = 10;
			} else if(r == 3){
				r = 11;
			} else if(r == 4){
				r = 100;
			} else if(r == 5){
				r = 101;
			} else if(r == 6){
				r = 110;
			} else if(r == 7){
				r = 111;
			}
			
			b = b + r * p;
			p = p * 1000;
		}
		
		System.out.println(b);
	}

}

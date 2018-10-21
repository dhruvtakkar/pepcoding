package aug25;

public class bin2oct {

	public static void main(String[] args) {
		int bin = 110100010;
		int oct = 0;
		
		int power = 1;
		while(bin != 0){
			int rem = bin % 1000;
			bin = bin / 1000;
			
			if(rem == 0){
				rem = 0;
			} else if(rem == 1){
				rem = 1;
			} else if(rem == 10){
				rem = 2;
			} else if(rem == 11){
				rem = 3;
			} else if(rem == 100){
				rem = 4;
			} else if(rem == 101){
				rem = 5;
			} else if(rem == 110){
				rem = 6;
			} else if(rem == 111){
				rem = 7;
			}
			
			oct = oct + rem * power;
			power = power * 10;
		}
		
		System.out.println(oct);
	}

}

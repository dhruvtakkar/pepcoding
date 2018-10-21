package sep1;

public class DecimalTypes {

	public static void main(String[] args) {
//		float fl = 2.5;
//		double db = 2.5;
//		float fl = 2.5F;
		
//		int i = 2;
//		float fl = i;
//		
//		fl = 2.5F;
//		i = (int)fl;
		
//		System.out.println(10 + ' ' + 20);
//		System.out.println(10 + " " + 20);
//		System.out.println(10 + 20 + "Hello" + 10 + 20);
		
		int minf = 0;
		int maxf = 300;
		int step = 20;
		
		for(int far = minf; far <= maxf; far += step){
			int cel = (int)(5.0 / 9 * (far - 32));
			System.out.println(far + " " + cel);
		}
	}

}

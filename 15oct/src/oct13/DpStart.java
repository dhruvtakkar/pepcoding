package oct13;

public class DpStart {

	public static void main(String[] args) {
		int n = 30;
		long start = System.currentTimeMillis();
//		System.out.println(FibM(n, new int[n + 1]));
//		System.out.println(FibT(n));
		
//		System.out.println(cbp(0, n));
//		System.out.println(cbpm(0, n, new int[n + 1]));
//		System.out.println(cbpts(n));
//		System.out.println(cmpt(3, 3));
//		int[][] arr = {
//				{1 , 2, 5, 3, 5},
//				{4, 2, 2, 6, 0},
//				{0, 8, 1, 1, 4},
//				{4, 0, 2, 5, 100},
//				{0, 2, 6, 7, 1}
//		};
//		System.out.println(mcpt(arr));
		int[][] arr = {
				{2, 1, 3, 10, 2},
				{6, 0, 8, 1, 8},
				{3, 9, 5, 6, 7},
				{4, 2, 4, 7, 4},
				{1, 5, 0, 2, 3},
		};
		System.out.println(goldmine(arr));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static int Fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
		
		int fnm1 = Fib(n - 1);
		int fnm2 = Fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}
	
	public static int FibM(int n, int[] qb){
		if(n == 0 || n == 1){
			return n;
		}
		
		if(qb[n] != 0){
			return qb[n];
		}
		
		int fnm1 = FibM(n - 1, qb);
		int fnm2 = FibM(n - 2, qb);
		int fn = fnm1 + fnm2;
		
		qb[n] = fn;
		return fn;
	}

	public static int FibT(int n){
		int[] f = new int[n + 1];
		
		f[0] = 0;
		f[1] = 1;
		
		for(int x = 2; x <= n; x++){
			f[x] = f[x - 1] + f[x - 2];
		}
		
		return f[n];
	}
	
	public static int cbp(int s, int d){
		if(s == d){
			return 1;
		}
		
		int cstod = 0;
		
		for(int dice = 1; dice <= 6 &&  s + dice <= d; dice++){
			int i = s + dice;
			int citod = cbp(i, d);
			cstod += citod;
		}
		
		return cstod;
	}
	
	public static int cbpm(int s, int d, int[] qb){
		if(s == d){
			return 1;
		}
		if(qb[s] != 0){
			return qb[s];
		}
		
		int cstod = 0;
		for(int dice = 1; dice <= 6 &&  s + dice <= d; dice++){
			int i = s + dice;
			int citod = cbpm(i, d, qb);
			cstod += citod;
		}
		qb[s] = cstod;
		return cstod;
	}
	
	public static int cbpt(int d){
		int[] f = new int[d + 1];
		
		f[d] = 1;
		for(int x = d - 1; x >= 0; x--){
			for(int dice = 1; dice <= 6 && x + dice <= d; dice++){
				f[x] += f[x + dice];
			}
		}
		
		return f[0];
	}
	
	public static int cbpts(int d){
		int[] s = new int[6];

		s[0] = 1;
		for(int slides = 1; slides <= d; slides++){
			int nv = s[0] + s[1] + s[2] + s[3] + s[4] + s[5];
			s[5] = s[4];
			s[4] = s[3];
			s[3] = s[2];
			s[2] = s[1];
			s[1] = s[0];
			s[0] = nv;
		}
		
		return s[0];
	}
	
	public static int cmpt(int r, int c){
		int[][] strg = new int[r + 1][c + 1];
		
		for(int i = r; i >= 0; i--){
			for(int j = c; j >= 0; j--){
				if(i == r && j == c){
					strg[i][j] = 1;
				} else if(i == r){
					strg[i][j] = strg[i][j + 1];
				} else if(j == c){
					strg[i][j] = strg[i + 1][j];
				} else {
					strg[i][j] = strg[i][j + 1] + strg[i + 1][j];
				}
			}
		}
		
		return strg[0][0];
	}
	
	public static int mcpt(int[][] arr){
		int[][] strg = new int[arr.length][arr[0].length];
		
		for(int i = strg.length - 1; i >= 0; i--){
			for(int j = strg[0].length - 1; j >= 0; j--){
				if(i == strg.length - 1 && j == strg[0].length - 1){
					strg[i][j] = arr[i][j];
				} else if(i == strg.length - 1){
					strg[i][j] = arr[i][j] + strg[i][j + 1];
				} else if(j == strg[0].length - 1){
					strg[i][j] = arr[i][j] + strg[i + 1][j];
				} else {
					strg[i][j] = arr[i][j] + 
								 Math.min(strg[i][j + 1], strg[i + 1][j]);
				}
			}
		}
		
		return strg[0][0];
	}
	
	public static int goldmine(int[][] arr){
		int[][] strg = new int[arr.length][arr[0].length];
		
		for(int j = arr[0].length - 1; j >= 0; j--){
			for(int i = 0; i < arr.length; i++){
				if(j == arr[0].length - 1){
					strg[i][j] = arr[i][j];
				} else {
					if(i == 0){
						strg[i][j] = arr[i][j] + 
						Math.max(strg[i][j + 1], 
								 strg[i + 1][j + 1]);
					} else if(i == arr.length - 1){
						strg[i][j] = arr[i][j] + 
						Math.max(strg[i - 1][j + 1],
								 strg[i][j + 1]);
					} else {
						strg[i][j] = arr[i][j] + 
								Math.max(strg[i - 1][j + 1],
								Math.max(strg[i][j + 1], 
									     strg[i + 1][j + 1]));
					}
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < strg.length; i++){
			max = Math.max(max, strg[i][0]);
		}
		
		return max;
	}
	
}

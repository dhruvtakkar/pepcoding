package oct14;

public class DPContinued {

	public static void main(String[] args) {
//		int[][] arr = {
//				{1,0,1,0,1,1,1},
//				{1,0,1,1,0,1,1},
//				{1,1,1,1,0,1,0},
//				{0,1,1,1,1,0,0},
//				{1,0,1,1,1,1,1},
//				{1,1,1,1,1,1,0},
//				{1,0,0,1,1,0,0},
//				{1,0,1,1,1,0,1}
//		};
//		largestonesquarematrix(arr);
//		countPalindromicSS("abccbc");
//		String s = "aslkdfjlaksdjfkasldjf";
//		System.out.println(minimumPalindromicCut(s, 0, s.length() - 1));
//		System.out.println(minimumPalindromicCutMem(s, 0, s.length() - 1, 
//							new Integer[s.length()][s.length()]));
		int[] dims = {10, 20, 30, 40, 50, 60};
//		System.out.println(mcm(dims, 0, dims.length - 1));
		mcmtab(dims);
	}
	
	public static void largestonesquarematrix(int[][] arr){
		int[][] strg = new int[arr.length][arr[0].length];
		int maxi = strg.length - 1, maxj = strg[0].length - 1;
		
		for(int i = strg.length - 1; i >= 0; i--){
			for(int j = strg[0].length - 1; j >= 0; j--){
				if(i == strg.length - 1 && j == strg[0].length - 1){
					strg[i][j] = arr[i][j];
				} else if(i == strg.length - 1){
					strg[i][j] = arr[i][j];
				} else if(j == strg[0].length - 1){
					strg[i][j] = arr[i][j];
				} else {
					if(arr[i][j] == 1){
						int rp1 = i + 1;
						int cp1 = j + 1;
						strg[i][j] = 1 + Math.min(strg[rp1][j], 
										 Math.min(strg[rp1][cp1], 
												  strg[i][cp1]));
						
						if(strg[i][j] > strg[maxi][maxj]){
							maxi = i;
							maxj = j;
						}
					}
				}
			}
		}
		
		System.out.println(strg[maxi][maxj] + " at [" + maxi + ", " + maxj + "]");
	}

	public static void countPalindromicSS(String s){
		boolean[][] strg = new boolean[s.length()][s.length()];
		
		for(int gap = 0; gap <= s.length() - 1; gap++){
			for(int i = 0; i + gap < s.length(); i++){
				int j = i + gap;
				
				if(gap == 0){
					strg[i][j] = true;
				} else if(gap == 1){
					strg[i][j] = s.charAt(i) == s.charAt(j);
				} else {
					strg[i][j] = s.charAt(i) == s.charAt(j) &&
							     strg[i + 1][j - 1];
				}
				
				if(strg[i][j]){
					System.out.println(s.substring(i, j + 1));
				}
			}
		}
	}

	public static int minimumPalindromicCut(String s, int i, int j){
		if(IsPalindrome(s, i, j) == true){
			return 0;
		}
		
		int mic = Integer.MAX_VALUE;
		for(int cp = i; cp < j; cp++){
			int c1 = minimumPalindromicCut(s, i, cp);
			int c2 = minimumPalindromicCut(s, cp + 1, j);
			int tc = c1 + c2 + 1;
			mic = Math.min(mic, tc);
		}
		
		return mic;
	}

	public static int minimumPalindromicCutMem(String s, int i, int j, 
											   Integer[][] qb){
		if(IsPalindrome(s, i, j) == true){
			return 0;
		}
		
		if(qb[i][j] != null){
			return qb[i][j];
		}
		
		int mic = Integer.MAX_VALUE;
		for(int cp = i; cp < j; cp++){
			int c1 = minimumPalindromicCutMem(s, i, cp, qb);
			int c2 = minimumPalindromicCutMem(s, cp + 1, j, qb);
			int tc = c1 + c2 + 1;
			mic = Math.min(mic, tc);
		}
		
		qb[i][j] = mic;
		return mic;
	}

	public static int mcm(int[] dims, int i, int j){
		if(j == i + 1){
			return 0;
		}
		
		int mic = Integer.MAX_VALUE;
		for(int cp = i + 1; cp <= j - 1; cp++){
			int c1 = mcm(dims, i, cp);
			int c2 = mcm(dims, cp, j);
			int muc = dims[i] * dims[cp] * dims[j];
			int tc = c1 + c2 + muc;
			mic = Math.min(mic, tc);
		}
		return mic;
	}
	
	private static boolean IsPalindrome(String s, int i, int j) {
		int left = i;
		int right = j;
		while(left < right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}

	public static void mcmtab(int[] dims){
		int[][] strg = new int[dims.length - 1][dims.length - 1];
		
		for(int d = 0; d <= strg.length - 1; d++){
			for(int i = 0; i + d < strg.length; i++){
				int j = i + d;
				if(d == 0){
					strg[i][j] = 0;
				} else {
					int mic = Integer.MAX_VALUE;
					
					for(int k = 1; k <= d; k++){
						int c1 = strg[i][i + k - 1];
						int c2 = strg[i + k][j];
						int muc = dims[i] * dims[i + k] * dims[j + 1];
						int tc = c1 + c2 + muc;
						mic = Math.min(mic, tc);
					}
					
					strg[i][j] = mic;
				}
			}
		}
		
		System.out.println(strg[0][strg.length - 1]);
	}
}







package sep8;

public class StringClient {

	public static void main(String[] args) {
//		String s = "abccbc";
//		System.out.println(s.length());
//		System.out.println(s.charAt(0));
//		System.out.println(s.substring(2, 4));
//		System.out.println(s.substring(2, 3));
//		System.out.println(s.substring(2, 2));
//		System.out.println(s.substring(2, 5));
//		printChars(s);
//		printSS(s);
//		System.out.println(isPalindrome(s));
//		printAllPalindromicSS(s);
		printPermutations("abcd");
	}

	public static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printSS(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				System.out.println(ss);
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	public static void printAllPalindromicSS(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				boolean test = isPalindrome(ss);
				if (test == true) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void printPermutations(String s){
		int limit = 1;
		for(int i = 1; i <= s.length(); i++){
			limit *= i;
		}
		
		for(int i = 0; i < limit; i++){
			int info = i;
			
			String ques = s;
			String ans = "";
			for(int div = s.length(); div >= 1; div--){
				int r = info % div;
				info = info / div;
				
				ans += ques.charAt(r);
				ques = ques.substring(0, r) + ques.substring(r + 1);
			}
			
			System.out.println(ans);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

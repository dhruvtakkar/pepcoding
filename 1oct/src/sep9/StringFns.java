package sep9;

public class StringFns {

	public static void main(String[] args) {
//		printChars("hello");
//		printSS("abc");
//		System.out.println(isPalindrome("malayalam"));
//		printPalindromicSS("abccbc");
//		printPermutation("abc");
	}

	public static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printSS(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static boolean isPalindrome(String s) {
		int l = 0;
		int r = s.length() - 1;

		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}

			l++;
			r--;
		}

		return true;
	}

	public static void printPalindromicSS(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (isPalindrome(s.substring(i, j))) {
					System.out.println(s.substring(i, j));
				}
			}
		}
	}

	public static void printPermutation(String s) {
		int lim = 1;
		for(int i = 1; i <= s.length(); i++){
			lim *= i;
		}
		
		for(int i = 0; i < lim; i++){
			int t = i;
			String q = s;
			String a = "";
			
			for(int j = s.length(); j >= 1; j--){
				int r = t % j;
				t = t / j;
				a = a + q.charAt(r);
				q = q.substring(0, r) + q.substring(r + 1);
			}
			
			System.out.println(a);
		}
	}
}

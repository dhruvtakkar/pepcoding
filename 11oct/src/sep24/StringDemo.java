package sep24;

public class StringDemo {

	public static void main(String[] args) {
		// String s = "hello";
		//
		// System.out.println(s.charAt(0)); // s[0]
		// System.out.println(s.length()); // arr.length
		//
		// System.out.println(s.substring(1, 4));
		// System.out.println(s.substring(1));
		// printChars("hello");
		// printAllSubstrings("abcd");
		// System.out.println(isPalindrome("nitin"));
		// printAllPalindromicSubstrings("abccbc");
		// comparisonDemo();
		// performanceCheckInt();
		performanceCheckString();
	}

	public static void comparisonDemo() {
		String s1 = "hello";
		String s2 = s1; // normal ref copy
		String s3 = "hello"; // interning
		String s4 = new String("hello");

		System.out.println((s1 == s2) + " " + s1.equals(s2));
		System.out.println((s1 == s3) + " " + s1.equals(s4));
		System.out.println((s1 == s4) + " " + s1.equals(s4));
	}

	public static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printAllSubstrings(String s) {
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

	// abccbc
	public static void printAllPalindromicSubstrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String ss = s.substring(i, j);
				boolean check = isPalindrome(ss);
				if (check == true) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void performanceCheckInt() {
		long start = System.currentTimeMillis();

		int sum = 0;
		for (int i = 1; i < 100000; i++) {
			sum = sum + i;
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void performanceCheckString() {
		long start = System.currentTimeMillis();

		String sum = "hello";
		// StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 65000; i++) {
			 sum = sum + i;
			// sb.append(i);
		}

		System.out.println(sum);

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

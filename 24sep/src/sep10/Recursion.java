package sep10;

public class Recursion {

	public static void main(String[] args) {
//		pd(5);
//		pi(5);
//		pdi(5);
//		pzz(3);
//		toh("a", "b", "c",3);
//		System.out.println(factorial(5));
//		System.out.println(power(2, 5));
		System.out.println(smartpower(2, 5));
	}

	public static void pd(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pd(n - 1);
	}

	public static void pi(int n) {
		if (n == 0) {
			return;
		}

		pi(n - 1);
		System.out.println(n);
	}

	public static void pdi(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

	public static void pzz(int n) {
		if (n == 0) {
			return;
		}

		System.out.print(n);
		pzz(n - 1);
		System.out.print(n);
		pzz(n - 1);
		System.out.print(n);
	}

	public static void toh(String s, String d, String h, int n) {
		if (n == 0) {
			return;
		}

		toh(s, h, d, n - 1);
		System.out.println(s + n + d);
		toh(h, d, s, n - 1);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int fm1 = factorial(n - 1);
		int f = n * fm1;
		return f;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpm1 = power(x, n - 1);
		int xp = xpm1 * x;
		return xp;
	}

	public static int smartpower(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpb2 = smartpower(x, n / 2);
		int xp = xpb2 * xpb2;

		if (n % 2 == 1) {
			xp = xp * x;
		}

		return xp;
	}
}

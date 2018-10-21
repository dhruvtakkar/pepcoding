package sep28;

public class RecursionWithArrays {
	public static void main(String[] args) {
		// int[] arr = { 11, 4, 9, 18, 7 };
		// display(arr, 0);
		int[] arr = { 3, 9, 2, 7, 9, 9, 4, 9, 3, 6 };
		int[] res = allIndices(arr, 0, 9, 0);
		for (int val : res) {
			System.out.println(val);
		}
	}

	// expectation -> d(4k, 0) will print all items in array from 0 to l - 1
	// faith -> d(4k , 1) will print all items in array from 1 to l - 1
	// d(4k, 0) = 4k[0] d(4k, 1)
	public static void display(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		System.out.println(arr[vidx]);
		display(arr, vidx + 1);
	}

	// dr(4k, 0) = 7 18 9 4 11
	// dr(4k, 1) = 7 18 9 4
	// dr(4k, 0) = dr(4k, 1) 11
	public static void displayR(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		displayR(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	// f(5) = 5 * 4 * 3 * 2 * 1
	// f(4) = 4 * 3 * 2 * 1
	// f(5) = 5 * f(4)
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int fm1 = factorial(n - 1);
		int fn = n * fm1;
		return fn;
	}

	// p(2, 5) = 2 * 2 * 2 * 2 * 2
	// p(2, 4) = 2 * 2 * 2 * 2
	// p(2 , 5) = p(2, 4) * 2
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpm1 = power(x, n - 1);
		int xpn = xpm1 * x;
		return xpn;
	}

	public static int spower(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpb2 = spower(x, n / 2);
		int xpn = xpb2 * xpb2;

		if (n % 2 == 1) {
			xpn = xpn * x;
		}

		return xpn;
	}

	public static int fspower(int x, int n) {
		if (n == 0) {
			return 1;
		}

		if (n % 2 == 0) {
			return fspower(x, n / 2) * fspower(x, n / 2);
		} else {
			return fspower(x, n / 2) * fspower(x, n / 2) * x;
		}
	}

	public static int max(int[] arr, int vidx) {
		if (vidx == arr.length - 1) {
			return arr[vidx];
		}

		int misa = max(arr, vidx + 1);
		if (misa > arr[vidx]) {
			return misa;
		} else {
			return arr[vidx];
		}
	}

	public static boolean find(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}

		if (arr[vidx] == data) {
			return true;
		} else {
			boolean fisa = find(arr, vidx + 1, data);
			return fisa;
		}
	}

	public static int firstIndex(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == data) {
			return vidx;
		} else {
			int fiisa = firstIndex(arr, vidx + 1, data);
			return fiisa;
		}
	}

	public static int lastIndex(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}

		int liisa = lastIndex(arr, vidx + 1, data);
		if (liisa == -1) {
			if (arr[vidx] == data) {
				return vidx;
			} else {
				return -1;
			}
		} else {
			return liisa;
		}
	}

	public static int[] allIndices(int[] arr, int vidx, int data, int fsf) {
		if (vidx == arr.length) {
			return new int[fsf];
		}

		if (arr[vidx] == data) {
			int[] res = allIndices(arr, vidx + 1, data, fsf + 1);
			res[fsf] = vidx;
			return res;
		} else {
			int[] res = allIndices(arr, vidx + 1, data, fsf);
			return res;
		}
	}

}

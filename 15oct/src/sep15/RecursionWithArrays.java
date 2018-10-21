package sep15;

public class RecursionWithArrays {

	public static void main(String[] args) {
		// int[] arr = { 12, 15, 23, 566, 77 };
		// display(arr, 0);
		// System.out.println(max(arr, 0));
		// int[] arr = {5, 2, 5, 5, 7};
		// int[] idces = allIndices(arr, 5, 0, 0);
		// for(int i = 0; i < idces.length; i++){
		// System.out.println(idces[i]);
		// }

		// printRows(5);
		// printCols(5);
		// printBox(5, 5);
		printTriangle(1, 1, 5);
	}

	// expect -> d(a, vidx) prints all elements after vidx
	// faith -> d(a, vidx + 1) prints all elements after vidx + 1
	// d(a, vidx) = a[vidx] >> d(a, vidx + 1)
	public static void display(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		System.out.println(arr[vidx]);
		display(arr, vidx + 1);
	}

	public static void displayR(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}

		displayR(arr, vidx + 1);
		System.out.println(arr[vidx]);
	}

	// expect -> will compare all elements post vidx and return the largest
	// among them
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

	public static boolean findStupid(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return false;
		}

		boolean fisa = findStupid(arr, data, vidx + 1); //
		if (fisa == true) {
			return true;
		} else {
			if (arr[vidx] == data) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean findSmart(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return false;
		}

		if (arr[vidx] == data) {
			return true;
		} else {
			boolean fisa = findSmart(arr, data, vidx + 1);
			if (fisa == true) {
				return fisa;
			} else {
				return false;
			}
		}
	}

	public static int firstIndex(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == data) {
			return vidx;
		} else {
			int fiisa = firstIndex(arr, data, vidx + 1);
			return fiisa;
		}
	}

	public static int lastIndex(int[] arr, int data, int vidx) {
		if (vidx == arr.length) {
			return -1;
		}

		int liisa = lastIndex(arr, data, vidx + 1);
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

	public static int[] allIndices(int[] arr, int data, int vidx, int fsf) {
		if (vidx == arr.length) {
			int[] ba = new int[fsf];
			return ba;
		}

		if (arr[vidx] == data) {
			int[] res = allIndices(arr, data, vidx + 1, fsf + 1);
			res[fsf] = vidx;
			return res;
		} else {
			int[] res = allIndices(arr, data, vidx + 1, fsf);
			return res;
		}
	}

	public static void printRows(int n) {
		if (n == 0) {
			return;
		}

		System.out.println("*****");
		printRows(n - 1);
	}

	public static void printCols(int n) {
		if (n == 0) {
			return;
		}

		System.out.print("*");
		printCols(n - 1);
	}

	public static void printBox(int r, int c) {
		if (r == 0) {
			return;
		}

		printBox(r - 1, c - 1);
		printCols(c);
		System.out.println();
	}

	public static void printTriangle(int r, int c, int n) {
		if (r > n) {
			return;
		}

		if (c > r) {
			printTriangle(r + 1, 1, n);
			System.out.println();
			return;
		}

		printTriangle(r, c + 1, n); // will print all columns of this row after
									// c+1
		System.out.print("*");
	}

}

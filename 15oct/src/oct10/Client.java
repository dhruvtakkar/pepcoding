package oct10;

public class Client {

	static int[] arr;
	static int[] sqrt;
	static int bs;
	static int bc;

	public static void main(String[] args) {
		arr = new int[] { 2, 6, 7, 9, -5, 8, 1, 4, 4, 12, 7 };
		bs = (int) Math.sqrt(arr.length);
		bc = (int) Math.ceil(arr.length * 1.0 / bs);
		sqrt = new int[bc];
		preprocess();

		System.out.println(query(1, 7));
		update(5, 10);
		System.out.println(query(1, 7));
	}

	public static void preprocess() {
		for (int i = 0; i < arr.length; i++) {
			sqrt[i / bs] += arr[i];
		}
	}

	public static void update(int idx, int val) {
		sqrt[idx / bs] += val - arr[idx];
		arr[idx] = val;
	}

	public static int query(int left, int right) {
		int res = 0;

		int lbn = left / bs;
		int rbn = right / bs;

		if (lbn == rbn) {
			for (int i = left; i <= right; i++) {
				res += arr[i];
			}
		} else {
			for (int i = left; i < bs * (lbn + 1); i++) {
				res += arr[i];
			}

			for (int i = lbn + 1; i <= rbn - 1; i++) {
				res += sqrt[i];
			}

			for (int i = rbn * bs; i <= right; i++) {
				res += arr[i];
			}
		}
		
		return res;
	}

}

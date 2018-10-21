package oct6;

import java.util.Arrays;

public class tns {

	public static void main(String[] args) {
		// int[] one = {10, 20, 30, 40, 50};
		// int[] two = {11, 15, 19, 25, 35, 55, 65, 75};
		// int[] res = merge(one, two);
		//
		// for(int val: res){
		// System.out.print(val + " ");
		// }
		// int[] arr = {11, 9, 2, 18, 7, 63, 4};
		// arr = mergesort(arr, 0, arr.length - 1);
		// for(int val: arr){
		// System.out.println(val);
		// }

		// int[] arr = {10, 9, 27, 28, 22, 29};
		// quicksort(arr, 0, arr.length - 1);
		// for(int val: arr){
		// System.out.print(val + " ");
		// }
		// System.out.println(".");

		// int[] arr = {0, 1, 2, 2, 2, 1, 1, 0, 0, 0, 1, 1, 0, 2};
		// sort012(arr);
		// for(int val: arr){
		// System.out.print(val + " ");
		// }

//		System.out.println(getPolyVal(2, 3));
//		long start = System.currentTimeMillis();
//		printAllPrimes(10000000);
//		soe(10000000);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
//		soe(30);

		highestFrequencyCharacter("kasdhfkjejfvqroi");
	}

	public static int[] merge(int[] one, int[] two) {
		int[] res = new int[one.length + two.length];

		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				res[k] = one[i];
				i++;
				k++;
			} else {
				res[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			res[k] = one[i];
			i++;
			k++;
		}

		while (j < two.length) {
			res[k] = two[j];
			j++;
			k++;
		}

		return res;
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}

		int mid = (lo + hi) / 2;
		int[] fhalf = mergesort(arr, lo, mid);
		int[] shalf = mergesort(arr, mid + 1, hi);
		int[] sorted = merge(fhalf, shalf);
		return sorted;
	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int pi = partition(arr, lo, hi, arr[hi]);
		quicksort(arr, lo, pi - 1); // smaller
		quicksort(arr, pi + 1, hi); // larger
	}

	public static int partition(int[] arr, int lo, int hi, int pivot) {
		int p = lo;
		int i = lo;

		// o to p - 1 is smaller, p to i - 1 is larger, i to last is unknown
		while (i <= hi) {
			if (arr[i] > pivot) { // grow the larger area
				i++;
			} else { // slide the larger area, grrow the smaller area
				swap(arr, i, p);
				i++;
				p++;
			}
		}

		return p - 1;
	}

	public static int partition(int[] arr, int pivot) {
		int p = 0;
		int i = 0;

		// o to p - 1 is smaller, p to i - 1 is larger, i to last is unknown
		while (i < arr.length) {
			if (arr[i] > pivot) { // grow the larger area
				i++;
			} else { // slide the larger area, grrow the smaller area
				swap(arr, i, p);
				i++;
				p++;
			}
		}

		return p;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void sort012(int[] arr) {
		int i = 0; // 0 to i - 1 is 0's area
		int j = 0; // i to j - 1 is 1's area
		int k = 0; // j to k - 1 is 2's area
		// k to end is unkown
		while (k < arr.length) {
			if (arr[k] == 2) {
				k++; // 2's region grows
			} else if (arr[k] == 1) {
				swap(arr, j, k); // 1's grows, 2 shifts
				k++;
				j++;
			} else {
				swap(arr, j, k);
				k++;
				swap(arr, j, i);
				i++;
				j++;

				// 2 shifts, 1 shifts, 0 grows
			}
		}
	}

	public static int getPolyVal(int x, int n) {
		int sum = 0;

		int coeff = n;
		int px = x;
		while (coeff >= 1) {
			sum += coeff * px;
			coeff--;
			px *= x;
		}

		return sum;
	}

	public static void soe(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (primes[i] == true) {
				for (int j = i; i * j <= n; j++) {
					primes[i * j] = false;
				}
			}
		}

		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
//				System.out.println(i);
			}
		}
	}

	public static void printAllPrimes(int n) {
		for (int i = 2; i <= n; i++) {
			if (checkPrime(i) == true) {
//				System.out.println(i);
			}
		}
	}

	public static boolean checkPrime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}

		return true;
	}

	public static void highestFrequencyCharacter(String word){
		int[] map = new int[26];
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(i);
			map[ch - 'a']++;
		}
		
		int maxchi = 0;
		for(int i = 1; i < map.length; i++){
			if(map[i] > map[maxchi]){
				maxchi = i;
			}
		}
		
		System.out.println((char)(maxchi + 'a'));
	}
	
	
	
	
	
	
	
	
}

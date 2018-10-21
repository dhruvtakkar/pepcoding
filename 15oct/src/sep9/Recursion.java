package sep9;

public class Recursion {

	public static void main(String[] args) {
		// PrintDecreasing(5);
		// PrintIncreasing(5);
//		pdi(5);
//		pdiwskips(5);
		toh("A", "B", "C", 3);
	}

	// expect => pd(5) -> 5 4 3 2 1
	// faith => pd(4) -> 4 3 2 1
	// expect and faith => pd(5) => 5 pd(4)
	public static void PrintDecreasing(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		PrintDecreasing(n - 1);
	}

	// expect => pi(5) -> 1 2 3 4 5
	// faith => pi(4) -> 1 2 3 4
	// expect and faith => pi(5) -> pi(4) 5
	public static void PrintIncreasing(int n) {
		if (n == 0) {
			return;
		}

		PrintIncreasing(n - 1);
		System.out.println(n);
	}

	// expect => pdi(4) -> 4 3 2 1 1 2 3 4
	// faith => pdi(3) -> 3 2 1 1 2 3
	// ef => pdi(4) -> 4 pdi(3) 4
	public static void pdi(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

	public static void pdiwskips(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 == 1) {
			System.out.println(n);
		}

		pdiwskips(n - 1);

		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static void toh(String src, String dest, String helper, int n){
		
	}
	
	
	
	
	
	
	
	
}

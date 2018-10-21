package sep26;

public class RecursionDemo {
	public static void main(String[] args) {
//		printDecreasing(5);
		toh("a", "b", "c", 3);
	}
	
	// expectation -> pd(5) = 5 4 3 2 1
	// faith -> pd(4) = 4 3 2 1
	// pd(5) = 5 pd(4)
	public static void printDecreasing(int n){
		if(n == 0){
			return;
		}
		
		System.out.println(n);
		printDecreasing(n - 1);
	}

	// expectation -> pi(5) = 1 2 3 4 5
	// faith -> pi(4) = 1 2 3 4
	// pi(5) = pi(4) 5
	public static void printIncreasing(int n){
		if(n == 0){
			return;
		}
		
		printIncreasing(n - 1);
		System.out.println(n);
	}
	
	// expectation -> f(5) = 5 4 3 2 1 1 2 3 4 5
	// faith -> f(4) = 4 3 2 1 1 2 3 4
	// f(5) = 5 f(4) 5
	public static void f(int n){
		if(n == 0){
			return;
		}
		
		System.out.println(n);
		f(n - 1);
		System.out.println(n);
	}
	
	// fdash(5) -> 4 2 1 3 5
	// fdash(6) -> 6 4 2 1 3 5
	public static void fdash(int n){
		if(n == 0){
			return;
		}
		
		if(n % 2 == 0){
			System.out.println(n);
		}
		
		fdash(n - 1);
		
		if(n % 2 == 1){
			System.out.println(n);
		}
	}

	// pzz(3) = ?
	public static void pzz(int n){
		if(n == 0){
			return;
		}
		
		System.out.println(n);
		pzz(n - 1);
		System.out.println(n);
		pzz(n - 1);
		System.out.println(n);
	}

	// expectation -> print all the instructions required to move n discs from
	// s to d using h
	public static void toh(String s, String d, String h, int n){
		if(n == 0){
			return;
		}
		
		toh(s, h, d, n - 1); 
		System.out.println(s + n + d);
		toh(h, d, s, n - 1); 
	}
	
	
	
	
	
	
	
	
}

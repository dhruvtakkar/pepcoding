package oct18;

public class rminst {

	static int[] sa;
	static int[] ba;
	public static void main(String[] args) {
		ba = new int[] { 12, 36, 6, 24, 72, 48 };
		int h = getLog(ba.length, false);
		int sz = (1 << (h + 1)) - 1;
		sa = new int[sz];
		build(0, 0, ba.length - 1);
		
		System.out.println(query(0, 0, ba.length - 1, 1, 3)); // 15
		System.out.println(query(0, 0, ba.length - 1, 0, 2)); // 29
		System.out.println(query(0, 0, ba.length - 1, 4, 5)); // 25
		System.out.println(query(0, 0, ba.length - 1, 3, 5)); // 29
		System.out.println(query(0, 0, ba.length - 1, 0, 5)); // 15
		System.out.println(query(0, 0, ba.length - 1, 0, 1)); // 19
	}

	public static void build(int si, int ss, int se) {
		if(ss == se){
			sa[si] = ba[ss];
			return;
		}
		
		int mid = (ss + se) / 2;
		build(2 * si + 1, ss, mid);
		build(2 * si + 2, mid + 1, se);
		sa[si] = operation(sa[2 * si + 1], sa[2 * si + 2]);
	}

	public static int query(int si, int ss, int se, int qs, int qe) {
		if(ss >= qs && se <= qe){
			return sa[si];
		} else if(se < qs || ss > qe){
			return identity();
		} else {
			int mid = (ss + se) / 2;
			int lc = query(2 * si + 1, ss, mid, qs, qe);
			int rc = query(2 * si + 2, mid + 1, se, qs, qe);
			return operation(lc, rc);
		}
	}

	public static void update(int si, int ss, int se, int bi, int delta) {
		if(ss == se){
			ba[bi] += delta;
			sa[si] += delta;
			return;
		}
		
		int mid = (ss + se) / 2;
		if(bi <= mid){
			update(2 * si + 1, ss, mid, bi, delta);
		} else {
			update(2 * si + 2, mid + 1, se, bi, delta);
		}
		sa[si] = operation(sa[2 * si + 1], sa[2 * si + 2]);
	}

	public static int getLog(int n, boolean floor) {
		int log = 0;
		while ((1 << log) < n) {
			log++;
		}

		if (floor && (1 << log) > n)
			log--;

		return log;
	}
	
	// opertors functions
	public static int operation(int a, int b){
		if(a == 0)
			return b;
		else if(b == 0)
			return a;
		else 
			return gcd(a, b);
	}
	
	public static int gcd(int op1, int op2){
		if(op1 == 0){
			return op2;
		} else {
			return gcd(op2 % op1, op1);
		}
	}
	
	public static int identity(){
		return 0;
	}

}

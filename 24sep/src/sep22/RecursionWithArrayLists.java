package sep22;

import java.util.ArrayList;

public class RecursionWithArrayLists {

	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>();
		// System.out.println(list + " " + list.size());
		//
		// list.add(10);
		// System.out.println(list + " " + list.size());
		//
		// list.add(20);
		// System.out.println(list + " " + list.size());
		//
		// list.add(30);
		// System.out.println(list + " " + list.size());
		//
		// list.set(2, 300);
		// System.out.println(list + " " + list.size());
		//
		// System.out.println(list.get(2));
		//
		// list.add(2, 40);
		// System.out.println(list + " " + list.size());
		//
		// list.remove(2);
		// System.out.println(list + " " + list.size());

		// get, set, remove, add, add, size
		// System.out.println(getSS("abc"));
		// System.out.println(getSSWAscii("ab"));
		// System.out.println(getKPC("781"));
//		System.out.println(getBoardPath(0, 10));
		System.out.println(getMatrixPaths(0, 0, 3, 3));
	}

	// Expectation abc -> ___, __c, _b_, _bc, a__, a_c, ab_, abc
	// Faith bc -> __, _c, b_, bc
	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rresult = getSS(ros); // bc -> __, _c, b_, bc
		ArrayList<String> mresult = new ArrayList<>();

		for (String recs : rresult) {
			mresult.add(recs);
			mresult.add(ch + recs);
		}

		return mresult;
	}

	public static ArrayList<String> getSSWAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rresult = getSSWAscii(ros); // bc -> __, _c, b_, bc
		ArrayList<String> mresult = new ArrayList<>();

		for (String recs : rresult) {
			mresult.add(recs);
			mresult.add(ch + recs);
			mresult.add((int) ch + recs);
		}

		return mresult;
	}

	static String[] codes = { "yz", "abc", "de", "fghi", "jk", "lmn", "opq", "rst", "uv", "wx" };

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rresult = getKPC(ros);
		ArrayList<String> mresult = new ArrayList<>();

		String code = codes[ch - '0'];
		for (String rstr : rresult) {
			for (int i = 0; i < code.length(); i++) {
				mresult.add(code.charAt(i) + rstr);
			}
		}
		return mresult;
	}

	// proactive
	public static ArrayList<String> getBoardPath(int src, int dest) {
		if (src == dest) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}

		ArrayList<String> mresult = new ArrayList<>();

		for (int dice = 1; dice <= 6 && src + dice <= dest; dice++) {
			int inter = src + dice;
			ArrayList<String> rresult = getBoardPath(inter, dest);

			for (String res : rresult) {
				mresult.add(dice + res);
			}
		}

		return mresult;

	}

	public static ArrayList<String> getMatrixPaths(int sr, int sc, 
												   int dr, int dc) {
		if(sr == dr && sc == dc){
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		
		if(sr > dr || sc > dc || sc < sr){
			ArrayList<String> bresult = new ArrayList<>();
			return bresult;
		}
		
		
		ArrayList<String> mresult = new ArrayList<>();
		ArrayList<String> hresult = getMatrixPaths(sr, sc + 1, dr, dc);
		ArrayList<String> vresult = getMatrixPaths(sr + 1, sc, dr, dc);
		
		for(String path: hresult){
			mresult.add("h" + path);
		}
		
		for(String path: vresult){
			mresult.add("v" + path);
		}
		
		return mresult;
	}
	
	
	
	
	
	
	
	
}

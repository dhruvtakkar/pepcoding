package oct3;

import java.util.ArrayList;

public class RecursionWithQAApproach {

	public static void main(String[] args) {
		// System.out.println(getBP(0, 10));
		// System.out.println(getMP(0, 0, 2, 2));
		// printSS("abc", "");0
		// printSSWAscii("ab", "");
		// printKPC("261", "");
		// printBP(0, 10, "");
		printMP(0, 0, 3, 3, "");
	}

	public static ArrayList<String> getBP(int s, int d) {
		if (s == d) {
			ArrayList<String> bpaths = new ArrayList<>();
			bpaths.add("\n");
			return bpaths;
		}

		if (s > d) {
			ArrayList<String> bpaths = new ArrayList<>();
			return bpaths;
		}

		ArrayList<String> manypathsfromstod = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			int i = s + dice;
			ArrayList<String> manypathsfromitod = getBP(i, d);

			for (String pathfromitod : manypathsfromitod) {
				String pathfromstod = dice + pathfromitod;
				manypathsfromstod.add(pathfromstod);
			}
		}

		return manypathsfromstod;
	}

	public static ArrayList<String> getBPProactive(int s, int d) {
		if (s == d) {
			ArrayList<String> bpaths = new ArrayList<>();
			bpaths.add("\n");
			return bpaths;
		}

		ArrayList<String> manypathsfromstod = new ArrayList<>();

		for (int dice = 1; dice <= 6 && s + dice <= d; dice++) {
			int i = s + dice;
			ArrayList<String> manypathsfromitod = getBPProactive(i, d);

			for (String pathfromitod : manypathsfromitod) {
				String pathfromstod = dice + pathfromitod;
				manypathsfromstod.add(pathfromstod);
			}
		}

		return manypathsfromstod;
	}

	public static ArrayList<String> getMP(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> bpaths = new ArrayList<>();
			bpaths.add("");
			return bpaths;
		}

		ArrayList<String> pathsfromstod = new ArrayList<>();

		if (sr < dr) {
			ArrayList<String> pathsfromvitod = getMP(sr + 1, sc, dr, dc);
			for (String pathfromvitod : pathsfromvitod) {
				String pathfromstod = 'v' + pathfromvitod;
				pathsfromstod.add(pathfromstod);
			}
		}

		if (sc < dc) {
			ArrayList<String> pathsfromhitod = getMP(sr, sc + 1, dr, dc);
			for (String pathfromhitod : pathsfromhitod) {
				String pathfromstod = 'h' + pathfromhitod;
				pathsfromstod.add(pathfromstod);
			}
		}

		return pathsfromstod;
	}

	public static void printSS(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		printSS(roq, asf + ch);
		printSS(roq, asf + "-");
	}

	public static void printSSWAscii(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		printSSWAscii(roq, asf + ch);
		printSSWAscii(roq, asf + "-");
		printSSWAscii(roq, asf + (int) ch);
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
	static int counter = 0;

	public static void printKPC(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String code = codes[ch - '0'];

		for (int i = 0; i < code.length(); i++) {
			printKPC(roq, asf + code.charAt(i));
		}
	}

	public static void printBP(int s, int d, String asf) {
		if (s == d) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		for (int dice = 1; dice <= 6 && s + dice <= d; dice++) {
			int i = s + dice;
			printBP(i, d, asf + dice);
		}
	}

	public static void printMP(int sr, int sc, int dr, int dc, String asf) {
		if (sr == dr && sc == dc) {
			System.out.println(++counter + ". " + asf);
			return;
		}

		if (sr < dr) {
			printMP(sr + 1, sc, dr, dc, asf + 'v');
		}

		if (sc < dc) {
			printMP(sr, sc + 1, dr, dc, asf + 'h');
		}
	}

}

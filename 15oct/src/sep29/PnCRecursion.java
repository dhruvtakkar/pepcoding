package sep29;

public class PnCRecursion {

	public static void main(String[] args) {
		// boolean[] boxes = new boolean[4];
		// permutations(boxes, 2, 0, "");
		// int[] coins = { 2, 3, 5, 6 };
		// coinchangeperm(coins, 10, "");
//		 coinchangecomb(coins, 10, "", 0);
//		permutations(0, 4, 2, 0, "");
		combinations(4, 0, 2, 0, "");
	}

	public static void permutations(boolean[] boxes, int titems, 
								    int citem, String asf) {
		if (citem == titems) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				permutations(boxes, titems, citem + 1, asf + "b" + i + "i" + citem + " ");
				boxes[i] = false;
			}
		}

	}
	
	public static void permutations(int boxes, int tboxes, int titems, int citem, String asf) {
		if (citem == titems) {
			System.out.println(Integer.toBinaryString(boxes) + " " + asf);
			return;
		}

		for (int i = 0; i < tboxes; i++) {
			if ((boxes & (1 << i)) == 0) {
				boxes = boxes ^ (1 << i);
				permutations(boxes, tboxes, titems, citem + 1, asf + "b" + i + "i" + citem + " ");
				boxes = boxes ^ (1 << i);
			}
		}
	}

	public static void combinations(boolean[] boxes, int titems, 
									int citem, String asf, 
									int llbu) {
		if (citem == titems) {
			System.out.println(asf);
			return;
		}

		for (int i = llbu + 1; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				combinations(boxes, titems, citem + 1, 
							asf + "b" + i + "i" + citem + " ", i);
				boxes[i] = false;
			}
		}
	}

	public static void combinations(int tboxes, int cbox, 
									int titems, int citem, 
									String asf) {
		if (citem == titems) {
			System.out.println(asf);
			return;
		}
		if (cbox == tboxes) {
			return;
		}
		
		combinations(tboxes, cbox + 1, titems, citem + 1, 
					 asf + "b" + cbox + "i" + citem);
		combinations(tboxes, cbox + 1, titems, citem, asf);

	}

	public static void coinchangeperm(int[] coins, int ramt, String psf) {
		if (ramt == 0) {
			System.out.println(psf);
			return;
		}

		for (int i = 0; i < coins.length; i++) {
			if (ramt >= coins[i]) {
				coinchangeperm(coins, ramt - coins[i], psf + coins[i]);
			}
		}
	}

	public static void coinchangecomb(int[] coins, int ramt, String psf, int lpci) {
		if (ramt == 0) {
			System.out.println(psf);
			return;
		}

		for (int i = lpci; i < coins.length; i++) {
			if (ramt >= coins[i]) {
				coinchangecomb(coins, ramt - coins[i], psf + coins[i], i);
			}
		}
	}

}

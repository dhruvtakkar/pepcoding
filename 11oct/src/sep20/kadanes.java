package sep20;

public class kadanes {

	public static void main(String[] args) {
		int[] arr = { 5, 7, -14, 2, 3, 9, -4, 6, -18, 7 };

		int cmax = arr[0];
		int csi = 0;
		int cei = 0;
		int omax = arr[0];
		int osi = 0;
		int oei = 0;

		for (int i = 1; i < arr.length; i++) {
			if (cmax > 0) {
				cmax = cmax + arr[i];
				cei++;
			} else {
				cmax = arr[i];
				csi = i;
				cei = i;
			}

			if (cmax > omax) {
				omax = cmax;
				osi = csi;
				oei = cei;
			}
		}

		for (int i = osi; i <= oei; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(omax);
	}

}

package sep3;

public class twodfun {

	public static void main(String[] args) {
		int[][] arr = {
				{11, 12, 13, 14},
				{21, 22, 23, 24},
				{31, 32, 33, 34},
				{41, 42, 43, 44}
		};
//		rotate90(arr);
		exitpoint(new int[][] {
			{0, 0, 1, 0},
			{1, 0, 0, 0},
			{0, 0, 0, 0},
			{1, 0, 1, 0}
		});
		mult(arr, new int[][] {
			{0, 0, 1, 0},
			{1, 0, 0, 0},
			{0, 0, 0, 0},
			{1, 0, 1, 0}
		});
	}

	public static void display(int[][] arr) {
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			} 
			System.out.println(".");
		}
	}

	public static void mult(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;
		
		if(c1 != r2){
			System.out.println("Not possible");
			return;
		}
		
		int[][] res = new int[r1][c2];
		for(int i = 0; i < res.length; i++){
			for(int j = 0; j < res[0].length; j++){
				for(int k = 0; k < r2; k++){
					res[i][j] += one[i][k] * two[k][j];
				}
			}
		}
		
		display(res);
	}
	
	public static void waved(int[][] arr){
		for(int j = 0; j < arr[0].length; j++){
			if(j % 2 == 0){
				for(int i = 0; i < arr.length; i++){
					System.out.println(arr[i][j]);
				}
			} else {
				for(int i = arr.length - 1; i >= 0; i--){
					System.out.println(arr[i][j]);
				}
			}
		}
	}
	
	public static void spirald(int[][] arr){
		int rmin = 0;
		int rmax = arr.length - 1;
		int cmin = 0;
		int cmax = arr[0].length - 1;
		
		int tne = arr.length * arr[0].length;
		int cnt = 1;
		while(cnt <= tne){
			for(int row = rmin; row <= rmax; row++){
				System.out.println(arr[row][cmin]);
				cnt++;
			}
			cmin++;
			
			for(int col = cmin; col <= cmax; col++){
				System.out.println(arr[rmax][col]);
				cnt++;
			}
			rmax--;
			
			for(int row = rmax; row>= rmin; row--){
				System.out.println(arr[row][cmax]);
				cnt++;
			}
			cmax--;
			
			for(int col = cmax; col >= cmin; col--){
				System.out.println(arr[rmin][col]);
				cnt++;
			}
			rmin++;
		}
	}
	
	public static void exitpoint(int[][] arr){
		int dir = 0;
		int r = 0;
		int c = 0;
		
		while(r >= 0 && r < arr.length && c >= 0 && c < arr[0].length){
			dir += arr[r][c];
			dir %= 4;
			
			if(dir == 0){
				c++;
			} else if(dir == 1){
				r++;
			} else if(dir == 2){
				c--;
			} else{
				r--;
			}
		}
		
		if(r < 0){
			r++;
		} else if (r >= arr.length) {
			r--;
		} else if(c < 0){
			c++;
		} else if(c >= arr[0].length){
			c--;
		}
		
		System.out.println(r + " " + c);
	}

	public static void rotate90(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr[0].length; j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			int l = 0;
			int r = arr[i].length - 1;
			while(l < r){
				int temp = arr[i][l];
				arr[i][l] = arr[i][r];
				arr[i][r] = temp;
				
				l++;
				r--;
			}
		}
		
		display(arr);
	}
}

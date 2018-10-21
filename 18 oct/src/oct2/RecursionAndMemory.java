package oct2;

import java.util.ArrayList;

public class RecursionAndMemory {

	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50 };
		// printTargetSubset(arr, 0, 50, "", 0);
//		printTargetSubset(arr, 0, 50, new ArrayList<>(), 0);
//		StringPerformanceHell(100000);
		
//		StringBuilder sb = new StringBuilder("hello");
//		sb.append('e');
//		System.out.println(sb);
//		System.out.println(sb.length());
//		System.out.println(sb.charAt(1));
//		sb.setCharAt(0, 'p');
//		System.out.println(sb);
//		sb.deleteCharAt(2);
//		System.out.println(sb);
//		sb.insert(2, 't');
//		System.out.println(sb);
//		printPermutations1("abc", "");
		printPermutations2(new StringBuilder("abc"), new StringBuilder());
	}
	
	public static void printPermutations1(String ques, 
										  String ans){
		if(ques.length() == 0){
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		for(int i = 0; i <= ans.length(); i++){
			String left = ans.substring(0, i);
			String right = ans.substring(i);
			printPermutations1(roq, left + ch + right);
		}
	}
	
	public static void printPermutations1(StringBuilder ques, 
										  StringBuilder ans){
		if(ques.length() == 0){
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		
		for(int i = 0; i <= ans.length(); i++){
			ans.insert(i, ch);
			printPermutations1(ques, ans);
			ans.deleteCharAt(i);
		}
		
		ques.insert(0, ch);
	}
	
	public static void printPermutations2(StringBuilder ques, 
										  StringBuilder ans){
		if(ques.length() == 0){
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < ques.length(); i++){
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			printPermutations2(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
		}
	}
	
	public static void printTargetSubset(int[] arr, int vidx, int tar, String set, int sos) {
		if (sos == tar) {
			System.out.println(set);
			return;
		}

		if (vidx == arr.length) {

			return;
		}

		printTargetSubset(arr, vidx + 1, tar, set + arr[vidx] + " ", sos + arr[vidx]);
		printTargetSubset(arr, vidx + 1, tar, set, sos);
	}

	public static void printTargetSubset(int[] arr, int vidx, int tar, 
										 ArrayList<Integer> set, 
										 int sos) {
		if(vidx == arr.length){
			if(sos == tar){
				System.out.println(set);
			}
			return;
		}
		
		set.add(arr[vidx]);
		printTargetSubset(arr, vidx + 1, tar, set, sos + arr[vidx]);
		set.remove(set.size() - 1);
		
		printTargetSubset(arr, vidx + 1, tar, set, sos);
	}

	public static void printEquiSets(int[] arr, int vidx, 
									 ArrayList<Integer> set1,
									 ArrayList<Integer> set2,
									 int sos1,
									 int sos2){
		if(vidx == arr.length){
			if(sos1 == sos2){
				System.out.println(set1 + " and " + set2);
			}
			return;
		}
		
		set1.add(arr[vidx]);
		printEquiSets(arr, vidx + 1, set1, set2, sos1 + arr[vidx], sos2);
		set1.remove(set1.size() - 1);
		
		set2.add(arr[vidx]);
		printEquiSets(arr, vidx + 1, set1, set2, sos1, sos2 + arr[vidx]);
		set2.remove(set2.size() - 1);
	}
	
	public static void StringPerformanceHell(int n){
		long start = System.currentTimeMillis();
		
//		String s = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++){
//			s = s + i;
			sb.append(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}

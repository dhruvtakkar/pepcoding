package oct1;

import java.util.ArrayList;

public class RecursionWithArrayList {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>();
//		System.out.println(list + " " + list.size());
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		System.out.println(list + " " + list.size());
//		list.set(2, 300);
//		System.out.println(list + " " + list.size());
//		list.add(1, 100);
//		System.out.println(list + " " + list.size());
//		list.remove(1);
//		System.out.println(list + " " + list.size());
//		System.out.println(list.get(2));
//		System.out.println(getSS("abc"));
		System.out.println(getKPC("367"));
	}
	
	public static ArrayList<String> getSS(String str){
		if(str.length() == 1){
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("_");
			bresult.add(str);
			return bresult;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rresult = getSS(ros);
		ArrayList<String> mresult = new ArrayList<>();
		for(String res: rresult){
			mresult.add("_" + res);
			mresult.add(ch + res);
		}
		
		return mresult;
	}
	public static ArrayList<String> getSSWAscii(String str){
		if(str.length() == 0){
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rresult = getSSWAscii(ros);
		ArrayList<String> mresult = new ArrayList<>();
		for(String res: rresult){
			mresult.add("_" + res);
			mresult.add(ch + res);
			mresult.add((int)ch + res);
		}
		
		return mresult;
	}

	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", 
							 "pqrs", "tu", "vwx", "yz"};
	
	public static ArrayList<String> getKPC(String str){
		if(str.length() == 0){
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rresult = getKPC(ros);
		ArrayList<String> mresult = new ArrayList<>();
		
		String code = codes[ch - '0'];
		for(String res: rresult){
			for(int i = 0; i < code.length(); i++){
				mresult.add(code.charAt(i) + res);
			}
		}
		
		return mresult;
	}

	public static ArrayList<String> getBPaths(int src, int dest){
		
	}
	
	
	
	
	
	
	
	
	

}

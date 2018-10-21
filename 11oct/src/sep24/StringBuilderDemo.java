package sep24;

public class StringBuilderDemo {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("hello"); // declare
//		System.out.println(sb.length());
//		System.out.println(sb.charAt(0));
//		sb.setCharAt(1, 't');
//		System.out.println(sb);
//		sb.deleteCharAt(2);
//		System.out.println(sb);
//		sb.insert(2, 'p');
//		System.out.println(sb);
//		sb.append('z');
//		System.out.println(sb);
//		String str = sb.toString();
//		System.out.println(str);
		System.out.println(compress1("aaabbbcccaadddeefff"));
		System.out.println(compress2("aaabbbcccaadddeefff"));
	}

	public static String modify1(String str) {

	}

	public static String modify2(String str) {

	}

	public static String modify3(String str) {

	}

	public static String compress1(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length() - 1; i++){
			if(str.charAt(i) != str.charAt(i + 1)){
				sb.append(str.charAt(i));
			}
		}
		
		sb.append(str.charAt(str.length() - 1));
		return sb.toString();
	}

	public static String compress2(String str) {
		StringBuilder sb = new StringBuilder();
		int val = 1;
		
		for(int i = 0; i < str.length() - 1; i++){
			if(str.charAt(i) != str.charAt(i + 1)){
				sb.append(str.charAt(i));
				sb.append(val);
				val = 1;
			} else {
				val++;
			}
		}
		
		sb.append(str.charAt(str.length() - 1));
		sb.append(val);
		return sb.toString();
	}
}

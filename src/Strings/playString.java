package Strings;

public class playString {

	public static void main(String[] args) {
		String word = new String("abcdef");
		char c = word.charAt(3);
		int l = word.charAt(3) - 'a';
		System.out.println("  value of c = "+c+"   value of l =  "+word.charAt(l));
	}

}

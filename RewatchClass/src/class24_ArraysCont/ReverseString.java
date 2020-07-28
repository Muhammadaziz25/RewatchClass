package class24_ArraysCont;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "Life is beautiful!";
		char[] chars = new char[str.length()];
		for(int i=0; i<chars.length; i++) {
			char letter = str.charAt(i);
			chars[i]=letter;
		}
		
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		
		
		
		
		

//		String word = "Hello world";
//		char[] ch = word.toCharArray();/*new char[word.length()];
//		for (int i = 0; i < ch.length; i++) {
//			char letter = word.charAt(i);
//			ch[i]=letter;
//		}*/
//		
//		for(int i=ch.length-1; i>=0; i--) {
//			System.out.print(ch[i]);
//		}
	}

}

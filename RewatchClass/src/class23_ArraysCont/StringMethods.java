package class23_ArraysCont;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Life is beautiful";
		char[] chars = str.toCharArray();
		System.out.println(Arrays.toString(chars));
		
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		
	}

}

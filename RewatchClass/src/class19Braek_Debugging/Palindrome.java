package class19Braek_Debugging;

import java.util.Scanner;
/**
 * 
 * @author Eagle
 *
 */

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String word = scanner.nextLine();
		boolean isPalindrome = true;
		
		for(int i=0, j=word.length()-1; i<j; i++, j--) {
			if(word.charAt(i)!=word.charAt(j)) {
				isPalindrome=false;
				break;
			}
			System.out.println(isPalindrome);
		}
	}

}

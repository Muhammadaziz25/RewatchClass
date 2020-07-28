package class28_Methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 09.03.2020
 * 
 * @author Eagle
 *
 */

public class HomeworkAssignment13 {

	public static void main(String[] args) {
		/*
		 * Please create a program that takes user input as a string and reverses each
		 * word in that string.
		 * For example, if user enters “Java is awesome” the result should be “avaJ si
		 * emosewa”.
		 * Turn your string into an array and work with arrays instead of manipulating
		 * string directly.
		 * Use string methods such as toCharArray() and split(). Use swapping to reverse
		 * array elements.
		 */

		System.out.println("Please enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] charArray = str.split(" ");
		System.out.println(Arrays.toString(charArray));
		String reverse = "";
		for (String temp : charArray) {
			for (int i = temp.length() - 1; i >= 0; i--) {
				reverse += temp.charAt(i);
			}
			reverse += " ";
		}
		System.out.println(reverse);
	}

}

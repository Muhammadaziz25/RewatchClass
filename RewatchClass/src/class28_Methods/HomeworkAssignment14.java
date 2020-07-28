package class28_Methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 09.03.2020
 * 
 * @author Eagle
 *
 */

public class HomeworkAssignment14 {

	public static void main(String[] args) {

		/*
		 * Write a program that takes the user input as an integer array and displays
		 * the duplicate values in that array with their indices. Rules: You need to get
		 * the array size from the user first before taking in the array values. Your
		 * array size cannot be zero or less. If there are no duplicates, your program
		 * needs to display that message.
		 */

		System.out.println("Enter your array size: ");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] intArray = new int[arraySize];

		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Ad array element under index " + i + " ");
			int nums = sc.nextInt();
			intArray[i] = nums;

		}
		Arrays.sort(intArray);
		System.out.println("Your sorted array is " + Arrays.toString(intArray));

		boolean isDuplicate = false;
		for (int m = 0; m < intArray.length; m++) {
			int dup = intArray[m];
			for (int n = m + 1; n < intArray.length; n++) {
				int dup2 = intArray[n];

				if (dup == dup2) {
					System.out.print("Duplictae is: " + dup + " under " + (m+1)  + ", ");
					isDuplicate = true;
				}
			}

		}
		if (!isDuplicate) {
			System.out.println("No duplicate");
		}

	}

}

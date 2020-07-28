package class27_ArrayEx;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 030.03.2020
 * @author Eagle
 *
 */

public class SortingNums {

	public static void main(String[] args) {

		
		int[] nums = {1,5,2,85,7,14,35,62,20,5,34,23,17,25};
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int key = 45;
		System.out.println("The index of " + key + " is " + Arrays.binarySearch(nums, key));
		
		
		int[] integers = {1,2,5,8,10,15,17};
		Arrays.fill(integers, 2,5,25);
		System.out.println(Arrays.toString(integers));
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a number");
//		int num = sc.nextInt();
//		
//		String result = (num>0) ? num + " is greater than zero" :  (num<0)?num + " is less than zero": num + " is zero";
//		System.out.println(result);
	}

}

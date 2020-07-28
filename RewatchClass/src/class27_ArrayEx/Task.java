package class27_ArrayEx;

import java.util.Arrays;

/**
 * 04.03.2020
 * @author Eagle
 *
 */

public class Task {

	public static void main(String[] args) {

		int[]arr1 = {5,8,2,6,58,0,24,25,34};
		int[] arr2 = {10,4,17,7,8,0,2,5,6,9,2};
		
		int[] arr3 = new int[arr1.length + arr2.length];
		for(int i=0; i<arr3.length; i++) {

			arr3[i]=(i<arr1.length) ? arr1[i] : arr2[i-arr1.length];
		}
		
		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		Arrays.fill(arr3, 16, 20, 9);
		System.out.println(Arrays.toString(arr3));
		
		Arrays.binarySearch(arr3, 8);
		System.out.println(Arrays.binarySearch(arr3, 8));
		
		outter:
		for(int m =0; m<arr3.length; m++) {
//			int temp = arr3[m];
			
			inner:
			for(int o=m+1; o<arr3.length; o++) {
//				int temp2 = arr3[o];
				
				if(arr3[m]==arr3[o]) {
					System.out.println("The first duplicate number is " + arr3[m]);
					break outter;
				}
			}
		}
		
	}

}

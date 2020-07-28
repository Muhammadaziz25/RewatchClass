package class33_VarArgsCon;

import java.util.Arrays;

public class ScopeOfvariable1 {

	public static void main(String[] args) {

		int[] arr = new int [2];
		
		arr[0] = 5;
		arr[1] = 20;
		System.out.println(Arrays.toString(arr));
		
		swap(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap( int[] intArr) {
		int temp = 0;
		
		temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		
	}

}

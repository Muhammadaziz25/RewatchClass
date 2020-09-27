package class41_Boxing;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmpUpTask {

	public static void main(String[] args) {
		
		

		/*
		 * Write an array of any type, and have value in it
		 * Write an ArrayList >>> ArrayList<DataType> arrayList = new ArrayList<>
		 * assign all elements of array to ArrayList
		 */
		
		String[] arrString = {"arr1", "arr2", "arr3"}; 
		System.out.println(Arrays.toString(arrString));
		
		ArrayList<String> arrList = new ArrayList<>();
		System.out.println(arrList.size());
		for (int i = 0; i < arrString.length; i++) {
			String arrayElement = arrString[i];
			arrList.add(arrayElement);
			
		}
		System.out.println(arrList.size());
		System.out.println(arrList.toString());
	}

}

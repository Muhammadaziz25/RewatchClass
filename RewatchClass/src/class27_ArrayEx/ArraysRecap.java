package class27_ArrayEx;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 03.03.2020
 * @author Eagle
 *
 */

public class ArraysRecap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size");
		int arraySize = sc.nextInt();
		int[] arrayInt = new int[arraySize];
		
		
		int index =0;
		for(int num : arrayInt) {
			System.out.print("Enter element value: ");
			int userInput = sc.nextInt();
			num = userInput;
			arrayInt[index]=num;
			index++;
		}
		
		for(int i=0; i<arrayInt.length; i++) {
			int temp = arrayInt[i];
			boolean unique = true;
			
			for(int m=0; m<arrayInt.length; m++) {
				int temp2 = arrayInt[m];
				
				if(temp==temp2 && i != m) {
					unique = false;
					break;
				}
			}
			
			if( unique ) {
				System.out.print("Unique " + temp + "," );
			}
		}
		
		sc.close();
		
	
	}

}

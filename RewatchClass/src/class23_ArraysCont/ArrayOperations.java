package class23_ArraysCont;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {

		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int arraySize = scanner.nextInt();
		
		int[] numbers = new int[arraySize];
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Now enter numbers within the array size: ");
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i]=(int) Math.sqrt(numbers[i]);
		}
		System.out.println(Arrays.toString(numbers));
	}

}

package class56_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num;
		try {
			num = sc.nextInt();
			System.out.println("The integer number is: " + num);
			
		}catch(Exception e ){
			
			System.out.println("The number is not integer number");
		}
		
	}

}

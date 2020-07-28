package class14_SwitchStatement;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter full name");
		String fullName = sc.nextLine();
		
		boolean isComma = fullName.contains(",");
		
		if(isComma) {
			String firstName = fullName.substring(0, fullName.indexOf(','));
			String lastName = fullName.substring(fullName.indexOf(',')+1);
			System.out.println("Your first name is " + firstName);
			System.out.println("Your last name is " + lastName);
		} else {
			String firstName = fullName.substring(0, fullName.indexOf(' '));
			String lastName = fullName.substring(fullName.indexOf(' ')+1);
			System.out.println("Your first name is " + firstName);
			System.out.println("Your last name is " + lastName);
		}
	}
}

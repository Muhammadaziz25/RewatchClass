package class28_Methods;

import java.util.Scanner;

public class MethodTask {

	public static void main(String[] args) {
		/*
		 *  Write a method with a parameter
		 *  And call it main method
		 *  output the parameter in reverse order in the console
		 */
		reverse("Life is beautiful");
		calculation(5, 25, '%');
		
	}
	
	public static void reverse( String str) {
		for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		
		}
		System.out.println();
		
	}
	public static void calculation(int a, int b, char action) {
		
		switch (action) {
		case '+':
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a-b);
			break;
			
		case '/':
			System.out.println(a/b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;

		default:
			System.out.println(action + " is invalid action");
			break;
		}
	}

}

package class14_SwitchStatement;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		//int num = 10;
		String number = "";
		
		/*if(num % 2 == 0) {
			number = num + " is even";
		} else {
			number = num + " is odd";
			}
*/		
		/*number = num % 2 == 0 ? num + " is even" : num + " is odd";
		System.out.println(number);
		
		boolean isBoolean = ((false == false) || false) && true || (true == false) ? true : false;
		System.out.println(isBoolean);
		}*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String number1 = "";
		number1 = num>0 ? num + " is positive" : num < 0 ? num + " is negative" : num + " is zero";
		System.out.println(number1);
	}
}

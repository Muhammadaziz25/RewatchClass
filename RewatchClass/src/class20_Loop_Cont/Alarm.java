package class20_Loop_Cont;

import java.util.Scanner;

/**
 * 13.02.2020
 * 
 * @author Eagle
 *
 */

public class Alarm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Please enter a number: "); int day = scanner.nextInt();
		 * System.out.println("Please enter true/false for vocation: "); boolean
		 * isVocation = scanner.nextBoolean();
		 * 
		 * String alarmTime = "";
		 * 
		 * while(day<1 || day>7) {
		 * System.out.println("Invalid day, Enter number between 1 and 7: ");
		 * System.out.println("Please enter a number: "); day = scanner.nextInt(); }
		 * if(isVocation) {
		 * 
		 * if(day<=5) { alarmTime = "10 am"; }else if(day<8 && day>5) { alarmTime =
		 * "off"; } else { //alarmTime = "Invalid day";
		 * System.out.println("Invalid day"); }
		 * 
		 * } else { if(day<=5) { alarmTime = "7 am"; }else if(day<8 && day>5) {
		 * alarmTime = "10 am"; } else { //alarmTime = "Invalid day";
		 * System.out.println("Invalid day"); } }
		 * 
		 * System.out.println("Your alarm is set on " + alarmTime);
		 */

		System.out.println("Please enter a text: ");
		String text = scanner.nextLine();

		System.out.println("Please enter a char");
		char ch = scanner.next().charAt(0);
		int repeat = 0;

		for (int index = 0; index < text.length(); index++) {
			char ch1 = text.charAt(index);
			if (ch == ch1) {
				repeat++;

			}
		}
		System.out.println("Character \"" + ch + "\" repeats " + repeat + " times in " + text);

	}

}

package class14_SwitchStatement;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of month: ");
		
		int numOfMonth = sc.nextInt();
		String monthName = "";
		
		switch(numOfMonth) {
		case 1: monthName = "January";
		break;
		case 2: monthName = "Febrary";
		break;
		case 3: monthName = "March";
		break;
		case 4: monthName = "April";
		break;
		case 5: monthName = "May";
		break;
		case 6: monthName = "June";
		break;
		case 7: monthName = "July";
		break;
		case 8: monthName = "August";
		break;
		case 9: monthName = "September";
		break;
		case 10: monthName = "October";
		break;
		case 11: monthName = "November";
		break;
		case 12: monthName = "December";
		break;
		default: monthName = "Invalid month";
		}
		
		switch (monthName) {
		case "December":
		case "January":
		case "February":
			System.out.println("Month is " + monthName + ", season is Winter");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Month is " + monthName + ", season is Spring");
			break;
		case "June":
		case "July":
		case "August":
			System.out.println("Month is " + monthName + ", season is Summer");
			break;
		case "September":
		case "October":
		case "November":
			System.out.println("Month is " + monthName + ", season is Autumn");
			break;
		default:
			monthName = "Invalid season";
		}
	}

}

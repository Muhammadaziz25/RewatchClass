package stringManipulation;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter full name");
		System.out.println("First Name");
		String firstName = sc.nextLine();
		System.out.println("Last Name");
		String lastName = sc.nextLine();
		
		System.out.println("Please enter full address");
		System.out.println("address1");
		String address1 = sc.nextLine();
		System.out.println("address2");
		String address2 = sc.nextLine();
		System.out.println("city");
		String city = sc.nextLine();
		System.out.println("state");
		String state = sc.nextLine();
		System.out.println("zipCode");
		String zipCode = sc.nextLine();
		
		System.out.println("Please enter date of birthday");
		long dateOfB = sc.nextLong();
		
		System.out.println("Phone number");
		long phoneNum = sc.nextLong();
		
		System.out.println("SNN");
		long snn = sc.nextLong();
		
		String userId = (firstName + " " + lastName).toLowerCase();
		String fullName = firstName + " " + lastName;
		String address = address1 + " " + address2 + ", " + city + ", " + state + ", " + zipCode;
		String dob = "" + dateOfB;
		dob = dob.substring(0, 2) + "/" + dob.substring(2,4) + "/" + dob.substring(4);
		//10102010
		
		String pn = "" + phoneNum;
		pn = "+" + pn.substring(0,5) + "-" + pn.substring(5,8) + "-" + pn.substring(8,10) + "-" + pn.substring(10);
		//998937077007
		
		String SNN = "" + snn;
		SNN = SNN.substring(0,3) + "_" + SNN.substring(3,4) + "_" + SNN.substring(4);
		//1234567
		
		System.out.println("Fullname: " + fullName);
		System.out.println("Address: " + address);
		System.out.println("Date of birthday: " + dob);
		System.out.println("Phone number: " + pn);
		System.out.println("SNN number: " + SNN);
		System.out.println("User ID: " + userId);
				
	}

}

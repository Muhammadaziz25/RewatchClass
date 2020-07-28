package class17NestedLoop;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter sentence");
		
		String word = scanner.nextLine();
		
		for(int integer=0; integer<word.length(); integer++) {
			System.out.print(word.charAt(integer) + "\t");
		}

		System.out.println(); 
		
		for(int i=0; i<word.length(); i++) {
			System.out.print(i + " \t");
		}
	
	}

}

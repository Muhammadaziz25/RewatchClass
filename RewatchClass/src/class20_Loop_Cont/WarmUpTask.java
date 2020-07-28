package class20_Loop_Cont;

import java.util.Scanner;

/**
 * 12.02.2020
 * @author Eagle
 *
 */

public class WarmUpTask {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = scanner.nextLine();
		System.out.println("Please enter a char letter: ");
		char ch = scanner.next().charAt(0);
		
		/*for(int i=0; i<text.length(); i++) {
			if(ch == text.charAt(i)) {
				System.out.println("Index of " + ch + " in " + text + " is " + i);
			}
		}*/
		
		for(int j = text.length()-1; j>=0; j--) {
			char ch1 = text.charAt(j);
			if(ch==ch1) {
				System.out.println(j);
				break;
			}
		}

	}

}

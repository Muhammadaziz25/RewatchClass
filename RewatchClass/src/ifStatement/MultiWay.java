package ifStatement;

import java.util.Scanner;

public class MultiWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter your score");
		 double score = sc.nextDouble();
		
		 if(score >= 90.0) {
			 System.out.println("Your score is \"A\"");
		 }else if (score >= 80.0) {
			 System.out.println("Your score is \"B\"");
		 } else if (score >=70.0) {
			 System.out.println("Your score is \"C\"");
		 }else if(score >= 60.0) {
			 System.out.println("Your score is \"D\"");
		 }else {
			 System.out.println("Your score is \"F\"");
		 }
		
		/*int num = 100;
		
		System.out.println(num < 100 && num >= 100);
		*/
		
	}
}

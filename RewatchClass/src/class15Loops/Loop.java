package class15Loops;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		/*int a = 5;
		int b = 7;
		System.out.println("a is " + a + ", b is " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a is " + a + ", b is " + b);*/
		
		/*int count = 1;
		
		while(count<=100) {
			System.out.println(count + " Good morning");
			//count++;
		}*/
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = scanner.nextInt();
		int lastDigitNum;
		while(num>0) {
			lastDigitNum = num%10;
			System.out.print(lastDigitNum);
			num = num/10;
			
		}*/
		
		
		for (int i = 1; i <= 100; i++) {
			if(i%10==0) {
				System.out.println(i + "\n");
			} else {
				System.out.print(i + " \t");
			}
			
		}
			
		
		
		

		
	}

}

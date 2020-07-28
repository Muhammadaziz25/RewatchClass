package ifStatement;

import java.util.Scanner;

public class BMICalculating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will calculate youe BMI based on your weight and height: ");
		System.out.println("Please enter your weight in KGs");
		double weight = sc.nextDouble();
		System.out.println("Please enter your height in metres, if you are 175 centimetres, enter 1.75: ");
		double height = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		if(bmi < 18.5) {
			System.out.println("Your BMI is " + bmi + " \nYou are underweight");
		} else if (18.5 <= bmi || bmi < 25.0) {
			System.out.println("Your BMI is " + bmi + " \nYou are normal");
		} else if (25.0 <= bmi || bmi < 30.0) {
			System.out.println("Your BMI is " + bmi + " \nYou are overweight");
		}else {
			System.out.println("Your BMI is " + bmi + " \nYou are obese");
		}
				
	}
}

package class39_EncapsulationAndStatic;

import java.awt.Color;

public class Car {
	/*
	 * Variables: 
	 * 2. Instance variable: year, model
	 * 3. Static variable: counter>>0, companyName  >> final
	 * 
	 * Instance methods: getYear(), getColor(), accelerate(int speed), decelerate(int speed)
	 * Static methods: getCounter(), getCompanyName()
	 */

	int year;
	int speed;
	String color;
	static int counter = 0;
	static final String companyName = "Mercedes-Benz";
	
	
	public Car() {
		counter++;
	}
	
	public Car(int year, String color, int speed) {

		this.color = color;
		this.speed = speed;
		this.year = year;
		counter++;
	}
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void accelerate(int increment) {
		speed += increment;
	}
	
	public void decelerate(int decrement) {

		speed -= decrement;
		
	}
	
	public static int getCounter() {
		return counter;
	}
	
	public static String getCompanyName() {
		return companyName;
	}
}

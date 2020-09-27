package class39_EncapsulationAndStatic;

import java.awt.Color;

public class Car {
	/*
	 * 1.Variables: instance variables: year, color static variables: counter,
	 * companyName==final,
	 *  2.Constructors: no-arg constructors constructor that sets values year and color 
	 * 2.Instance methods: getYear(), getColor(),
	 * accelerate(int speed), decelerate(int speed)
	 *  Static methods: getCounter(),
	 * getCompanyName()
	 */

	int year;
	int speed;
	String color;
	public static int counter = -1;
	public final static String companyName = "Mercedes-Benz";

	public Car() {
		counter ++;

	}

	public Car(int year, String color, int speed) {

		this.year = year;
		this.color = color;
		this.speed = speed;
		counter++;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public void accelerate (int increment) {
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

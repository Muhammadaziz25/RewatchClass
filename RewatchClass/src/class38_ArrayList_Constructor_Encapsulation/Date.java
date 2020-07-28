package class38_ArrayList_Constructor_Encapsulation;
/**
 * 20.03.2020
 * @author Eagle
 *
 */
public class Date {
	/*
	 * Write a class Date
	 * have 3 variables day, month and year
	 * DateTester class
	 * object in Date Tester class
	 * assign values to day, month and year
	 * 
	 * Encapsulation is one of concept of OOP(Object Oriented Programming) and we use getMethod and setMethod
	 * 
	 * 
	 * */	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	
	public Date( int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

}

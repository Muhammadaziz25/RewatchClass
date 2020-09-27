package class39_EncapsulationAndStatic;

public class CarTester {

	public static void main(String[] args) {
		/*
		 * Create 3 car objects in the main method
		 * Call the instance methods 
		 * Call the static methods
		 * Access instance variables
		 * Access static variables
		 */
		Car c = new Car(2020, "Black", 70);
		Car c3 = new Car();
		
		System.out.println(Car.getCounter());
		System.out.println("The color is " + c.color);
		System.out.println(c.speed);
		c.accelerate(15);
		System.out.println(c.speed);
		System.out.println(Car.getCompanyName());
		System.out.println("========================");
		new CarTester().method1();;
	}
	
	public void method1() {
		
		Car c2 = new Car(2020, "Black", 70);
		
		System.out.println(Car.getCounter());
		System.out.println("The color is " + c2.color);
		System.out.println(c2.speed);
		c2.accelerate(15);
		System.out.println(c2.speed);
		System.out.println(Car.getCompanyName());
		
	}
}

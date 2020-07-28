package class39_EncapsulationAndStatic;

public class CarTester {

	public static void main(String[] args) {

//		Math m = new Math();
		Car c1 = new Car(); 
		
		Car c2 = new Car(2020, "grey", 50);
		System.out.println(Car.counter);
		System.out.println(c2.speed);
		c2.accelerate(20);
		System.out.println(c2.speed);
		System.out.println(Car.getCompanyName());
		
//		CarTester ct = new CarTester();
//		ct.method1();
		new CarTester().method1(); // the same with above
		method2();
		
	}
	
	public void method1() {
		
		Car c2 = new Car(2020, "grey", 50);
		System.out.println(Car.counter);
		System.out.println(c2.speed);
		c2.accelerate(20);
		System.out.println(c2.speed);
		System.out.println(Car.getCompanyName());
	}
	
	public static void method2() {
		System.out.println("Static method");
	}

}

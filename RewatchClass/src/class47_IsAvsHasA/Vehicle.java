package class47_IsAvsHasA;

public class Vehicle {
	
	int year;
	String fuelType;
	Engine e;
	
	public Vehicle() {
		
	}

	public Vehicle(int year, String fuelType, Engine e) {
		this.year = year;
		this.fuelType = fuelType;
		this.e = e;
	}
	
	public void accelerate() {
		System.out.println("Accelerating");
	}
	
	

}

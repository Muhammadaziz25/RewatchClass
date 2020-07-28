package class47_IsAvsHasA;

public class Car extends Vehicle {
	
	String brand;
	String model;
	
	public Car() {
		
	}

	public Car(int year, String fuelType, Engine e, String brand, String model) {
		super(year, fuelType, e);
		this.brand = brand;
		this.model = model;
	}
	
	public void drift() {
		System.out.println("Drifting");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + 
				", year=" + year + ", fuelType=" + fuelType + ", e=" + e
				+ "]";
	}

	

	
	
	

	
	

}

package class47_IsAvsHasA;

public class Engine {
	
	String name;
	String brand;
	String type;
	int year;
	
	public Engine() {
	}
	
	public Engine(String name, String brand, String type, int year) {
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", brand=" + brand + ", type=" + type + ", year=" + year + "]";
	}

	

	
	

}

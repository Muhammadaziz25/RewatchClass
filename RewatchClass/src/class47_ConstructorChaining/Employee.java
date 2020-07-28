package class47_ConstructorChaining;

public class Employee extends Human {

	
	public Employee() {
		this(5);
		System.out.println("Employee no arg constructor is being called");
	}
	
	public Employee(int i) {
		System.out.println("Employee one constructor is being called");
	}

}

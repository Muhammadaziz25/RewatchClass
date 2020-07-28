package class51_Polymorphism;

public class Employee {

	private String name;
	private int employeeId;

	public Employee() {

	}

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void arriveToWork() {
		System.out.println("Arriving at work");
	}

	public void startProjectWork() {
		System.out.println("Starting project");
	}

	@Override
	public String toString() {
		return "name=" + name + ", employeeId=" + employeeId;
	}

}

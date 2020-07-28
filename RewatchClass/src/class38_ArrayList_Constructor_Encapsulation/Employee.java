package class38_ArrayList_Constructor_Encapsulation;
/**
 * 20.03.2020
 * @author Eagle
 *
 */
public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private static String managerName;
	
	public Employee(String firstName, String lastName, int age ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	
	public static String getManagerName() {
		return managerName;
	}
	
	public static void setManagerName(String managerName) {
		Employee.managerName = managerName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
}

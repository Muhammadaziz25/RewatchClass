package class51_Polymorphism;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee[] employee = {new Manager("Muhammadaziz", 1, true),new Manager("Shohruhmirzo", 2, false),
				new Programmer("Abdulmalik", 3, "Java"), new Programmer("Ali", 4, "Python"),
				new Programmer("Akmal", 5, "C++"), new Programmer("Hadicha", 7, "Java"),};
		
		for (Employee e : employee) {
			e.arriveToWork();
			e.startProjectWork();
			System.out.println(e.toString());
			
		}
	}

}

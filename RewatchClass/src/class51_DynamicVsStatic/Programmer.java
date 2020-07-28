package class51_DynamicVsStatic;

public class Programmer extends Employee {

	String name = "Programmer";

	public void printName() {
		System.out.println("Programmer");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee prog = new Programmer();
		
		System.out.println(emp.name);
		System.out.println(prog.name);
		
		emp.printName();
		prog.printName();
	}
}

package class51_Polymorphism;

public class Programmer extends Employee {

	private String progLan;
	public Programmer(String name, int employeeId, String progLan) {
		super(name, employeeId);
		this.progLan = progLan;
	}

	
	public void startProjectWork() {
		defineClasses();
		unitTestCode();
	}
	
	private void defineClasses() {
		System.out.println("Defining classes");
	}
	
	private void unitTestCode() {
		System.out.println("Uniting Test Code");
	}


	@Override
	public String toString() {
		return super.toString() + ", Programming Language=" + progLan;
	}
	
	
}

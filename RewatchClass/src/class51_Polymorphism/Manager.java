package class51_Polymorphism;

public class Manager extends Employee {
	
	private boolean isMBA;
	public Manager(String name, int employeeId, boolean isMBA) {
		super(name, employeeId);
		this.isMBA = isMBA;
	}
	
	public void startProjectWork() {
		meetCustomer();
		scheduleProject();
		teamWork();
	}

	private void meetCustomer() {
		System.out.println("Meeting with customer");
	}
	
	private void scheduleProject() {
		System.out.println("Preparing schedule");
	}
	
	private void teamWork() {
		System.out.println("Working with team");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", isMBA=" + isMBA;
	}
}

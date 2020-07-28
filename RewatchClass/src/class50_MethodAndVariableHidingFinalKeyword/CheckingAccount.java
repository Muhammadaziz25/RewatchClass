package class50_MethodAndVariableHidingFinalKeyword;

public class CheckingAccount extends Account {

	private double overdraftLimit;

	public CheckingAccount() {

	}

	public CheckingAccount(int id, int balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(double amount) {

		if(getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println("Overdraft limit reached");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " overdraftLimit=" + overdraftLimit ;
	}
	
	
	
	

}

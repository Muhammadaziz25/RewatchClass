package class50_MethodAndVariableHidingFinalKeyword;

public class SavingsAccount extends Account {

	public SavingsAccount() {

	}

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}
}

package class50_MethodAndVariableHidingFinalKeyword;

public class AccountTester {

	public static void main(String[] args) {

		Account a = new Account(25, 52000);
		CheckingAccount c = new CheckingAccount(10, 24586, -2536);
		SavingsAccount s = new SavingsAccount(17, 23648);
		
		c.setAnnualInterestRate(4.1);
		s.setAnnualInterestRate(17.2);
		
		c.withdraw(2500);
		s.withdraw(3280);
		
		System.out.println(c.toString());
		System.out.println(s.toString());
		
//		char ch = 10;
	}

}

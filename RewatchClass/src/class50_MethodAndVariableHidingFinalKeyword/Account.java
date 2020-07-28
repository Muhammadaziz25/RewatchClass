package class50_MethodAndVariableHidingFinalKeyword;
/**
 * 11.05.2020
 * @author Eagle
 * Task
 *
 */

import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		this(0,0);
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate=0;
		dateCreated = new Date();
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}

	public double getMonthlyInterest() {
		return balance*(getAnnualInterestRate()/100);
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		balance-=amount;
	}

	

	@Override
	public String toString() {
		return "id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated;
	}
	
	

}

package BankAccountApp;

public abstract class Account implements IBaseRate {
	// List common properties for accounts (both checking and savings)
	private String name;
	private String id;
	private double balance;
	protected String accountNum;
	private static int index = 10000;
	protected double rate;
	
	//Constructor to set basic properties and initialize the account
	public Account(String name, String id, double inItDeposit) {
		this.name = name;
		this.id = id;
		balance = inItDeposit;
		this.accountNum = setAccountNum();
		index++;
		setRate();
	}
	
	
	//set account number
	
	private String setAccountNum() {
		String lastTwoOfID = id.substring(id.length() - 2, id.length());
		int uniqueNum = index;
		int randomNum = (int) (Math.random() * Math.pow(10, 3)); //was asked to deliver 3 random digits
		return lastTwoOfID + uniqueNum + randomNum;
				
	}
	
	public void compound() {
		double accruedIntrest = balance * (rate/100);
		balance += accruedIntrest;
		System.out.println("Accrued Intrest: " + accruedIntrest + "$");
		
	}

	public abstract void setRate();
	
	//List common methods- transactions
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing " + amount + "$");
		
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing " + amount + "$");
		
	}
	
	
	public void trensfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Trensfering " + amount + "$" + "to " + toWhere);
		
	}
	
	public void showBalance() {
		System.out.println("Account balance is " + balance + "$");
	}
	
	public void showInfo() {
		System.out.println("NAME: " + name + 
				"\nACCOUNT NUMBER: " +accountNum + 
				"\nBALANCE: " +balance + "\nRATE: " + rate + "%");
	}


}

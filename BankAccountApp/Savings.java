package BankAccountApp;

public class Savings extends Account {

	//List all the specific properties of Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize settings for Savings account properties
	public Savings(String name, String id, double inItDeposit) {
		super(name, id, inItDeposit);
		accountNum = "1" + accountNum;
		setSafetyDepositBox();
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	//List Savings account specific methods 

	public void showInfo() {
		System.out.println("SAVINGS ACCOUNT-");
		super.showInfo();
		System.out.println("Savings Account Features: " + "\nSaftey Deposit Box ID: " + safetyDepositBoxID +
				"\nSaftey Deposit Box Key: " + safetyDepositBoxKey);
	}
}

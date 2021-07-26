package BankAccountApp;

public class Checking extends Account {

	//List all the specific properties of Checking account
	private int debitCardNum;
	private int debitCerdPIN;
	
	//Constructor to initialize settings for Checking account properties
	public Checking(String name, String id, double inItDeposit) {
		super(name, id, inItDeposit);
		accountNum = "2" + accountNum;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
	
	private void setDebitCard() {
	
		debitCardNum = (int)(Math.random() * Math.pow(10, 12));
		debitCerdPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	
	//List Checking account specific methods 
	public void showInfo() {
		System.out.println("CHECKING ACCOUNT-");
		super.showInfo();
		System.out.println("Checking Account Features: " + "\nDebit Card Number: " + debitCardNum +
				"\nDebit Card PIN: " + debitCerdPIN);
	}
}

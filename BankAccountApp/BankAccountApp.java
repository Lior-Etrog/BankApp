package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		//Read a CSV file then create new accounts based on that data
		String file = "C:\\Users\\etrog\\Downloads\\NewBankAccounts.CSV";
		
		List<String[]> newBankAccounts = utilities.CSV.read(file);
		for(String[] bankAccount : newBankAccounts) {
			String name = bankAccount[0];
			String ID = bankAccount[1];
			String accountType = bankAccount[2];
			double inItDeposit = Double.parseDouble(bankAccount[3]);
			
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ID, inItDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, ID, inItDeposit));

			}
			else {
				System.out.println("Errod Reading Account Type");
			}
				
		}
		for(Account acc : accounts) {
			acc.showInfo();
			System.out.println("\n-----------------");
		}
	}

}

package BankAccountApp;

public interface IBaseRate {

	//Method that returns Base Rate
	default double getBaseRate() {
		return 2.5;
	}
}

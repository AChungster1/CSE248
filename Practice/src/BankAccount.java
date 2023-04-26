
public class BankAccount {
	static double interestRate = 2.0;
	static double calculateInterest(double balance) {
		return balance * (interestRate/100);
	}
}

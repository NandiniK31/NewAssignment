package BankApplication;

public class CurrentAccount extends BankAccount {

	static final double minimumBalance = 20000.0;
	static final double interestRate = 0.0;

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Current";
	}

	@Override
	public double getMinimumBalance() {
		// TODO Auto-generated method stub
		return minimumBalance;

	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;

	}
}
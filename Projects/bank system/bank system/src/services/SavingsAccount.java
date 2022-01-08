package services;

public class SavingsAccount extends Account {

	public static final double TAX = 1.005;
	private int monthSurrending;

	// construtores
	public SavingsAccount(int number, String holder, double balance) {
		super(number, holder, balance);
	}

	public SavingsAccount(int number, String holder, double balance, int monthSurrending) {
		super(number, holder, balance);
		this.monthSurrending = monthSurrending;
	}

	// getters and setters
	public int getMonthSurrending() {
		return monthSurrending;
	}

	public void setMonthSurrending(int monthSurrending) {
		this.monthSurrending = monthSurrending;
	}

	// métodos
	public void updateBalance() {
		balance *= (TAX * monthSurrending);
	}

	@Override
	public void withdraw(double amount) {
		updateBalance();
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Saldo insuficiente para saque.");
	}

}
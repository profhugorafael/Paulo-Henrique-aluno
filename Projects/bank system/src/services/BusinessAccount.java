package services;

public class BusinessAccount extends Account {

	// instances
	public static final double TAX_SELIC = 1.031;
	public static final double TAX_CDB = 1.039;
  private double maxLimit;
	private double limit;
	private int monthSurrending;
	private double percentageSelic;
	private double percentageCdb;

	// construtores

	public BusinessAccount(int number, String holder, double balance, double maxLimit, int monthSurrending,
			double percentageSelic, double percentageCdb) {
		super(number, holder, balance);
		this.maxLimit = maxLimit;
    limit = maxLimit;
		this.monthSurrending = monthSurrending;
		this.percentageSelic = percentageSelic;
		this.percentageCdb = percentageCdb;
	}

	public BusinessAccount(int number, String holder, double balance, double limit) {
		super(number, holder, balance);
		this.limit = limit;

	}

	// getters and setters
	public int getMonthSurrending() {
		return monthSurrending;
	}

	public void setMonthSurrending(int monthSurrending) {
		this.monthSurrending = monthSurrending;
	}

	public double getPercentageSelic() {
		return percentageSelic;
	}

	public void setPercentageSelic(double percentageSelic) {
		this.percentageSelic = percentageSelic;
	}

	public double getPercentageCdb() {
		return percentageCdb;
	}

	public void setPercentageCdb(double percentageCdb) {
		this.percentageCdb = percentageCdb;
	}

	public double getLimit() {
		return limit;
	}

	// methods
	@Override
	public void withdraw(double amount) {
		if (amount <= 0) System.out.println("Valor invalido!");
		else {
			if (balance + limit >= amount) {
				balance -= amount;
				if(amount>balance) limit -= amount - balance;
			}	else System.out.println("limite insuficiente!");
		}
	}

  @Override 
  public void deposit(double amount){
    if(limit != maxLimit){
      if(amount > maxLimit){
        limit = maxLimit;
        amount -= limit;
        balance = 0;
        balance += amount;
      }else{
        limit += amount;
        balance += limit;
      } 
    }else{
      balance += amount;
    }
  }


  // função que retorna os ganhos por selic e cdb
}

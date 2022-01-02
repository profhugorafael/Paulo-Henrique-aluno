public class SavingsAccount {
  
  // instances field
  int balance;

  // constructor field
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  // check Balance
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  // deposit money
  public void deposit(int amountToDeposit){
      balance += amountToDeposit;
      System.out.println("You just deposited " + amountToDeposit);
  }

// withdraw money
  public int withdraw(int amountToWithdraw){
      balance -= amountToWithdraw;
      System.out.println("You just withdrew " + amountToWithdraw);
      return amountToWithdraw;
  }
  
  // main function
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    savings.checkBalance();
    savings.withdraw(300);
    savings.checkBalance();
    savings.deposit(600);
    savings.checkBalance();
    savings.deposit(600);
    savings.checkBalance();
  }       
}

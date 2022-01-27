package services;

  public class Account{

    private int number;
    private String holder;
    protected double balance;

    // construtores
    public Account(int number, String holder){
      this.number = number;
      this.holder = holder;
    }

    public Account(int number, String holder, double balance){
      this.number = number;
      this.holder = holder;
      this.balance = balance;
    }

    public int getNumber() {
      return number;
    }

    public String getHolder() {
      return holder;
    }

    public double getBalance() {
      return balance;
    }
   
    // methods
    public void withdraw(double amount){
      if(amount <= 0) System.out.println("Valor invalido!");
      else{
        if(balance >= amount) balance -= amount;
        else System.out.println("Voce nao possui saldo suficiente!");
      }
    }

    public void deposit(double amount){
      if(amount <= 0) System.out.println("Valor inválido!");
      else balance += amount;
    }    

  }
  
  
  
  
  
  
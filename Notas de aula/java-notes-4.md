# Herança 

## Ideia básica

    Classe Mãe
    |
    | - subclasse extendida 1
    | - subclasse extendida 2
    | - ...

**exemplo:**

    Figura Plana
    |
    | - Triangulo
    | - Circunferência
    | - Retângulo
      |
      | - Quadrado
    | - Hexágono


### algumas dicusssões iniciais

```java

// Class Figura - .area()

double l;

public class Quadrado extends Figuras

public Quadrado(){
  super(a, b);
  this.l = a;
}

public Quadrado(double l){
  this.l = l;
}

@Override
public double area(){
  return l*l;
}

```

## keywords

### EXTENDS

palavra necessária para avisar que estamos criando uma subclasse a partir de outra.

Sintaxe: ➕`SubClass.java`
```java
public MySubClass extends MyClass{
  // your subclass code here
}
```

### SUPER

traz para a classe filha, durante os construtores, os estados da classe mãe.

Sintaxe: > 📦`MyClassesPackage` >  ➕`MyClass.java`
```java

  Object parametro;

  // my class constructor
  public Myclass(Object parametro){
    this.parametro = parametro;
  }
```

Sintaxe: > 📦`MyClassesPackage` >  ➕`MySubClass.java`
```java

  Object anotherParametro;

  public MyClass(Object anotherParametro){
    // trago a instance da classe mãe
    super(parametro); 
    // adiciona os da classe filha
    this.anotherParametro = parametro; 
  }

```

### Override

**sobrescreve** na classe filha uma função que, necessariamente, pertence a classe mãe.

Sintaxe: > 📦`MyClassesPackage` >  ➕`MyClass.java`
```java
  //methods
  public void myMethod(){
    System.out.println("I do something");
  }
```

> 📦`MyClassesPackage` >  ➕`MySubClass.java`
```java
  //methods
  @Override
  public void myMethod(){ 
    System.out.println("I do another something");
  } 
```

### PROTECTED

protege uma variável dentro um pacote, isto é, fora do pacote ela será `private` e dentro dele ela será `public`.

> 📦`MyClassesPackage` >  ➕`MyWallet.java`
```java
...
  protected static int money;
...
```
> 📦`MyClassesPackage` >  ➕`MyAccount.java`
```java
  import MyClassesPackage.MyWallet;
...

  public int getMoney(){
    return MyWallet.money; // it works!!!
  }
```
> 📦`Default package` >  ➕`Main.java` (🚨 SYSTEM ERROR)
```java
  import MyClassesPackage.MyWallet;
  ...
  //not works!!!!
  System.out.println(MyWallet.money); 
```
## Como aplicar o conceito de herança

> 📦`services` >  ➕`Account.java`

```java
  package services;

  public class Account{

    private int number;
    private String holder;
    private double balance;

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
```

> 📦`services` >  ➕`SavingsAccount.java`

```java

package services;

public class SavingsAccount extends Account{

    public static final double TAX = 1.005;
    private int monthSurrending;

    // construtores
    public SavingsAccount( ){
      super(number, holder, balance);
    }

    public SavingsAccount( monthSurreding ){
      super(number, holder, balance);
    }

    // getters and setters
    public int getMonthSurrending() {
      return monthSurrending;
    }

    public void setMonthSurrending(int monthSurrending) {
      this.monthsurrending = monthsurrending;
    }

    // métodos
    public void updateBalance(){
      balance *= TAX;
    }

    @Override
    public void withdraw(double amount){
      updateBalance();
      if(balance >= amount) balance -= amount;
      else System.out.println("Saldo insuficiente para saque.");
    }

}

```

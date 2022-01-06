# Static Classes

## Short Brief - Package classes

**bad way**

Main.java:
```java

package Main;

// -------------------------------------------
// Class to register a Town
class Town {

  // ------------------------
  // instances of town
  private int numberOfPeople;

  // ------------------------
  // constructors methods
  public Town(){
  }

  public Town(int numberOfPeople){
    this.numberOfPeople = numberOfPeople;
  }

  // ------------------------
  // getters and setters
  public int getNumberOfPeople( ){
    return numberOfPeople;
  }

  // ------------------------
  // other methods
  public void addBirths(int births){
    System.out.println("O registro de " + births + "novas pessoas foram feitas");
    numberOfPeople += births;
  }

  // ------------------------
  // toString method
  public String toString( ){
    return "Total de pessoas: " + numberOfPeople;
  }

}

// -------------------------------------------

public class Main{

  public static void main(String[] args){

    Town town = new Town(2000);

    town.addBirths(20);

    System.out.println(town);

  }

}

```

## Nosso novo método

A partir de agora estaremos criando pacotes com grupos de classes bem dividas, trazendo profissionalismo e organização do código.

Para isto, você precisa ir até a fonte e manter sua classe Main(*ou alguma de proposta equivalente que vá conter a `void main`*) 
# Criações de `Package`'s

## Short Brief - Package classes

### bad way

Main.java:
```java

package main;

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

Para isto, você precisa ir até a fonte e manter sua classe Main(*ou alguma de proposta equivalente que vá conter a* `void main`) 

### Criar pacotes para receber grupos de classes

> projeto > 📂`src` > 📦`newpackage` > crio um pacote

### Criar classes nos pacotes em programas individuais

Muitas vezes criaremos a `entities` como exemplo, por sempre estarmos criando classes no modelo de entidades.

> 📦`entities` >  ➕`MyClass` > escrevo a minha classe

**observação:** Agora será necessário usarmos a palavra public na frente das classes para que ela se mantenha acessível em outras regiões.

exemplo:

📦 main(*default package*) > ➕ `Main.java`

```java
  package main;

  import entities.Town;

  public class Main{

  public static void main(String[] args){

    Town town = new Town(2000);

    town.addBirths(20);

    System.out.println(town);

  }

}

```

📦 `entities` > ➕ `Town.java`
```java

package entities;

//-------------------------------------------
//Class to register a Town
public class Town {

// ------------------------
// instances of town
	private int numberOfPeople;

// ------------------------
// constructor methods
	public Town() {
	}

	public Town(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

// ------------------------
// getters and setters
	public int getNumberOfPeople() {
		return numberOfPeople;
	}

// ------------------------
// other methods
	public void addBirths(int births) {
		System.out.println("O registro de " + births + " novas pessoas foram feitas");
		numberOfPeople += births;
	}

// ------------------------
// toString method
	public String toString() {
		return "Total de pessoas: " + numberOfPeople;
	}

}

```
# Static keyword

## Motivação

Motivação é não instanciar classes a qual só preciso de métodos. Exemplo comum

📦 `entities` > ➕ `Triangle.java`
```java

  package entities;

  public class Triangle{

    double a, b, c, R;

    // construtor pra formula de heron
    public Triangle(double a, double b, double c){
      this.a = a;
      this.b = b;
      this.c = c;
    }

    // construtor para o círculo circunscrito
    public Triangle(double a, double b, double c, double R){
      this.a = a;
      this.b = b;
      this.c = c;
      this.R = R;
    }

    public double perimetro( ){
      return a + b + c;
    }

    // feito pelo circulo circunscrito
    public double areaCirc( ){
      System.out.println("pelo circunscrito: ");
      double produto = a*b*c;
      return (produto/4*R);
    }

    // feito por heron
    public double areaHeron( ){
      System.out.println("por Heron: ");
      double P = perimetro() / 2.0;
      double produto = (P)*(P-a)*(P-b)*(P-c);
      return ( Math.sqrt(produto) );
    } 

    public string toString( ){
      return "Triangulo de lados "
              + a
              + ", "
              + b
              + ", "
              + c;
    }

  }

```

📦 `main`(default package) > ➕ `Main.java`

```java

  package main;

   import entities.Triangle;

  public class Main{
    public static void main(String[] args){
    
    	Triangle objeto1 = new Triangle(3.0, 3.0, 3.0, 1.7);
      Triangle objeto2 = new Triangle(2.0, 2.0, 2.0);

      System.out.println( objeto1.perimetro() );
      System.out.println( objeto1.areaCirc() );


      System.out.println( objeto2.perimetro() );
      System.out.println( objeto2.areaHeron() );

    }
  }


```

----------

## Versão melhorada



📦 `entities` > ➕ `Triangle.java`
```java

  package entities;

  import java.util.Math;

  public class Triangle{

    public static final double PI = 3.14159267;
    // final -> variável não será alterada.

     public static double perimetro(double a, double b, double c){
      return a + b + c;
    }

    public static double areaCirc(double a, double b, double c, double R){
      System.out.println("pelo circunscrito: ");
      double produto = a*b*c;
      return (produto/4*R);
    }

     // feito por heron
    public static double areaHeron(double a, double b, double c){
      System.out.println("por Heron: ");
      double P = Triangle.perimetro(a, b, c) / 2.0;
      double produto = (P)*(P-a)*(P-b)*(P-c);
      return ( Math.sqrt(produto) );
    } 

  }

```

📦 `main`(default package) > ➕ `Main.java`
```java
package main;

import entities.Triangle;

public class Main{

  public static void main(String[] args){

    System.out.println(Triangle.areaCirc(3.0, 3.0, 3.0, 1.7) );
    System.out.println(Triangle.PI);
    System.out.println(Triangle.areaHeron(2.0, 2.0, 2.0));
    System.out.println(Triangle.perimetro(5.0, 4.0, 11.0));

  }

}

```


# Implementação Mista - Static and non-Static

```java

package entities;

public class Triangle{

  double a, b, c;
  public static final double PI = 3.14159267;  

  public Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public static double calcPerimetro(double a, double b, double c){
    return a+b+c;
  }

  public double perimetro( ){
    return a+b+c;
  }

}

```

```
Triangle.calcPerimetro(2, 2, 2);
Triangle trianguloImportante = new Triangle();
trianguloImportante.perimetro();
Triangulo.calcPerimtro(2.0, 2.0, 2.0);
```
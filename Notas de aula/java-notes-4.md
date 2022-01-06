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
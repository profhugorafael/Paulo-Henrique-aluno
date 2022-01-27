# Orientação a objetos

Basicamente todo objeto é composto por estados + métodos.

> Todo objeto é fruto de uma classe.

> Classe são tipo moldes.

instances -> "instanciar um objeto"
methods -> metódos, funções de um tipo de classe

Molde -> Pessoa
Estados -> nome, idade, altura, telefone.
Método -> Função particular -> escovaDente( escova, pasta )

Pessoa joao;

```java

class Pessoa{

  String nome;
  int idade;
  double peso;
  double altura;
  long telefone; //(inteiro maior)

  public double indiceDeMassaCorporal( ){
    return peso / (altura*altura);
  }

}

public class Main{

  Locale.setDefault(Locale.US);

  public void imprimeAlgo( ){
    System.out.println("Algo na tela");
  }

  public static void main(String[] args){
    Pessoa joao = new Pessoa();

    joao.nome = "Joao Silva";
    joao.idade = 18;
    joao.altura = 1.75;
    jao.peso = 80.0;
    joao.telefone = 2139981012;

    System.out.println(joao.altura);
  }
}

```
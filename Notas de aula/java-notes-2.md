# aprofundando a POO

## Classe

 Toda classe é composta essencialmente por
  - instances (estados) - análogo a propriedades
  - methods (métodos) - coisas que posso fazer com o objeto

  > classes são moldes de produzir objetos.

## estados iniciam a classe

```java

class Pessoa {

  String nome;
  int idade;
  boolean cabeloCortado = false;

}

```

## métodos são aplicados em cima dos objetos criados


```java
Class Pessoa {

  String nome;
  int idade;
  String corteDeCabelo = "curto";

  public void cortarCabelo( String corteDeCabelo ){
    this.corteDeCabelo = corteDeCabelo;
  }
}
```

**obs.:** nesse caso palavra `this` fazer referência ao estado do objeto ao invés do parâmetro.


## Instanciando objetos

```java
  Pessoa joao = new Pessoa();
  joao.cortarCabelo( "longo" );
```

## contrutores

 São maneiras de controlar a criação dos meus objetos

```java
Class Pessoa {

  String nome;
  int idade;
  String corteDeCabelo = "curto";

  public Pessoa( ){

  }

  public Pessoa( String nome ){
    this.nome = nome;
  }

  public void cortarCabelo( String corteDeCabelo ){
    this.corteDeCabelo = corteDeCabelo;
  }
}
```

```java

...
  Pessoa joao = new Pessoa("joao");

```


## Escopo de Classe:

  - estados
  - construtores
  - métodos

## método toString

melhorar System.out.println(joao) para imprimir mais detalhes sobre o objeto joao


```java
Class Pessoa {

  String nome;
  int idade;
  String corteDeCabelo = "curto";

  public Pessoa( ){

  }

  public Pessoa( String nome ){
    this.nome = nome;
  }

  public void cortarCabelo( String corteDeCabelo ){
    this.corteDeCabelo = corteDeCabelo;
  }

  public String toString( ){
    return "Meu nome eh "
            + nome
            + " tenho "
            + idade
            + " anos e meu cabelo está: "
            + corteDeCabelo;
  }
}
```

## Escopo de Classe:

  - estados
  - construtores
  - métodos
  - toString

  
```java
class Pessoa {

  private String nome;
  private int idade;
  private String corteDeCabelo = "curto";

  public Pessoa( ){

  }

  public Pessoa( String nome ){
    this.nome = nome;
  }

  public String getNome( ){
    return nome;
  }

  public int getIdade( ){
    return idade;
  }

  public void setIdade( int idade ){
    this.idade = idade;
  }

  public String getCorteDeCabelo( ){
    return corteCabeloDeCabelo;
  }

  public void cortarCabelo( String corteDeCabelo ){
    this.corteDeCabelo = corteDeCabelo;
  }

  public String toString( ){
    return "Meu nome eh "
            + nome
            + " tenho "
            + idade
            + " anos e meu cabelo está: "
            + corteDeCabelo;
  }
}
```

joao.setIdade(9);

# array e arraylist

```java
  int[] v = {1, 2, 3, 4, 5}

  System.out.println( v[2] );
```

```java
  int[] v = new int[5];

  int[][] v = { {1, 2, 3}, {3, 4, 5}, {5, 6, 7} };
```

.length -> todo vetor tem


retorna o tamanho final do vetor;
ex:
```java
for(int i=0; i< v.length; i++){

}
```


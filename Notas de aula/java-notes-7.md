# Ordem de implementação de uma classe

```java
public class myClass{

  // atributos privados ou particulares
  
  // construtores e sobrecarga de contrutores

  // getters and setters

  // meus métodos

  // toString

  // equals*****
}
```

# Equals

Relembrando quando a equals já apareceu:

```java

  String str = "nome";

  if( str.equals("nome") ) sysout("1");
  else sysout("0");

  // 1
```

## Ideia principal

1. Checar se o objeto passado é do mesmo tipo da variável que estou comparando.

2. Casting do tipo Object para a classe a ser comparada.

3. Comparo todos os atributos.

Fazendo a equals para uma classe genérica:

📦 `Entities` > ➕ `Livro.java`

```java
public class Livro{

  public int ano;
  public String nome;

  public boolean equals( Object obj ){

    return ( (obj instanceof Livro) 
            && (((Livro)obj).getNome() == getNome()) 
            && ... );

  }

} 
```

📦 `Application` > ➕ `App.java`

```java
 public class App{

   public static void main(String[] args){
    
    Livro geometria = new Livro();

    geometria.ano = 1997;
    geometria.nome = "Problemas sem problema";
    
    Livro geometria2 = new Livro();

    geometria2.ano = 1997;
    geometria2.nome = "Problemas sem problema";
    
    if( geometria.equals( geometria2 ) )
      System.out.println("igual!");

   }

 }
```

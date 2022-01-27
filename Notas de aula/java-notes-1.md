# java Bootcamp

## 1. saída de dados

```java
	System.out.println("pulando linha" + " alguma coisa");
	System.out.print("sem pular linha ");
	System.out.printf("tambem funciona\n");
```

quando usar printf?

```java
  double pi = 3.14156792;

  System.out.printf("%.2f \n", pi);
```

```java
  double pi = 3.14156792;
  String nome = "joao";
  int idade = 23;
  double altura = 1.753;

  System.out.printf("%.2f \n", pi);

  System.out.println("O valor de pi eh " + pi);

  System.out.println("O " + nome + " tem " + idade + " e mede " + altura + "m ");

  System.out.printf("O %s tem %d e mede %.2f m \n", nome, idade, altura);
```

## 2. Entrada de Dados

Primeiro precisamos importar para o código o pacote que consegue receber variáveis pelo console:

```java
  import java.util.Scanner;
```

depois ao longo do programa precisamos criar objetos capazes de receber o valor lido e lembrar de encerrá-los quando não houver mais entradas.


  ```java
    Scanner input = new Scanner();

    (...)

    input.close();
  ```

código exemplo:

```java
import java.util.Scanner;
import java.util.Locale;

public class Aula4 {
	public static void main(String[] args) {
		// configuro pra linguagem com ponto
		Locale.setDefault(Locale.US);

		// crio uma variável do tipo scanner
		Scanner input =  new Scanner(System.in);

		String word, line;
		int numero;
		double numeroReal;

		word = input.next();
		numero = input.nextInt();
		numeroReal = input.nextDouble();
		input.nextLine(); // pego um espaço vazio
		line = input.nextLine();

		input.close();

		System.out.println("vc digitou: " + word);
		System.out.println("vc digitou: " + numero);
		System.out.println("vc digitou " + numeroReal);
		System.out.println("A linha eh " + line );
	}
}

```

  obs:

  Tudo que é classe letra miuscula
  Todo resto é CamelCase

## 3. Estruturas condicionais

mesma coisa.

```
 if( condição1 ){
	 código1
 } else if( condição2 ) {
	 código2
 }else if( ... ){
	 código3
 } else {
	 código4
 }
```

## 4. Estruturas de repetição

mesma coisa.

 ### **while sintaxe**
```java
 	while( condição ){
			 
	}
```

**caso menos usado:**

```java
	do{

	}while();
```

### **for sintaxe**

 ``` java
	for( condiçãoInicial ; condiçãoVerdade ; incremento ){
		// código
	}
 ```
 
 exemplo:

 ```
	for(int i=0; i<n; i++){

	}
 ```

 vetor de tamanho 5 -> [ 2, 3, 6, 8, 9 ]

 
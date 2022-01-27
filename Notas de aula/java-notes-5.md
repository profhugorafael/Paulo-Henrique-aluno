# Lists - ArrayLists

ArrayList são basicamente arrays homogeneos sem tamanho fixo, que nos permitem ter melhor controle quando a entrada não possui quantidade de elementos bem definida.

OBS.: também usamos quando os métodos são úteis para o processamento do código

🔴 só conseguimos instanciar listas através de wrapper classes

int -> Integer
double -> Double
String -> String (já é wrapper class)

```java
import java.util.List;
import java.util.ArrayList;

public class Main{

  public static void main(String[] args){

    List <Integer> lista = new ArrayList<>();

  }

}
```

## Métodos das ArrayLists

### 1. ⚙️`.add()`

Basicamente adiciona elementos no final.

`.add(obj)` -> adiciona objeto no final

`.add(int, obj)` -> adiciona objeto no indice do inteiro colocado

```java
  lista.add("Joao");
  lista.add("Maria");
  lista.add("Samuel");
  lista.add(1, "Beatriz");
```

### 2. ⚙️.get()

`.get(int)` -> me diz o valor na posição passada

```java
  lista.get(1); // Beatriz
```

### 3. ⚙️.size()

retorna tamanho.

### 4. ⚙️.remove()

`.remove(int)` -> remove o elemento na posição
`.remove(Object)` -> remove pelo objeto na lista, somente a primeira instancia encontrada

cuidado com a prioridade em listas numéricas

```java
  List <Integer> lista = new ArrayList<>();

  lista.add(1);
  lista.add(2);
  lista.add(4);
  lista.add(8);
  lista.add(5);
  lista.add(2);
  lista.add(1);

  lista.remove(2); // {1, 2, 8, 5, 2, 1}
  lista.remove( (Integer)2 ); //{1, 8, 5, 2, 1} 
```

### ⚙️ 5. `.isEmpty()`

retorna true ou false para caso esteja vazio ou não.

### ⚙️ 6. `.indexOf()`

`.indefOf(Object)` -> retorna a primeira aparição do objeto.

### ⚙️ 7. `.clear()`

remove todos os elementos da lista.
### ⚙️ 8. `.lastIndexOf()`

`.lastIndexOf(Object)` -> retorna a úultima aparição do objeto 
### ⚙️ 9. `.contains()`

`.contains(Object)` -> retorna true ou false se o objeto existe ou não

### ⚙️ . `.removeIf()`
### ⚙️ . `.removeAll()`

voltaremos quando estudarmos coleções

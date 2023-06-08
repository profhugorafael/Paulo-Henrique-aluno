# Sintaxe if-else if-else

``` c++
if ( condição 1 ){
  // código se for verdade
}else if( condição 2){
  // condição se for verdade 2
} ... {
 ...
} else {
  // condição se for verdade ...
}
```

## exemplo 

[flipper - problema codcad](https://neps.academy/br/course/programacao-basica-(codcad)/lesson/fliper)

## operadores

 = -> significa atribuir
 == -> significa consultar se é igual

 a = 3 -> atribua para a o valor 3.
 a == 3 -> retorna verdadeiro ou falso.

## AND -> "e" -> &&

 ```c++
  
  // jeito ruim
  if(condição1){
    if(condição2){
      if(condição3){

      }
    }
  }

  // jeito melhorado
  if(temOvo==true && temManteiga==true){
    // faça algo
  }

  if(true){
    
  }

 true && true -> true
 true && false -> false
 false && true -> false
 false && false -> false
 ```

  > tudo retorna verdadeiro exceto o zero, inclusive numeros negativos

  <br>

## OU -> "ou" -> ||

```c++

  // jeito ruim

  if(condição 1){
    // faça algo
  }

  if(condição2){
    // faça algo
  }

  // jeito melhorado
  if(temPao || temBiscoito){
    // faça algo
  }

 true || true -> true
 true || false -> true
 false || true -> true
 false || false -> false
 ```

## detalhes 

"%"(operador) -> indica o resto por alguma coisa

 94%7 => retorna 3 pois o resto de 94 por 7 é 3

 \n -> pular linha
 ```java
  println("algo") => print("algo\n")
```

# Estruturas de Repetição (while) -> conjução enquanto

``` c++
  while( condição ){
    // faça algo
  }
```

> observação: precisa ter condição de parada

### exemplo

```c++

int i=1;

while(i<=10){
  int temp;
  printf("%d\n", i);
  i++;
}
```


for(condição inicial, condição de parada, incremento){

}


``` c++

  for(int i=0; i<n; i++){

  }

```

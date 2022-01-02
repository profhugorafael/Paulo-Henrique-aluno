PA(1 3 5 7 9) -> razão=2

```
Pa_2 ( 1 4 9 16 25 )
        3 5 7 9
         2 2 2
```

## Conceito de função

 > **Função** é um conjunto de passos bem definidos, com entradas ou não e com saídas ou não.

 escopo:

 ```c++
  <tipo> nomeDaFunção ( <tipo> parametro1 ){
    // seu código
    // retorno do tipo
  } 
 ```

matematicamente:
```
  x pertence aos inteiros;
  f(x) = x+2;

  entrada -> x
  saída -> f(x)

  f(4) = 4+2 = 6;
  entrada -> 4
  saída -> 6
```

no código:
 ```c++
#include <cstdio>

  int somaDois(int x){
    double pi = 3.14159267;
    return parametro + 2;
  }

  int main(const char* args[]){ // começo aqui

    int var; // declaro var
    scanf("%d", &var); // recebo var

    printf("%d\n", somaDois(var) );


    return 0;
  }
 ```

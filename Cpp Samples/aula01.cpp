
// -------------------------------------
// bibliotecas e definições
#include <cstdio> // C standard input and output
#include <math.h> // mathematics header

// -------------------------------------

// %d -> decimal/INT
// %f -> float
// %lf -> long float/Double
// %c -> char

// -------------------------------------

int main(){

  int idade;
  double altura, peso;
  char c;

  printf("escreva sua idade: ");
  scanf(" %d", &idade); 
  printf("\n");

  printf("informe sua altura e peso:");
  scanf(" %lf %lf", &altura, &peso);
  printf("\n");

  double imc = peso/ pow(altura, 2);
  printf("o valor do imc eh %.2lf\n", imc);

  // lógica se-então-senão
  if(imc <=25 && imc >=18) printf("saudavel");
  else if(imc > 25) printf("acima do peso");
  else printf("abaixo do peso");
  
  return 0; 
}
// -------------------------------------

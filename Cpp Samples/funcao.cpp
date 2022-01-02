#include <cstdio>
#include <string>

double calculaArea(double num){
  double pi = 3.14159267;
  return pi*num*num;
}

void imprimeAlgo( ){
  printf("estou imprimindo algo repetitivo\n");
}


int main(int argc, char const *argv[]){

  double raio; //declaro raio
  scanf(" %lf", &raio); //recebo raio

  double area = calculaArea( raio ); // faço area receber o valor do raio

  for(int i=0; i<10; i++){
    printf("Area de raio %d tem valor %lf\n", i, calculaArea(i));
    imprimeAlgo();
  }
  
  return 0;
}

#include <cstdio>

int soma(int x, int y){
  return x+y;
}

int somaDaProgressao(int tamanho){
  int temp = tamanho*(tamanho+1);
  return temp/2;
}

int main(int argc, char const *argv[]){
  
  int a, b;

  scanf(" %d %d", &a, &b);

  printf("a soma eh %d", soma(a, b));
  
  int somaAcumulada=0, tamanho;

  printf("Coloque o tamanho da progressao: ");
  scanf(" %d", &tamanho);

  for(int i=1; i<=tamanho; i++){
    somaAcumulada += i;
  }

  printf("fazendo a conta: %d\n", somaAcumulada);
  printf("pela formula: %d \n", somaDaProgressao(tamanho) );

  return 0;
}

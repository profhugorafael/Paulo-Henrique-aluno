#include <cstdio>

bool verifica( int numero){
    int cont = 0;
    for ( int i=2; i<numero; i++){
        
        if( numero%i==0)    {
            cont++;
        }
    }
    if (cont==0){
        return true;
    } else {
        return false;
    }
}

int fib( int n){

  if(n==1 || n==2) return 1;

  return fib(n-1) + fib(n-2);
}

int fatorial( int n ){
  
  if(n == 1 ) return 1;

  return n * fatorial(n-1);
}

int main(int argc, char const *argv[]){
    
    int x;
    
    scanf("%d", &x);

    if (verifica(x)==true){ 

        printf("o numero %d eh primo" ,x);
    }
    else {
        printf("o numero %d nao eh primo", x);
    }
    return 0;
}

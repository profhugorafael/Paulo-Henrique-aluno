#include <cstdio>

int main(){

  int n=5;

  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
      printf("[%d][%d] ", i, j);
    }
    printf("\n");
  }

  return 0;
}
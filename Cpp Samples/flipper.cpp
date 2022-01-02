#include <cstdio> 

int main(void) {

    int p,r;

    // printf("escreva o valor de p, sendo 0 ou 1");
    scanf( "%d" , &p);
    // printf("\n");
    
    // printf("escreva o valor de r, sendo 0 ou 1");
    scanf( "%d" , &r);
    // printf("\n");

    if( p==1 && r==1)
    {
        printf("A");
    }
    else if ( p==1 && r==0)
    {
        printf("B");
    }
    else if ( p==0)
    {
        printf("C");
    }

    return 0;
}
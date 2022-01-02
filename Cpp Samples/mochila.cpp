//----------------------------------------
// bibliotecas e definições

#include <iostream>
#include <cstring>
#include <algorithm>
#define maxaguenta 1010 //limite de capacidade
#define maxobjetos 1010 //limite de objetos
using namespace std;

//----------------------------------------
// variaveis globais

int dp[maxaguenta][maxobjetos], peso[maxobjetos], valor[maxobjetos];
// uma dp com todos os possíveis estados da mochila
// dois vetores para salvar peso e valor de cada objeto

int capacidade, Nobjetos;
// capacidade e quantidade de objetos

//----------------------------------------
// função da mochila

int mochila(int aguenta, int objeto){

	if(dp[aguenta][objeto] != -1) return dp[aguenta][objeto];
	// se já existiu o calculo eu apenas retorno o valor

	if(aguenta == 0 or objeto > Nobjetos) return 0;
	// se a mochila não aguenta mais ou objetos
	// ou os objetos acabaram, retorno 0

	int caso1; // não coloco o objeto
	// vou manter o quanto a mochila aguenta
	// vou aumentar o indice do objeto que to olhando

	caso1 = mochila(aguenta, objeto+1);

	//testo se a mochila aguenta o objeto
	
	if(aguenta >= peso[objeto]){

		int caso2; // adiciono o objeto na mochila
		// diminuo o peso do objeto no aguenta
		// aumento o indice do objeto que to olhando
		// somo ao caso2 o valor do objeto que inclui

		caso2 = valor[objeto] + mochila(aguenta - peso[objeto], objeto+1);

		dp[aguenta][objeto] = max(caso1, caso2);
		// anoto na dp o caso que retornou maior valor

	}else dp[aguenta][objeto] = caso1;
	// neste else a mochila não aguentava colocar o objeto
	// o melhor vai ser o caso1

	return dp[aguenta][objeto];
}

//----------------------------------------
// função principal

int main(void){

	cin >> capacidade >> Nobjetos;
	// leio a capacidade e o número de objetos

	memset(dp, -1, sizeof(dp)); //função da cstring
	//configuro todas as posições da dp pra -1

	for(int i=1; i<=Nobjetos; i++) cin >> peso[i] >> valor[i];
	//leio o peso e o valor correspondente de cada objeto

	int max = mochila(capacidade, 1);
	// minha função da mochila retorna o valor máximo
	// os parametros são o quanto a mochila aguenta agora
	// e o número do objeto em questão

	cout << max << "\n";

	return 0;
}

//----------------------------------------
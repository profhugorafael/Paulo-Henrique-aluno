import java.util.Scanner;
import java.util.Locale;


class Jogador {

	private String nome;
	private int saques;
	private int bloqueios;
	private int acertos;
	private int saquesCertos;
	private int bloqueiosCertos;
	private int acertosCertos;

	public Jogador() {
		
	}
	
	public Jogador(String nome, int saques, int bloqueios, int acertos, int saquesCertos, int bloqueiosCertos,
			int acertosCertos) {
		this.nome = nome;
		this.saques = saques;
		this.bloqueios = bloqueios;
		this.acertos = acertos;
		this.saquesCertos = saquesCertos;
		this.bloqueiosCertos = bloqueiosCertos;
		this.acertosCertos = acertosCertos;
	}
	

	public String getNome() {
		return nome;
	}

	public int getSaques() {
		return saques;
	}

	public int getBloqueios() {
		return bloqueios;
	}

	public int getAcertos() {
		return acertos;
	}

	public int getSaquesCertos() {
		return saquesCertos;
	}

	public int getBloqueiosCertos() {
		return bloqueiosCertos;
	}

	public int getAcertosCertos() {
		return acertosCertos;
	}

	public String toString() {
		return " O nome do jogador eh " + nome;
	}

}

class Time {

	int numeroDeJogadores;
	Jogador[] equipe = new Jogador[numeroDeJogadores];

	public Time(int numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
	}
	
	public Time(int numeroDeJogadores, Jogador[] equipe) {

		this.numeroDeJogadores = numeroDeJogadores;
		this.equipe = equipe;
	}
	
	public int totalDeSaques() {
		int cont = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {
			cont += equipe[i].getSaques();
		}
		return cont;
	}

	public int totalDeSaquesCertos() {
		int cont = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {
			cont += equipe[i].getSaquesCertos();
		}
		return cont;
	}

	public int totalDeBloqueios() {
		int cont = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {
			cont += equipe[i].getBloqueios();
		}
		return cont;
	}

	public int totalDeBloqueiosCertos() {
		int cont = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {
			cont += equipe[i].getBloqueiosCertos();
		}
		return cont;
	}

	public int totalDeAcertos() {
		int cont = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {
			cont += equipe[i].getAcertos();
		}
		return cont;
	}

	public int totalDeAcertosCertos() {
		int cont = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {
			cont += equipe[i].getAcertosCertos();
		}
		return cont;
	}

	public String toString() {
		String aux = "";
		for (int i = 0; i < numeroDeJogadores; i++) {
			aux += "o jogador " + i + " tem nome " + equipe[i].getNome()+"\n";
		}
		return aux;
	}

}

public class Vetor3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int n= input.nextInt();
		Time azul= new Time(n);
		
		for (int i=0; i<n; i++) {
			String temp=input.next();
			int s,b,a,s1,b1,a1;
			 s=input.nextInt();
			 b=input.nextInt();
			 a=input.nextInt();
			 s1=input.nextInt();
			 b1=input.nextInt();
			 a1=input.nextInt();
			 
			 azul.equipe[i] =new Jogador (temp,s,b,a,s1,b1,a1);
		}
		System.out.printf("POntos de saque: %f %%\n",(double)(azul.totalDeSaquesCertos()/azul.totalDeSaques()) );
	input.close();	
	}

}

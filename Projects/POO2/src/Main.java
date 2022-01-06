import java.util.Locale;

class Pessoa {

	String nome;
	int idade;
	double peso;
	double altura;
	long telefone; // (inteiro maior)

	public double indiceDeMassaCorporal() {
		return peso / (altura * altura);
	}


}

class Livro{
	
	String titulo, autor;
	int numeroPaginas;
	
	public void adicionaPaginas(int incremento) {
		numeroPaginas+= incremento;
		System.out.println("novo numero ded paginas: "+ numeroPaginas);
	}
	
	
}
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Pessoa joao = new Pessoa();

		joao.nome = "Joao Silva";
		joao.idade = 18;
		joao.altura = 1.75;
		joao.peso = 80.0;
		joao.telefone = 2139981012;

		System.out.println(joao.indiceDeMassaCorporal());
		
		
		
		Livro geometria = new Livro();
		
		geometria.titulo = "Geometria123";
		geometria.autor = "Fabio";
		geometria.numeroPaginas = 50;
		geometria.adicionaPaginas(5);
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class EscreverLivros {
 
  BufferedWriter br;
  FileWriter fr;

  public void abrir(String filename) throws IOException{
     fr = new FileWriter(filename);
     br = new BufferedWriter(fr);
  }

  public void ler(String filename) throws IOException{

    try {
      br.newLine();
			String line = "";
      if( line != null ){
        String[] data = line.split(",");
        System.out.println(data[1]);
      }
    }catch (InputMismatchException e){
      System.err.println("Erro na arquivo dos livros!");
    }
    
  }

  public void fechar(){
  }

}

class LerLivros {
 
	public Scanner sc = null;
	public String[] data;

  public void abrir(String filename) {
     try{
			 sc = new Scanner(new File(filename));
		 }catch(IOException e){
			 System.err.println("falha ao abrir!");
		 }
  }

  public void ler(String filename) {

    try {
      if(sc.hasNext()){
				data = sc.nextLine().split(",");
			}else sc = null;
    }catch (InputMismatchException e){
      System.err.println("Erro nos dados dos arquivos!");
    }
    
  }

  public void fechar(){
		if(sc != null) sc.close();
  }

}

class Livro implements Comparable<Livro> {
	
	private String titulo;
	private String autor;
	private int ano;
	private int quantidade;
	
	public Livro(String tit, String aut, int ano, int quant){
		this.titulo = tit;
		this.autor = aut;				
		this.ano = ano;
		this.quantidade = quant;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	public void setTitulo(String tit){
		this.titulo = tit;
	}
	public String getAutor(){
		return this.autor;
	}
	public int getAno(){
		return this.ano;				
	}	
	public int getQuantidade(){
		return this.quantidade;
	}
	public void setQuantidade(int num){
		this.quantidade = num;
	}
	@Override
	public String toString(){
		return this.titulo + ", " + this.autor + ", " + this.ano + ", " + this.quantidade;		 
	}
	 
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj instanceof Livro)
			return (this.getTitulo().equalsIgnoreCase(((Livro) obj).getTitulo()) && 
					this.getAutor().equalsIgnoreCase(((Livro) obj).getAutor()));					 
		return false;
	 }

	@Override
	public int compareTo(Livro liv) {
		return titulo.compareTo(liv.getTitulo());
	}
}


public class Livraria {

	private List<Livro> livros;

	public Livraria() {
		livros = new ArrayList<Livro>();
	}

	public void insereLivro(Livro liv) {
		livros.add(liv);
	}

	public int procurar(Livro liv) {
		int count = 0;
		for (Livro livro : livros) 
			if( livro.equals(liv) ) count++;
		return count;
	}

	public void ordenar() {
		Collections.sort(livros);
	}

	@Override
	public String toString() {
		String aux = "";
		for (Livro livro : livros) {
			aux += livro.toString();
			aux += "\n";
		}
		return aux;
	}

	// importa as figuras do arquivo filename para o vetor de livros
	public void leLivros(String filename) {
		
		LerLivros lerLivros = new LerLivros();

		lerLivros.abrir(filename);

		while( lerLivros.sc != null ){
				lerLivros.ler(filename);
				for (int i=0; i<lerLivros.data.length; i++) {
					System.out.println(lerLivros.data[i]);
				}
		}

		lerLivros.fechar();
		
	}

	// exporta as figuras do vetor vetFiguras para o arquivo filename
	public void escreveLivros(String filename) {		
	}

	public static void menu(){
		System.out.println(
			"######## MENU #########\n"
			+ "1 - Ler arquivo com livros\n"
			+ "2 -Mostrar os livros armazenados na classe ordenados pelo títutlo\n"
			+ "3 - Exportar os livros ordenados por título\n"
			+ "4 - Sair"
		);
	}

	public static void main(String[] args) throws FileNotFoundException {

		Livraria livraria = new Livraria();
		Scanner input = new Scanner(System.in);
		String filename = "";

		while(true){
			menu();
			
			int option = input.nextInt();

			if(option == 4) break; 
			else if( option == 1){
				System.out.print("digite o nome do arquivo: ");
				filename = input.next();
				livraria.leLivros(filename);
			}else if(option == 2){
				System.out.println(livraria);
			}else{
				livraria.escreveLivros(filename);
			}

		}

		input.close();
	}
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Taxable {
	double TAXA = 0.06;

	double calculaImpostoExtra();

	double calculaImposto();
}

interface ExtraTaxable {
	double TAXA_EXTRA = 0.05;

	double calculaImpostoExtra();
}

abstract class Produto implements Taxable, Comparable<Produto> {
	private String descricao;
	private double custo;

	public Produto(String desc, double cst) {
		descricao = desc;
		custo = cst;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getCusto() {
		return custo;
	}

	@Override
	public String toString() {
		return "\nDescricao: " + getDescricao() + "\nPreco " + getCusto();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Produto))
			return false;
		else
			return getDescricao().equals(((Produto) obj).getDescricao()) && getCusto() == ((Produto) obj).getCusto();
	}

	@Override
	public double calculaImposto() {
		return getCusto() * TAXA;
	}

	@Override
	public int compareTo(Produto o) {
		if (preco() == o.preco())
			return 0;
		else if (preco() > o.preco())
			return 1;
		else
			return -1;
	}

	public abstract double preco();

}

class ComparaDescricao implements Comparator<Produto> {
	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.compareTo(p2);
	}
}

class Livro extends Produto {
	private String titulo;
	private String autor;

	public Livro(String desc, String tit, String aut, double pre) {
		super(desc, pre);
		titulo = tit;
		autor = aut;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public double calculaImposto() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Livro))
			return false;
		else
			return super.equals(obj) && getTitulo().equals(((Livro) obj).getTitulo())
					&& getAutor().equals(((Livro) obj).getAutor());
	}

	@Override
	public double preco() {
		return getCusto() + calculaImposto();
	}

	@Override
	public double calculaImpostoExtra() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Alimento extends Produto {
	private double calorias;

	public Alimento(String desc, double cal, double pre) {
		super(desc, pre);
		calorias = cal;
	}

	public double getCalorias() {
		return calorias;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCalorias: " + getCalorias();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Alimento))
			return false;
		else
			return super.equals(obj) && getCalorias() == ((Alimento) obj).getCalorias();
	}

	@Override
	public double preco() {
		return getCusto() + calculaImposto();
	}

	@Override
	public double calculaImpostoExtra() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Bebida extends Produto implements ExtraTaxable {
	private String tipo;

	public Bebida(String desc, String tip, double pre) {
		super(desc, pre);
		tipo = tip;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + getTipo();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Bebida))
			return false;
		else
			return super.equals(obj) && getTipo().equals(((Bebida) obj).getTipo());
	}

	@Override
	public double calculaImpostoExtra() {
		return getCusto() * TAXA_EXTRA;
	}

	@Override
	public double preco() {
		return getCusto() + calculaImposto() + calculaImpostoExtra();
	}
}

public class Supermercado {

	private ArrayList<Produto> produtos;

	public Supermercado() {
		produtos = new ArrayList<Produto>();
	}

	public void inserir(Produto prod) {
		produtos.add(prod);
	}

	public void remover(Produto prod) {
		 produtos.remove(prod);
	}

	public int quantidade() {
		return produtos.size();
	}

	@Override
	public String toString() {
		String prods = "";
		for (Produto item : produtos)
			prods += item;
		return prods;
	}

	public Produto criaProduto(Scanner entrada) {
		int choice = 0;
		String desc;
		double preco;
		System.out.println("Escolha: ");
		System.out.println("1- Alimento " + "2- Livro 3-Bebida");
		
		try{
			choice = entrada.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("A entrada precisa ser um inteiro.");
		}
		
		entrada.nextLine();
		switch (choice) {
		case 1: {
			System.out.println("Voce escolheu o alimento, entre a descricao, preco e as calorias:");
			double calorias;
			try{
				desc = entrada.nextLine();
				preco = entrada.nextDouble();
				entrada.nextLine();
				calorias = entrada.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Algumas das entradas para o Alimento esta invalida");
			}
			entrada.nextLine();
			return new Alimento(desc, calorias, preco);
		}

		case 2: {
			System.out.println("Voce escolheu livro, entre a descricao, preco, titulo e autor: ");
			String titulo, autor;
			try{
				desc = entrada.nextLine();
				preco = entrada.nextDouble();
				entrada.nextLine();
				titulo = entrada.nextLine();
				autor = entrada.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("Algumas das entradas para o Livro esta invalida");
			}
			return new Livro(desc, titulo, autor, preco);
		}

		case 3: {
			System.out.println("Voce escolheu bebida, entre a descricao, preco e tipo: ");
			String tipo;
			try{
				desc = entrada.nextLine();
				preco = entrada.nextDouble();
				entrada.nextLine();
				tipo = entrada.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("Alguma das entradas para a Bebida esta invalida");
			}
			return new Bebida(desc, tipo, preco);
		}

		default:
			System.out.println("Opcao invalida!");
			return null;
		}
	}

	public void ordenar() {
		Collections.sort(produtos);
	}

	public void ordenarPorDescricao() {
		produtos.sort(new ComparaDescricao());
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Supermercado sup = new Supermercado();
		int opcao = 0;
		boolean continua = true;
		
		while(continua) {
			System.out.println("\nO que deseja fazer?");
			
			System.out.println("(1) Inserir produtos\n" 
													+ "(2) Remover produtos\n"
													+ "(3) Ordenar produtos por preco\n"
													+ "(4) Ordenar produtos por descricao\n"
													+ "(5) Visualizar produtos\n"
													+ "(6) Sair");
			
			try{
				opcao = input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("A opcao inserida nao eh um numero!");
			}
			
			input.nextLine();
			switch(opcao) {
				case 1:
					sup.inserir(sup.criaProduto(input));
					break;
				case 2:
						try {
							sup.remover(sup.criaProduto(input));
							System.out.println("Produto removido com sucesso!");
						}catch() {
						}
					break;
				case 3:
					sup.ordenar();
					break;
				case 4:
					sup.ordenarPorDescricao();
					break;
				case 5:
					System.out.println(sup);
					break;
				case 6:{
					System.out.println("PROGRAMA ENCERRADO");
					continua = false;
					break;
				}
				default:
					System.out.println("Opcao invalida!");
			}
		}

	}

}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pessoa {
	private String nome;
	private String sobrenome;
	private String data;
	private long telefone;

	public Pessoa(String nome, String sobrenome, String data, long telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.data = data;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getDataDeNascimento() {
		return data;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long tel) {
		this.telefone = tel;
	}

	public String toString() {
		return "\n ---- NOVO CADASTRO DE PESSOA ---- \n" + " Nome: " + nome + " " + sobrenome + "\n Data de nascimento: "
				+ data + "\n" + " Telefone: " + telefone + "\n ---------------------------------\n";
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		else if (obj == null)
			return false;
		else if (obj instanceof Pessoa) {
			// checando se TODAS as instances sao iguais
			Pessoa temp = (Pessoa) obj;
			return temp.getNome().equals(getNome()) && temp.getSobrenome().equals(getSobrenome())
					&& temp.getDataDeNascimento().equals(getDataDeNascimento()) && temp.getTelefone() == getTelefone();
		} else
			return false;
	}

}

class Aluno extends Pessoa implements Comparable<Aluno> {

	private String curso;
	private int ano;
	private int ra;

	public Aluno(String nome, String sob, String data, long telefone, String curso, int ano, int ra) {
		super(nome, sob, data, telefone);
		this.curso = curso;
		this.ano = ano;
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public int getAno() {
		return ano;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String toString() {
		return "\n ---------------------------------\n" + " Nome do aluno: " + getNome() + " " + getSobrenome()
				+ "\n Data de nascimento: " + getDataDeNascimento() + "\n Telefone: " + getTelefone()
				+ " || Numero de matricula(RA): " + ra + "\n Opcao de curso: " + curso + " || Ano de inicio: " + ano
				+ "\n ---------------------------------\n";
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		else if (obj == null)
			return false;
		else if (obj instanceof Pessoa) {
			// checando se TODAS as instances sao iguais
			Aluno temp = (Aluno) obj;
			return temp.getNome().equals(getNome()) && temp.getSobrenome().equals(getSobrenome())
					&& temp.getDataDeNascimento().equals(getDataDeNascimento()) && temp.getTelefone() == getTelefone()
					&& temp.getCurso().equals(getCurso()) && temp.getRa() == getRa() && temp.getAno() == getAno();
		} else
			return false;
	}

	@Override
	public int compareTo(Aluno other) {
		return getNome().compareTo( other.getNome() );
	}
}

class Turma {

	static List<Aluno> vetor = new ArrayList<>();

	public Turma() {

	}

	public int numeroAlunos() {
		return vetor.size();
	}

	public void adicionaALuno(Aluno aluno) {
		System.out.println("\nAluno(a) Cadastrado com Sucesso!");
		System.out.println(aluno);
		vetor.add(aluno);
	}

	public String toString() {
		String dadosTurma = "\n #### BANCO DE REGISTROS DA TURMA #### \n";

		if (vetor.size() == 0)
			dadosTurma += "\n Nao ha alunos cadastrados!\n\n";

		for (Aluno aluno : vetor) {
			dadosTurma += aluno.toString();
		}

		dadosTurma += "\n #####################################";

		return dadosTurma;
	}

	public ArrayList<Aluno> buscaAluno(String nome) {

		ArrayList<Aluno> nomeSolicitado = new ArrayList<>();
		
		for(int i=0; i < vetor.size(); i++) {
			if( vetor.get(i).getNome().equals(nome) ) nomeSolicitado.add( vetor.get(i) );
		}
		
		return nomeSolicitado;
		
	}

	public boolean removeAluno(int ra) {

		boolean find = false;

		for (int i = 0; i < vetor.size(); i++) {
			if (vetor.get(i).getRa() == ra) {
				find = true;
				System.out.println("\nAluno " + vetor.get(i).getNome() + " " +  vetor.get(i).getSobrenome() + " foi removida com sucesso!\n");
				vetor.remove(i);
			}
		}
		
		if(find == false) System.out.println("Nao foi encontrado aluno com este RA.");

		return find;

	}

	public Aluno lerAluno(Scanner input) {
		
		String nome, sobrenome, curso, data;
		int ano, ra;
		long telefone;

		System.out.print("Insira o nome e o Sobrenome da pessoa que deseja cadastrar: ");
		nome = input.next();
		sobrenome = input.next();
		System.out.print("Insira a data de nascimento: ");
		data = input.next();
		System.out.print("Insira o telefone sem o ddd: ");
		telefone = input.nextLong();
		System.out.print("Insira o curso em que o aluno deseja se matricular: ");
		curso = input.next();
		System.out.print("Insira o ano de matricula: ");
		ano = input.nextInt();
		System.out.print("Insira o numero de matricula do aluno: ");
		ra = input.nextInt();				
		
		return new Aluno(nome, sobrenome, data, telefone, curso, ano, ra);
		
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option;

		Turma turma = new Turma();

		System.out.println(" ---- MENU: SISTEMA DE CADASTRO E CONSULTA ---- ");
		System.out.println(" As seguintes opcoes estao disponiveis: ");
		System.out.println(" 1 - Cadastrar um novo aluno ");
		System.out.println(" 2 - Apresentar a turma atual");
		System.out.println(" 3 - Remover um aluno pelo RA");
		System.out.println(" 4 - Buscar um aluno por seu nome ");
		System.out.println(" 5 - Ordenar a turma por comparator ");
		System.out.println(" 0 - Encerrar Sistema de Cadastro e Consulta");
		System.out.println("------------------------------------------------");
		System.out.print("Digite uma opcao: ");

		option = input.nextInt();

		if (option == 0) {
			System.out.println("\nSistema encerrado! :)");
			System.out.println("-----------------------------------------------");
		}

		while (option != 0) {

			switch (option) {
			case 1:
				turma.adicionaALuno( turma.lerAluno(input) );
				break;
			case 2:
				System.out.println(turma);
				break;
			case 3:
				System.out.print("\nDigite o RA do aluno a ser removido: ");
				turma.removeAluno(input.nextInt());
				break;
			case 4:
				System.out.print("\nDigite o nome que deseja buscar na turma: ");
				ArrayList<Aluno> mesmoNome = turma.buscaAluno( input.next() );
				System.out.println("\nAlunos encontrados com o nome " + mesmoNome.get(0).getNome() + ":\n");
				for(Aluno aluno: mesmoNome) System.out.print( aluno );
				break;
			case 5:
				System.out.println("\n Turma ordenada com sucesso! \n");
				Collections.sort( vetor );
				break;
			default:
				System.out.println("\n Escolha invalida! Tente novamente.\n");
				break;
			}

			System.out.println(" ---- MENU: SISTEMA DE CADASTRO E CONSULTA ---- ");
			System.out.println(" As seguintes opcoes estao disponiveis: ");
			System.out.println(" 1 - Cadastrar um novo aluno ");
			System.out.println(" 2 - Apresentar a turma atual");
			System.out.println(" 3 - Remover um aluno pelo RA");
			System.out.println(" 4 - Buscar um aluno por seu nome ");
			System.out.println(" 5 - Ordenar a turma por comparator ");
			System.out.println(" 0 - Encerrar Sistema de Cadastro e Consulta");
			System.out.println("------------------------------------------------");
			System.out.print("Digite uma opcao: ");

			option = input.nextInt();

			if (option == 0) {
				System.out.println("\nSistema encerrado!");
				System.out.println("-----------------------------------------------");
			}
		}
	}
}

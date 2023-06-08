
class Pessoa{

  String nome;
  int idade;
  double peso;
  double altura;
  long telefone; //(inteiro maior)

  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public Pessoa(String nome, int idade, double peso, double altura){
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
 }

 public void ganharTelefone(long telefone){
   this.telefone = telefone;
 }

  public double indiceDeMassaCorporal( ){
    return peso / (altura*altura);
  }

}

public class Main{

  Locale.setDefault(Locale.US);

  public void imprimeAlgo( ){
    System.out.println("Algo na tela");
  }

  public static void main(String[] args){
    Pessoa joao = new Pessoa("joao silva", 18);

    joao.ganharTelefone(2139981012);

    System.out.println(joao.altura);
  }
}

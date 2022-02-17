/*

  sistema de banco

  cadastrar um novo usu�rio
    - nome
    - valor em conta

  opera��es
    - adicionarSaldo
    - removerSaldo
    - consultarSaldo : toString()
    - fazerEmpr�stimo( *1.45) 
*/
import java.util.Locale;
class Conta{

  String nome;
  double saldo;
  double divida;

  public Conta(String nome, double saldo){
    this.nome = nome;
    this.saldo = saldo;
  }

  public Conta (String nome, double saldo, double divida){
    this.nome = nome;
    this.saldo = saldo;
    this.divida = divida;
  }

  public void adicionarSaldo(double incremento){
    saldo += incremento;
  }

  public void removerSaldo(double decremento){
    saldo -= decremento;
  }

  public void pedirEmprestimo(double valorSolicitado){

    if( saldo >= (valorSolicitado/3) ){
      saldo += valorSolicitado;
      divida += valorSolicitado*(1.35);
    }

  }

  public String toString(){
    return "O " 
            + nome
            + " possui " 
            + saldo 
            + " reais e esta devendo"
            + divida;
  }

}

public class Banco{

  public void menu();
  public static void main(String[] args){
      Locale.setDefault(Locale.US);

    Conta joao = new Conta("joao", 1000.00);

    joao.adicionarSaldo(1000.00);
    System.out.println(joao);

    joao.removerSaldo(1000.00);
    System.out.println(joao);

    joao.pedirEmprestimo(500.00);
    System.out.println(joao);

    System.out.println(joao);

  }

  public void menu(){
    System.out.println("menu");
  }

}

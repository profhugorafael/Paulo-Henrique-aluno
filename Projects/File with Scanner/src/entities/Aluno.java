package entities;

public class Aluno {
  
  private String nome;
  private Integer idade;
  private String sexo;
  private Long matricula;
  
  public Aluno(String nome, Integer idade, String sexo, Long matricula) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Long getMatricula() {
    return matricula;
  }

  public void setMatricula(Long matricula) {
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return "Aluno: " +  nome + " || Matricula: " + matricula;
  } 

}

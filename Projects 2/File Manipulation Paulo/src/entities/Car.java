package entities;

import java.util.Scanner;

public class Car {
  
  private String proprietario;
  private Double valor;
  private Integer ano;
  private String marca;
  private String placa;
  
  public Car() {
  }

  public Car(String proprietario, Double valor, Integer ano, String marca, String placa) {
    this.proprietario = proprietario;
    this.valor = valor;
    this.ano = ano;
    this.marca = marca;
    this.placa = placa;
  }

  public Car(String buffer){
    String[] data = buffer.split(",");
    this.proprietario = data[0];
    this.valor = Double.parseDouble(data[1]);
    this.ano = Integer.parseInt(data[2]);
    this.marca = data[3];
    this.placa = data[4];
  }

  public String getProprietario() {
    return proprietario;
  }

  public void setProprietario(String proprietario) {
    this.proprietario = proprietario;
  }
  
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Integer getAno() {
    return ano;
  }

  public String getMarca() {
    return marca;
  }

  public String getPlaca() {
    return placa;
  }

  @Override
  public String toString() {
    return "------------------\n ano=" 
            + ano 
            + "\n marca=" 
            + marca 
            + "\n placa=" 
            + placa 
            + "\n proprietario=" 
            + proprietario 
            + "\n valor="
            + valor;
  }

}

package entities;

public abstract class Shape {
 
  // atributos privados ou particulares
  private String color;

  // construtores e sobrecarga de contrutores
  public Shape(String color){
    this.color = color;
  }
  
  // getters and setters
  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  // meus metodos
  public abstract Double area();

  // to string
  public String toString(){
    return "Color = " + color;
  }

}
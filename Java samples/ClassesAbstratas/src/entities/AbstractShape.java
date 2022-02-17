package entities;

public abstract class AbstractShape implements Shape{
 
  // atributos privados ou particulares
  private String color;

  // construtores e sobrecarga de contrutores
  public AbstractShape(String color){
    this.color = color;
  }
  
  // getters and setters
  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  // to string
  public String toString(){
    return "Color = " + color;
  }

}
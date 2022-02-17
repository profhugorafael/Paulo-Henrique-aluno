package entities;

public class Rectangle extends AbstractShape {
  
  private Double width;
  private Double height;
  
  public Rectangle(String color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double area() {
    return width*height;
  }

  @Override
  public String toString() {
    String aux = super.toString();
    return aux 
          + "\n"
          + "Width = " + width
          + "\n"
          + "Height = " + height;
  }

}

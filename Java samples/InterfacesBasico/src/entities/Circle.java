package entities;

import entities.enums.Color;

public class Circle extends AbstractShape {

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area() + "]";
	}

	@Override
	public Double area() {
		return 3.1415 * radius * radius;
	}

}

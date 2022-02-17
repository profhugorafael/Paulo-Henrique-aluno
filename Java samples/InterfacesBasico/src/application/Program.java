package application;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Rectangle(Color.RED, 2.0, 3.0);

		System.out.println(s1);
		System.out.println(s2);
	}

}

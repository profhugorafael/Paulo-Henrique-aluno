package app;

import entities.*;

public class App {
    public static void main(String[] args) {

        Shape r1 = new Rectangle("azul", 6.0, 2.0);

        System.out.println(r1);
        System.out.println(r1.area());

    }
}

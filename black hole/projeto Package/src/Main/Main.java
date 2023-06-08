package Main;

import entities.Town;

// -------------------------------------------

public class Main{

  public static void main(String[] args){

    Town town = new Town(2000);

    town.addBirths(20);

    System.out.println(town);

  }

}

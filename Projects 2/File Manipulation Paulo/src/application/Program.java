package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Car;

public class Program {
  
  public static List <Car> concessionaria = new ArrayList<>();
  public static void main(String[] args) {
    
    String path = "populacao_municipiossp.csv";

    try (BufferedReader input = new BufferedReader( new FileReader( path ) )){
      String line;
      input.readLine();

      while( (line = input.readLine()) != null ){
        System.out.println(line);
      }

      input.close();
    }catch(IOException e){
      System.err.println("Erro!");
      e.printStackTrace();
    }
    
  }

}
